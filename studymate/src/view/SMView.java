package view;

import java.util.Scanner;

import model.SMDAO;
import model.SMVO;

public class SMView {
	Scanner sc = new Scanner(System.in);
	SMDAO dao = new SMDAO();

	public int showMenu() {
		System.out.println("===== 스터디 메이트 =====");
		System.out.print("[1] 회원 가입 [2] 로그인 [3] 회원 탈퇴 >> ");
		return sc.nextInt();
	}

	public SMVO showJoin() {
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();

		return new SMVO(id, pw, name, age);
	}

	public void statusJoin(int row) {
		System.out.println(row > 0 ? "회원가입 성공" : "회원가입 실패");
	}

	public SMVO showLogin() {
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();
		SMVO smvo = new SMVO();
		smvo.setUser_id(id);
		smvo.setPw(pw);
		return smvo;
	}

	public void statusLogin(String name) {
		if (name != null) {
			System.out.println("로그인 성공");
			System.out.println(name + "님 환영합니다!");
			System.out.println("설정 값 초기화.");
		
		} else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
		}
	}

	public SMVO showDelete() {
		System.out.print("삭제할 ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();

		SMVO smvo = new SMVO();
		smvo.setUser_id(id);
		smvo.setPw(pw);
		return smvo;
	}

	public void statusDelete(int row) {
		System.out.println(row > 0 ? "회원 탈퇴 완료" : "회원 탈퇴 실패");
	}

	public int showMainMenu() {
		System.out.println("===== 메인 메뉴 =====");
		System.out.print("[1] 할 일 등록 [2] 로그아웃 >> ");
		return sc.nextInt();
		
	}
	

	public int showTime() {
		System.out.print("지금까지 학습한 시간을 입력 해 주세요 : ");
		int stime = sc.nextInt();
		return stime;
	}

	public int inputInfo() {
		System.out.print("과목 선택 : [1] 수학 [2] 영어 >> ");
		return sc.nextInt();
	}

	public SMVO insertInfo(int sub) {
		System.out.print("목표 학습 시간(분) 입력 : ");
		int goal = sc.nextInt();
		System.out.print("실제 학습 시간(분) 입력 : ");
		int input = sc.nextInt();
		System.out.print("아이디를 입력해주세요 : ");
		String user_id=sc.next();

		SMVO smvo = new SMVO();
		if(sub == 1) {
			smvo.setMath_goal_time(goal);
			smvo.setMath_input_time(input);
		}else if(sub ==2) {
			smvo.setEng_goal_time(goal);
			smvo.setEng_input_time(input);
		}
		
		smvo.setUser_id(user_id);

		return smvo;
	}
}