package 자바페스연습;

public class No28alt {

	public static void main(String[] args) {
		String str = "01001011";// 입력받는 2진수 문자열

		int a= Integer.parseInt(str,2);// 2진수 문자열 전환(10진수로.) 정수 a는 
		                               // Integer.parseInt를 사용 후 2진수 문자열,2를 입력
		
		System.out.println(str+"(2) ="+a+" (10)");// "2진수를 10진수로 변환" +출력물
	}

}
