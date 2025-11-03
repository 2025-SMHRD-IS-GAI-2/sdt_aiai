package controller;

import model.SMDAO;
import model.SMVO;
import view.SMView;

public class SMController {
	SMDAO dao = new SMDAO();
	SMView view = new SMView();

	public void run() {
		// view 의 기능 실행하는 메서드
		while (true) {
			int input = view.showMenu();

			if (input == 1) {
				// 회원가입 기능
				SMVO member = view.showJoin();
				int row = dao.join(member);
				view.statusJoin(row);
			} else if (input == 2) {
				// 로그인 가능
				SMVO member = view.showLogin();
				String result = dao.login(member);
				view.statusLogin(result);
				if (result != null) { // ✅ 로그인 성공 시
					break; // while 종료 → 다음 화면으로 이동

			} else if (input == 3) {
				// 회원 탈퇴 기능
				// view 클래스의 showDelete() 생성!
				// -> 리턴값을 통해 필요한 정보 가져오기!
				// - 탈퇴할 id, pw를 통해 사용자에게 입력받기
				// * 입력 받기 : console 에서 진행 -> view 클래스
				SMVO deleteMem = view.showDelete(null);
				int row = dao.delete(deleteMem);
				view.statusDelete(row);
			}
		}
		}showMainMenu();
	}

	public void showMainMenu() {
		SMView view = new SMView();

		while (true) {
			int select = view.showMainMenu(); // ✅ 이제 문제 없음

			if (select == 1) {
				System.out.println("📌 할 일 등록 기능 실행!");
				int choice=view.inputInfo();
				if(choice==1) {
					SMVO smvo = view.insertInfo();
					 dao.addInfo(smvo);
				}   
			} else if (select == 2) {
				System.out.println("📌 학습 달성률 조회 실행!");

			} else if (select == 3) {
				System.out.println("📌 로그아웃합니다.");
				break;
			} else {
				System.out.println("⚠️ 잘못된 입력입니다. 다시 선택하세요.");
			}
		}
	}
}