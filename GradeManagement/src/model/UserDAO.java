package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Util.DBUtil;


public class UserDAO {
	
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
	
	 public int join(UserVO uvo) {
	      int row =0;
	      try {
	    	 getConn();
	         String sql = "INSERT INTO USERJOIN VALUES(?,?,?,?)";
	         psmt = conn.prepareStatement(sql);
	         psmt.setString(1, uvo.getId());
	         psmt.setString(2, uvo.getPassword());
	         psmt.setString(3, uvo.getUsername());
	         psmt.setInt(4, uvo.getAge());
	         row = psmt.executeUpdate();
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }finally {
	         getClose();
	      }
	      
	      return row;
	   }
	 
	 
	 public String login(UserVO uvo) {
	      String result_name=null;
	      try {
	         getConn();
	         String sql = "select * from userjoin where id =? and password = ?";
	         psmt = conn.prepareStatement(sql);
	         psmt.setString(1, uvo.getId());
	         psmt.setString(2, uvo.getPassword());
	         rs=psmt.executeQuery();
	          if(rs.next()==true) {
	              result_name = rs.getString("username");
	          }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }finally {
	         getClose();
	      }
	       return result_name;
	   }
	 
	 
	 public int insertTarget(TargetVO tvo) {
	      int row =0;
	      try {
	    	 getConn();
	         String sql = "INSERT INTO STUDYTARGET (id, TargetTime, seq, regdate) VALUES(?,?,USER_SEQ.NEXTVAL,sysdate)";
	         psmt = conn.prepareStatement(sql);
	         psmt.setString(1, tvo.getId());
	         psmt.setInt(2, tvo.getTargetTime());
	         row = psmt.executeUpdate();
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }finally {
	         getClose();
	      }	      
	      return row;
	   }
	 
	 public int insertContents(TargetVO tvo) {
	      int row =0;
	      try {
	    	 getConn();
	         String sql = "INSERT INTO STUDYCONTENTS (id, CONTENTS, SUBJECT, TARGETTIME, STUDYTIME, REGDATE) VALUES(?,?,?,?,?,sysdate)";
	         psmt = conn.prepareStatement(sql);
	         psmt.setString(1, tvo.getId());
	         psmt.setString(2, tvo.getContents());
	         psmt.setString(3, tvo.getSubject());
	         psmt.setInt(4, tvo.getTargetTime());
	         psmt.setInt(5, tvo.getStudyTime());
	         row = psmt.executeUpdate();
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }finally {
	         getClose();
	      }	      
	      return row;
	   }
	 
	 
	 public String selectWiseSaying(int i) {
	      String result_name=null;
	      try {
	         getConn();
	         String sql = "select contents from wisesaying where no =?";
	         psmt = conn.prepareStatement(sql);
	         psmt.setInt(1, i);
	         
	         rs=psmt.executeQuery();
	          if(rs.next()==true) {
	              result_name = rs.getString("contents");
	          }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }finally {
	         getClose();
	      }
	       return result_name;
	   }
	 
	 
	 public ArrayList<TargetVO> selectStudyTime(UserVO uvo) {
	      int targettime=0;
	      int studytime=0;
	      
	      ArrayList<TargetVO> tvoList = new ArrayList<>();
	      
	      try {
	         getConn();
	         String sql = "select sum(targettime) targettime, sum(studytime) studytime from studycontents where id =?";
	         psmt = conn.prepareStatement(sql);
	         psmt.setString(1, uvo.getId());
	         
	         rs=psmt.executeQuery();
	          
	         while(rs.next()) {
	        	  targettime = rs.getInt("targettime");
	              studytime = rs.getInt("studytime");
	              
	              TargetVO pvo = new TargetVO(targettime, studytime);
					// return 키워드 : 메소드를 반환하는 키워드
					// 메소드, 반복문을 종료하는 기능
	              tvoList.add(pvo);
	          }
	          
	          
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }finally {
	         getClose();
	      }
	       return tvoList;
	   }
	
}
