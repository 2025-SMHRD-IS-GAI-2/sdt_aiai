package ex01변수;

import java.util.Scanner;

public class Ex01변수클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		// 주석 : 실행하는 코드가 아닌 메모 작성용
		// 자바에서의 영역 : 중괄호부터 중괄호까지(즉, 중괄호 내부)
		// 클래스 생성시 첫번째 체크박스 = main
		// 메인 안쪽 {}에 코드를 작성한다
		// 저장하는 단축키 ctrl s (언제나 저장하는 습관)
		// 실행하는 단축키 ctrl f11
		// 글자 키우는 단축키 ctrl shift +
		// 코드 한 줄 작성이 끝나면 세미콜론
		// 결과창은 콘솔창
		// 출력하고 싶은 텍스트는 소괄호() 안에 넣기
		// syso ctrl space 후 enter : 출력문 자동 완성
		// println은 코드 실행 후 자동 줄바꿈 그냥 print에는 줄바꿈 기능 없어 다음 코드 결과가 수평 출력
		System.out.print("Hello world!");
		System.out.println("자동완성 단축키");
		System.out.println("이번에는 될까?");
		// 입력을 해보자(콘솔창을 통해서 입력 받기)
		// 1.Scanner ctrl space 후 enter : scanner import 자동 실행
		Scanner sc = new Scanner(System.in);
		// 2. 우리가 붙여준 이름 sc를 호출해서 입력 받기.
		System.out.print("나이을 입력해주세요>>");
		// sc.next();는 문자를 입력받는 기능
		// sc.nextInt();는 정수를 입력 받는 기능
		// =를 기준으로 오른쪽의 데이터를 왼쪽에 넣는다
		int box=sc.nextInt();
		System.out.println(box);
		//황철승커밋
	}

}
