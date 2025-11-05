package view;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.TargetVO;
import model.UserVO;

public class UserView {
	
	  Scanner sc = new Scanner(System.in);
	  Random rd = new Random();
	  
	  UserVO uvo= new UserVO();
	
	public int showMenu() {	      
	      
		System.out.println("=====할일 관리 프로그램=====");
  	    System.out.println("[1] 회원가입 [2] 로그인 [3] 프로그램 종료 ");
			
		int choice = sc.nextInt();
		  
		return choice;
	      
	}
	
	
	public UserVO join() {	      
	      
		System.out.println("=====회원가입=====");
  	    System.out.print("ID 입력 : ");
  	    String id = sc.next();
  	    System.out.print("USERNAME 입력 : ");
  	    String username = sc.next();
  	    System.out.print("PASSWORD 입력 : ");
  	    String password = sc.next();
  	    System.out.print("AGE 입력 : ");
  	    int age = sc.nextInt();
  	    
  	    UserVO uvo = new UserVO(id, username, password, age);
		  
		return uvo;
	      
	}
	
	public void statusJoin(int row) {
	      if (row > 0) {
	         System.out.println("회원가입 성공");
	      } else {
	         System.out.println("회원가입 실패");
	      }
	}
	
	
	
	public UserVO login() {	      
	      		
  	    System.out.print("ID 입력 : ");
  	    String id = sc.next();
  	    
  	    System.out.print("PASSWORD 입력 : ");
  	    String password = sc.next();
  	    
  	    UserVO uvo = new UserVO(id, password);
		  
		return uvo;
	      
	}
	
	
	public boolean statusLogin(String result_name) {	      
  		
		boolean result = false;
		
		 if (result_name != null) {
	         System.out.println("로그인 성공");
	         System.out.println(result_name+"님이 로그인하셨습니다.");
	         result = true;
	         
	      } else {
	         System.out.println("로그인 실패");
	         result = false;
	      }
		 
		 return result;
		 
		 
	      		 
	}
	
	
	public TargetVO insertTarget(UserVO uvo) {
	     
		System.out.print("오늘 공부 목표 시간을 등록해주세요 : ");
		int tempTargetTime = sc.nextInt();
		
		String tempId = uvo.getId();
		
		TargetVO tvo = new TargetVO(tempId, tempTargetTime);
		
		return tvo;
		
	}
	
	public void statusTarget(int row) {
	      if (row > 0) {
	         System.out.println("오늘 목표시간 등록이 완료되었습니다. 공부를 시작해주세요.");
	         System.out.println();
	      } else {
	         System.out.println("목표시간 등록 실패");
	         System.out.println();
	      }
	}
	
	
	public TargetVO insertStudy(TargetVO tvo) {
	     
		System.out.println("하단에 오늘 공부한 내용을 등록해주세요.");
		System.out.println();
		
		System.out.print("오늘 공부한 과목명을 입력해주세요 : ");
		String tempSubject = sc.next();
		
		System.out.print("오늘 공부한 내용 : ");
		String tempContents = sc.next();
		
		System.out.print("오늘 공부 한 시간을 입력해주세요 : ");
		int tempStudyTime = sc.nextInt();
		System.out.println();
		
		String tempId = tvo.getId();
		int tempTargetTime = tvo.getTargetTime();
		
		TargetVO tvo2 = new TargetVO(tempId, tempSubject, tempContents, tempTargetTime, tempStudyTime);
		//String tempId = tvo.getId();
		
		return tvo2;
		
	}
	
	public int selectWiseSaying() {
	      System.out.println("===명언 출력===");
	      int num = rd.nextInt(1)+1;
	      
	      return num;
	      
	}
	
	public void selectWiseSayingPrint(String i) {
	      System.out.println(i);
	      
	}
	
	
	public void selectStudy(UserVO uvo) {
		  System.out.println("");  
		  System.out.println(uvo.getId() + "님의 현재까지의 공부 시간 : ");    
	}
	
	public void statusStudyTime(ArrayList<TargetVO> tvolist) {
		
		if(tvolist != null) {
			for(TargetVO tvo:tvolist) {
			      System.out.println("<통계>");
			      System.out.print("총 목표시간 : " + tvo.getTargetTime() + "시간	");
			      System.out.print("총 공부한 시간 : " + tvo.getStudyTime() + "시간");
			      System.out.println();
			      
			      double num = ((double)tvo.getStudyTime()/(double)tvo.getTargetTime()) * 100;
			      
			      double rounded = Math.round(num * 10) / 10.0;
			      
			      System.out.print("달성률 : " + rounded + "%");
			      System.out.println();
			      			      
			}	            
			System.out.println();
		}
	}
	
}
