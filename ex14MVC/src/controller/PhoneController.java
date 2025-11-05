package controller;

import model.PhoneVO;
import view.Phoneview;

import java.util.ArrayList;

import model.PhoneVO;
import model.PhoneDAO;

public class PhoneController {
	
	
	public void run() {
		
		Phoneview view =new Phoneview();
		PhoneDAO dao =new PhoneDAO();
		
		while(true) {
			
		int choice = view.showMenu();
		if(choice == 1) {
			// 전화번호 추가
			PhoneVO pvo = view.showAdd();
			
			int row = dao.insertPhoneNum(pvo);
			
			view.statusAddResult(row);
			
		}else if (choice == 2) {
			
		ArrayList<PhoneVO> list =dao.selectAll();
		
		view.statusAll(list);
		}else if (choice ==3) {
			// 이름, 번호를 입력 받아서 삭제!
			PhoneVO deletephone = view.showdelete();
			int row = dao.delete(deletephone);
			
			view.statusDelete(row);
		
		}
		
		}
		
		
		
	}
	
	

}
