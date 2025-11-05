package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.PhoneVO;

public class Phoneview {
	Scanner sc = new Scanner(System.in);

	// 메뉴 출력 하는 메소드
	public int showMenu() {
		System.out.println("전화번호부 관리 프로그램");
		System.out.print("[1]전화번호 추가 [2]전체 조회 [3]번호 삭제 >> ");

		int choice = sc.nextInt();
		return choice;

	}

	public PhoneVO showAdd() {

		System.out.print("이름 입력  :");
		String name = sc.next();

		System.out.print("전화 번호 입력 : ");
		String phoneNum = sc.next();

		System.out.print("나이 입력 : ");
		int age = sc.nextInt();

		PhoneVO phone = new PhoneVO(name, phoneNum, age);

		return phone;

	}

	public void statusAddResult(int row) {

		if (row > 0) {
			System.out.println("전화번호 추가 완료");
		} else {
			System.out.println("전화번호 추가 실패");
		}

	}

	public void statusAll(ArrayList<PhoneVO> list) {

		if (list.size() !=0) {
			for (PhoneVO pvo : list) {
				System.out.println("이름 : " + pvo.getName());
				System.out.println("전화번호 : " + pvo.getPhoneNum());
				System.out.println("나이 : " + pvo.getAge());
				System.out.println("===========================");
			}

		} else {
			System.out.println("저장된 번호가 없습니다.");
		}

	}

	public PhoneVO showdelete() {
		System.out.print("이름을 입력하세요 : ");
		String delete_name = sc.next();
		System.out.print("번호를 입력하세요 : ");
		String delete_pn = sc.next();
		// id와 pw를 controller로 전달하기 위해서
		// 개별적으로 전달x , 하나로 묶어서 전달하기 위함
		// --> 객체 생성!
		// --> 체의 필드값을 통해서 id,pw를 넣어준다
		PhoneVO pvo = new PhoneVO();
		pvo.setName(delete_name);
		pvo.setPhoneNum(delete_pn);
		return pvo;

	}

	public void statusDelete(int row) {
		if (row > 0) {
			System.out.println("전화번호부가 삭제 되었습니다.");
		} else {
			System.out.println("삭제 실패.");

		}

	}
}