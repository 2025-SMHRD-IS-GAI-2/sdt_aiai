package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import view.UserView;
import Util.DBUtil;
import model.TargetVO;
import model.UserDAO;
import model.UserVO;


public class UserController {
	
	Scanner sc = new Scanner(System.in);
	
	UserView view = new UserView();
	UserDAO dao = new UserDAO();
	
	public void run()
	{
		while(true) {
		int choice = view.showMenu();
		
			if(choice == 1) {
				// 회원가입 기능
				UserVO uvo = view.join();
				int num = dao.join(uvo);
				view.statusJoin(num);
			} else if(choice == 2) {
				// 로그인 기능
				UserVO uvo = view.login();
				String result_name = dao.login(uvo);
				boolean result = view.statusLogin(result_name);
				
				if(result == true) {
					int num2 = view.selectWiseSaying();
					String result3 = dao.selectWiseSaying(num2);
					view.selectWiseSayingPrint(result3);
					
					view.selectStudy(uvo);
					ArrayList<TargetVO> tvolist = dao.selectStudyTime(uvo);
					view.statusStudyTime(tvolist);
					
					TargetVO tvo = view.insertTarget(uvo);
					int row = dao.insertTarget(tvo);
					view.statusTarget(row);
					
					while(true) {
						if(tvo!=null) {
							System.out.print("오늘 공부를 다 마치셨으면 y를 눌러주세요 : ");
							System.out.println();
							String num = sc.next();
							if(num.equals("y")) {
								TargetVO tvo2 = view.insertStudy(tvo);
								int row2 = dao.insertContents(tvo2);
									if(row>0&&tvo2.getTargetTime()<tvo2.getStudyTime()) {
										System.out.println("===목표시간보다 초과하였습니다. 열심히 공부하셨네요.===");
										System.out.println();
										break;
									}else if(row>0&&tvo2.getTargetTime()==tvo2.getStudyTime()) {
										System.out.println("===목표 계획대로 공부하셨네요. 수고하셨습니다.===");
										System.out.println();
										break;
									}else if(row>0&&tvo2.getTargetTime()>tvo2.getStudyTime()) {
										System.out.println("===목표시간보다 적게 공부하셨네요. 내일은 힘내요===");
										System.out.println();
										break;
									}
							} else {
								System.out.println("잘못 입력하셨습니다.");
							}
						} 
					}
				} 
				
			} else if(choice == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
	
	
}
