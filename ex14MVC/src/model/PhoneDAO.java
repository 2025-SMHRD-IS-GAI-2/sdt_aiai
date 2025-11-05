package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PhoneDAO {
	PreparedStatement psmt = null;
	Connection conn = null;
	ResultSet rs = null;

	// 2. 메서드
	// DB 드라이버 로딩 ~ DB 연결 메서드
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

	// 자원 반납 메소드
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
	}

	// 전화번호 추가 기능
	public int insertPhoneNum(PhoneVO pvo) {
		getConn();

		String sql = "insert into phone values(?,?,?)";
		int row = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, pvo.getName());
			psmt.setString(2, pvo.getPhoneNum());
			psmt.setInt(3, pvo.getAge());

			row = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}

// 전체 조회 기능
	public ArrayList<PhoneVO> selectAll() {

		getConn();
		String sql = "select * from phone";
		ArrayList<PhoneVO> pvoList = new ArrayList<PhoneVO>();

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {// rs.next : 커서객체
				String result_name = rs.getString("name");
				String result_phoneNum = rs.getString("phonenum");
				int result_age = rs.getInt("age");
				// ㄴ 한줄의 객체
				PhoneVO pvo = new PhoneVO(result_name, result_phoneNum, result_age);
				// return 키워드 : 메소드를 반환하는 키워드
				// 메소드, 반복문을 종료하는 기능

				pvoList.add(pvo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return pvoList;
	}// 삭제 기능
public int delete(PhoneVO pvo) {
		
		int row = 0; 
		try {
			// 1. DB 연결
			getConn();
			// 2. SQL 구문 작성
			String sql = "delete from phone where name = ?and phonenum = ?";
			// 3. SQL을 전송할 준비
			psmt = conn.prepareStatement(sql);

			// 4. 데이터 바인딩 작업( 물음표 채워주는 작업 ) 
			psmt.setString(1, pvo.getName());
			psmt.setString(2, pvo.getPhoneNum());
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
}