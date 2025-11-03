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
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "12345";
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
			String sql = "INSERT INTO STUDYMATE VALUES(?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, smvo.getId());
			psmt.setString(2, smvo.getPw());
			psmt.setString(3, smvo.getName());
			psmt.setInt(3, smvo.getAge());
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
			String sql = "select * from studymate where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, smvo.getId());
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

	}//1
}
