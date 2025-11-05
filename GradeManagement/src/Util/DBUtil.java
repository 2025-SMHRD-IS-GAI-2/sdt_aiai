package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	
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
		   
		   // 자원 반납 메서드
		   public void getClose() {
		      try {
		         if (psmt != null) {
		            psmt.close();
		         }
		         if(conn!= null) {
		            conn.close();
		         }
		      } catch (SQLException e) {
		         e.printStackTrace();
		      }
		   }
}
