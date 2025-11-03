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
			}
		}
	}
}
