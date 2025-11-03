package controller;



import model.SMDAO;
import model.SMVO;
import view.SMView;

public class SMController {



	public void run() {
		// view 의 기능 실행하는 메서드
		SMView view = new SMView();
		SMDAO dao = new SMDAO();
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
			}else if (input == 3) {
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
}//4
}