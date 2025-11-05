package controller;

import model.GoalsVO;
import model.UserDAO;
import model.UserVO;
import view.Quotes;
import view.UserView;

public class Controller {
	
	UserDAO dao = new UserDAO();
	UserView view = new UserView();
	UserVO uvo = new UserVO();
	GoalsVO gvo = new GoalsVO();
	
	
	public void run() {
		
		
		while(true) {
			
			int choice = view.showMenu();
			if (choice==1) {
				uvo = view.showSignUp();
				int row = dao.signUp(uvo);
				view.statusSignUp(row);
			} else if (choice==2) {
				uvo = view.showSignIn();
				uvo = dao.signIn(uvo);
				view.statusSignIn(uvo.getUser_id());
				Quotes qt = new Quotes();
				System.out.println("*****************************");
				String quoteOfTheDay = qt.getRandomQuotes();
				System.out.println("오늘의 명언 : " + quoteOfTheDay);
				System.out.println("*****************************");
				 break;
			}
		} 
		String result_id=uvo.getUser_id();
		gvo = view.showSetGoal();
		//gvo : 목표 설정된 시간 들어있는 객체
		gvo.setUser_id(result_id);
		int row = dao.setGoal(gvo);
		view.statusSetGoal(row);
		while(true) {
			int choice = view.showInput();
			if (choice==1) {
				GoalsVO inputVo = new GoalsVO();
				//기존 : 목표 시간 들어있는 객체 gvo에 다시 초기화 하는 작업
				// 변경 : 새로운 객체 inputVO를 만들어서 또다른 공간으로 분리해서
				//      저장
				inputVo = view.inputTime();
				inputVo.setUser_id(result_id);
				row =dao.input(inputVo);
				view.statusInput(row);
				
			} else if (choice==2) {
				GoalsVO recordvo = new GoalsVO();
				recordvo=dao.searchRecord(uvo);
//				System.out.println("hi "+gvo.getEng_goal_time());
				view.statusRecord(recordvo, gvo);
			}
		}
	}

}
