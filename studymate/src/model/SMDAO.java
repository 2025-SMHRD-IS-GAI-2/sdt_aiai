package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SMDAO {
	Scanner sc = new Scanner(System.in);
	PreparedStatement psmt = null;
	Connection conn = null;
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
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// 회원가입 메서드

	public int join(SMVO smvo) {
		int row = 0;
		try {
			getConn();
			String sql = "INSERT INTO SMUSER VALUES(?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, smvo.getUser_id());
			psmt.setString(2, smvo.getPw());
			psmt.setString(3, smvo.getName());
			psmt.setInt(4, smvo.getAge());
			row = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}

	// 로그인 메서드
	public String login(SMVO smvo) {
		String result_name = null;
		try {
			getConn();
			String sql = "select * from smuser where user_id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, smvo.getUser_id());
			psmt.setString(2, smvo.getPw());

			// ? 인자 채워주기

			// select
			rs = psmt.executeQuery();
			if (rs.next()) {

				result_name = rs.getString("name");

			}
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			getClose();
		}
		return result_name;

	}

	public int delete(SMVO smvo) {

		int row = 0;
		try {
			// 1. DB 연결
			getConn();
			// 2. SQL 구문 작성
			String sql = "delete from smuser where user_id = ?and pw = ?";
			// 3. SQL을 전송할 준비
			psmt = conn.prepareStatement(sql);

			// 4. 데이터 바인딩 작업( 물음표 채워주는 작업 )
			psmt.setString(1, smvo.getUser_id());
			psmt.setString(2, smvo.getPw());
			// 5. SQL문 실행
			row = psmt.executeUpdate();

			// ? 인자 채워주기

			// select

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			getClose();
		}
		return row;
	}

	public int setInfo(SMVO smvo) {
		int row = 0;
		try {
			getConn();
			
			String sql = "insert into goals (now_date, goals_id, math_goal_time, math_input_time, math_accumulated_time,eng_goal_time, eng_input_time, eng_accumulated_time,user_id)values(sysdate, goals_seq.nextval,?,?,0,0,0,0,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, smvo.getMath_goal_time());
			psmt.setInt(2, smvo.getMath_input_time());
			psmt.setString(3, smvo.getUser_id());
			row = psmt.executeUpdate();
			if(row>0) {
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;

	}

	public int setInfo2(SMVO smvo) {
		int row = 0;
		try {
			getConn();
//			System.out.println("test : " + smvo.getEng_input_time());
//			System.out.println("test22 : " + smvo.getMath_goal_time());
			conn.setAutoCommit(false);
			String sql ="INSERT INTO goals (now_date, goals_id, math_goal_time, math_input_time, math_accumulated_time, eng_goal_time, eng_input_time, eng_accumulated_time, user_id) "
	                   + "VALUES (SYSDATE, goals_seq.NEXTVAL, 0, 0, 0, ?, ?, 0, ?)";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, smvo.getEng_goal_time());
			psmt.setInt(2, smvo.getEng_input_time());
			psmt.setString(3, smvo.getUser_id());
			row = psmt.executeUpdate();
			System.out.println("🔍 UPDATE row count = " + row);
			if(row>0) {
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}

}