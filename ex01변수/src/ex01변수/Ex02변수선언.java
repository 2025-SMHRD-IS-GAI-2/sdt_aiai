package ex01변수;

public class Ex02변수선언 {

	public static void main(String[] args) {
        // ctrl d : 코드 한 줄 삭제
		// 변수(Variable) : 데이터를 담을 수 있는 메모리 공간(저장 공간)
		// 변수+자료형 - 연산자 - 조건문 - 반복문 - 배열 - 이차원배열 - 메소드 -객체지향 프로그래밍 
		// - ArrayList - MVC - 추상클래스, 인터페이스 - JDBC 순서로 수업 예정
		// 중간에 자료구조, 자바페스티벌 진행
		// 1. 변수 선언 : 예를 들어 정수형 데이터를 저장할 box를 선언하는 경우
		int box;
		// 2. 변수에 데이터를 담아주기(할당)
		//    할당하다 - assign
		// = : 할당하다(데이터를 넣는다)의 의미 * 변수 선언 후 첫 데이터 할당을 초기화라고 함.
		box = 7;
		// 3. 변수 선언과 동시에 할당 진행
		// * 동일한 변수명을 가진 변수는 동일한 구역에서 하나만 존재 가능.
		// 상수(constant) : 프로그래밍에서는 데이터를 담을 수 있는 공간 한 번 넣으면 변하지 않는 수를 담는데 사용.
		int box1 = 10 ;
		// 변수 값의 재할당
		box = 11;
		box1 = 3;
		// 상수 : 한 번 데이터를 넣으면 데이터 변경 불가, 키워드 final 사용.
		final int age = 30;
		// age = 10; 재할당 불가, 즉 데이터 변경 불가 - 상수의 특징
		// 변수명 규칙(필수)
		// 1. 키워드 사용 불가 : 예를 들어 final, int 같은 단어는 변수 이름으로 사용 불가
		// 2. 대소문자가 구분되며 길이에는 제한이 없다.
		// 3. 숫자로 시작할 수 없다.
		// 4. 특수문자는 "_"와 "$"만 허용된다.
		// 권장 규칙(Coding Convention)
		// 1. 변수 이름의 첫 글자는 소문자로 시작
		// 2. 두 단어 이상일 경우 두 번째 단어의 첫 글자는 대문자로 한다.
		// 코딩 컨벤션 Coding Convention
		// 클래스 이름 : Upper camel case
		// 패키지 이름 : lower case
		// 변수 이름 : camel case
		// 상수 : CONSTANT
		// 자바 데이터 타입 - primitive(numeric, char, boolean) numeric(
		// 기본 데이터 타입(Primitive Type)
		// - boolean(1), char(2), byte(1), short(2), int(4), long(8), float(4), double(8byte)
		// reference 자료형 : 위 8가지 외의 자료형
		
	}

}
