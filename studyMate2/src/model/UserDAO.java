package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1524:xe";
			String user = "campus_25IS_GA2_P1_1";
			String password = "smhrd1";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getClose() {
		try {
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int signUp(UserVO uvo) {
		int row = 0;
		getConn();
		try {
			String sql = "INSERT INTO SMUSER VALUES (?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, uvo.getUser_id());
			psmt.setString(2, uvo.getPw());
			psmt.setString(3, uvo.getName());
			psmt.setInt(4, uvo.getAge());

			row = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}

	public UserVO signIn(UserVO uvo) {

		String result_name = null;
		String result_id = null;
		String result_pw = null;
		int result_age = 0;
		UserVO vo = new UserVO();
		getConn();
		String sql = "SELECT * FROM SMUSER WHERE USER_ID=? AND PW=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, uvo.getUser_id());
			psmt.setString(2, uvo.getPw());

			rs = psmt.executeQuery();
			if (rs.next()) {
				result_name = rs.getString("name");
				result_id = rs.getString("user_id");
				result_pw = rs.getString("pw");
				result_age = rs.getInt("age");
				vo.setAge(result_age);
				vo.setName(result_name);
				vo.setPw(result_pw);
				vo.setUser_id(result_id);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return vo;
	}

	public int setGoal(GoalsVO gvo) {

		int row = 0;
		try {
			getConn();
			String sql = "INSERT INTO GOALS (GOALS_ID, NOW_DATE, MATH_GOAL_TIME, ENG_GOAL_TIME, USER_ID) "
					+ "SELECT GOALS_SEQ.NEXTVAL, SYSDATE, ?, ?, S.USER_ID " + "FROM SMUSER S WHERE S.USER_ID = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, gvo.getMath_goal_time());
			psmt.setInt(2, gvo.getEng_goal_time());
			psmt.setString(3, gvo.getUser_id());
			System.out.println(gvo.getMath_goal_time());
			System.out.println(gvo.getEng_goal_time());
			System.out.println(gvo.getUser_id());

			row = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;

	}

	public int input(GoalsVO gvo) {
		int row = 0;
		getConn();
		String sql = "UPDATE GOALS SET MATH_INPUT_TIME =? , ENG_INPUT_TIME=? WHERE USER_ID=?";
		try {
			psmt = conn.prepareStatement(sql);
			System.out.println("수학 점수 : " + gvo.getMath_input_time());
			psmt.setInt(1, gvo.getMath_input_time());
			System.out.println("영어 점수 : " + gvo.getEng_input_time());
			psmt.setInt(2, gvo.getEng_input_time());
			System.out.println("아이디: " + gvo.getUser_id());
			psmt.setString(3, gvo.getUser_id());
			row = psmt.executeUpdate();
			System.out.println("업데이트 확인 : " + row);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}

	public GoalsVO searchRecord(UserVO uvo) {
		getConn();
		int math_result = 0;
		int eng_result = 0;
		GoalsVO gvo = new GoalsVO();
		try {
			
			String sql = "SELECT MATH_ACCUMULATED_TIME , ENG_ACCUMULATED_TIME FROM GOALS WHERE USER_ID=? ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, uvo.getUser_id());
			rs = psmt.executeQuery();
			while (rs.next()) {
				math_result = rs.getInt("math_accumulated_time");
				eng_result = rs.getInt("eng_accumulated_time");
				gvo.setMath_accumulated_time(math_result);
				gvo.setEng_accumulated_time(eng_result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gvo;

	}

}
