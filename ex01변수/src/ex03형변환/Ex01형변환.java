package ex03형변환;

public class Ex01형변환 {

	public static void main(String[] args) {
        // CTRL + D : 코드 한줄 삭제
		// 형변환 : Type Casting
		// int : 4byte, double : 8byte
		int a =3;
		// 1. a를 출력해보시오.
		// 2. double 자료형을 담을 수 있는 변수 b를
		//    선언해보시오.
		System.out.println(a);
		double b=a ;
		// 3. b를 출력해보시오.
		// int 자료형인 a를 double 자료형으로 선언된
		// b에 넣어주니 3.0 으로 데이터가 형 변환.
		// int -> double
		// 4byte -> 8byte
		// 자동 형 변환.
		System.out.println(b);
		// 1. double 자료형을 담을 수 있는
		// 변수 aa를 선언
		// 73.2라는 실수형 데이터를 할당
		
		// 2. int 자료형을 담을 수 있는 bb를 선언
		// double(8byte) -> int(4byte)
		// 강제(명시) 형변환
		// 데이터의 크기가 상대적으로 큰 자료형에서
		// 상대적으로 데이터의 크기가 작은 자료형으로
		// 형변환을 할때, 앞에 변환하고 싶은 자료형을
		// 명시 해 줘야 한다.
		double aa = 73.2;
	    int bb=(int)aa;
	    System.out.println(bb);
		
		
	}

}
