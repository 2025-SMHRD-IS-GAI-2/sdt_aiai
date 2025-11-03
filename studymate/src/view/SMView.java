package view;

import java.util.Scanner;

import model.SMVO;

public class SMView {
	Scanner sc = new Scanner(System.in);

	public int showMenu() {
		System.out.println("===== 스터디 메이트 =====");
		System.out.print("[1] 회원 가입 [2] 로그인 ");
		int choice = sc.nextInt();

		return choice;
	}

	public SMVO showJoin() {
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.println("나이 입력");
		int age = sc.nextInt();
		SMVO smvo = new SMVO(id, pw, name, age);
		return smvo;

	}

	public void statusJoin(int row) {
		if (row > 0) {
			System.out.println("회원가입 성공");
		} else {
			System.out.println("회원가입 실패");
		}

	}

	public SMVO showLogin() {
		System.out.print("ID를 입력 해 주세요 : ");
		String input_id = sc.next();
		System.out.print("PW를 입력 해 주세요 : ");
		String input_pw = sc.next();
		SMVO smvo = new SMVO();
		smvo.setId(input_id);
		smvo.setPw(input_pw);
		return smvo;

	}

	public void statusLogin(String result_name) {
		if (result_name != null) {
			System.out.println("로그인 성공");
			System.out.println(result_name + "님 환영합니다.");
			//
			SMVO smvo = new SMVO();
			smvo.setName(result_name);
		} else {
			System.out.println("아이디 혹은 비밀번호를 확인해 주세요.");
		}
	}

	public SMVO showDelete(String result) {
		System.out.println("삭제할 아이디를 입력하세요 : ");
		String delete_id = sc.next();
		System.out.println("비밀번호를 입력하세요.");
		String delete_pw = sc.next();
		// id와 pw를 controller로 전달하기 위해서
		// 개별적으로 전달x , 하나로 묶어서 전달하기 위함
		// --> 객체 생성!
		// --> 체의 필드값을 통해서 id,pw를 넣어준다
		SMVO smvo = new SMVO();
		smvo.setId(delete_id);
		smvo.setPw(delete_pw);
		return smvo;
	}

	public void statusDelete(int row) {
		if (row > 0) {
			System.out.println("회원 탈퇴 되었습니다.");
		} else {
			System.out.println("회원 탈퇴 실패");
		}
	}
}// 3