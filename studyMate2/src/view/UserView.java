package view;

import java.util.Scanner;

import model.GoalsVO;
import model.UserVO;

public class UserView {

	Scanner sc = new Scanner(System.in);
	
	public int showMenu() {
		System.out.println("비회원은 회원가입, 회원은 로그인: ");
		System.out.println("[1] 회원가입 [2] 로그인");
		int choice = sc.nextInt();
		return choice;
	}

	public UserVO showSignUp() {

		System.out.println("아이디 입력: ");
		String user_id = sc.next();
		System.out.println("비밀번호 입력: ");
		String pw = sc.next();
		System.out.println("이름 입력: ");
		String name = sc.next();
		System.out.println("나이 입력: ");
		int age = sc.nextInt();
		UserVO uvo = new UserVO(user_id, pw, name, age);

		return uvo;

	}

	public void statusSignUp(int row) {
		
		if (row > 0) {
			System.out.println("회원가입 성공!");
		} else {
			System.out.println("회원가입 실패!");
		}
	}

	public UserVO showSignIn() {
		
		System.out.println("아이디 입력: ");
		String user_id = sc.next();
		System.out.println("비밀번호 입력: ");
		String pw = sc.next();
		UserVO uvo = new UserVO();
		uvo.setUser_id(user_id);
		uvo.setPw(pw);
		
		return uvo;
	}

	public void statusSignIn(String result_name) {
		
		if (result_name!=null) {
			System.out.println("사인인 성공!");
		} else {
			System.out.println("사인인 실패!");
		}
		
	}

	public GoalsVO showSetGoal() {
		
		System.out.println("====== 오늘의 학습 목표 입력 ===== ");
		System.out.print("수학 목표 학습 시간 입력: ");
		int math_goal_time = sc.nextInt();
		System.out.print("영어 목표 학습 시간 입력: ");
		int eng_goal_time = sc.nextInt();
		//System.out.println("아이디 입력: ");
		//String user_id = sc.next();
		GoalsVO gvo = new GoalsVO();
		
		gvo.setMath_goal_time(math_goal_time);
		gvo.setEng_goal_time(eng_goal_time);
		//gvo.setUser_id(user_id);
		
		return gvo;
		
	}

	public void statusSetGoal(int row) {
		
		if (row > 0) {
			System.out.println("목표시간 등록 성공!");
		} else {
			System.out.println("목표시간 등록 실패!");
		}		
	}
	
	public int showInput() {
		
		System.out.println("======== 서비스 선택 ======== ");
		System.out.println("[1] 학습 시간 입력 [2] 누적 학습 시간 조회");
		int choice = sc.nextInt();
		
		return choice;
		
	}

	public GoalsVO inputTime() {
		
		System.out.print("수학 학습 시간 입력: ");
		int math_input_time = sc.nextInt();
		System.out.print("영어 학습 시간 입력: ");
		int eng_input_time = sc.nextInt();
		//System.out.println("아이디 입력: ");
		//String user_id = sc.next();
		GoalsVO gvo = new GoalsVO();
		gvo.setMath_input_time(math_input_time);
		gvo.setEng_input_time(eng_input_time);
		//gvo.setUser_id(user_id);
		
		return gvo;
		
	}

	public void statusInput(int row) {
		
		if (row > 0) {
			System.out.println("학습 시간 입력 성공!");
		} else {
			System.out.println("학습 시간 입력 실패!");
		}		
		
	}
	public void statusRecord(GoalsVO recordvo, GoalsVO gvo) {
		if(recordvo.getMath_accumulated_time()>=gvo.getMath_goal_time()&&recordvo.getEng_accumulated_time()>=gvo.getEng_goal_time()) {
			System.out.println("현재 누적학습 시간 : 수학은 "+gvo.getMath_goal_time()+"분중 "+ recordvo.getMath_accumulated_time()+" 분이고 영어는 "+gvo.getEng_goal_time()+ "분중 "+recordvo.getEng_accumulated_time()+"분입니다");
			System.out.println("축하합니다, 2과목 모두 목표를 달성하셨습니다!");
			
		} else if(recordvo.getMath_accumulated_time()>=gvo.getMath_goal_time()&&recordvo.getEng_accumulated_time()<gvo.getEng_goal_time()){
			System.out.println("현재 누적학습 시간 : 수학은 "+gvo.getMath_goal_time()+"분중 "+ recordvo.getMath_accumulated_time()+" 분이고 영어는 "+gvo.getEng_goal_time()+ "분중 "+recordvo.getEng_accumulated_time()+"분입니다");
			System.out.println("조금 아쉬운 결과네요, 수학은 목표를 달성했지만 영어는 미달입니다! ");
		} else if(recordvo.getMath_accumulated_time()<gvo.getMath_goal_time()&&recordvo.getEng_accumulated_time()>=gvo.getEng_goal_time()) {
			System.out.println("현재 누적학습 시간 : 수학은 "+gvo.getMath_goal_time()+"분중 "+ recordvo.getMath_accumulated_time()+" 분이고 영어는 "+gvo.getEng_goal_time()+ "분중 "+recordvo.getEng_accumulated_time()+"분입니다");
			System.out.println("조금 아쉬운 결과네요, 영어는 목표를 달성했지만 수학은 미달입니다! ");			
		} else {
			System.out.println("현재 누적학습 시간 : 수학은 "+gvo.getMath_goal_time()+"분중 "+ recordvo.getMath_accumulated_time()+" 분이고 영어는 "+gvo.getEng_goal_time()+ "분중 "+recordvo.getEng_accumulated_time()+"분입니다");
			System.out.println("무척 아쉬운 결과네요, 2과목 모두 목표에 미달입니다! ");
			
		}
	}

	
}


