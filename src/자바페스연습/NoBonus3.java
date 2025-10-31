package 자바페스연습;

public class NoBonus3 {

	public static void main(String[] args) {
		int num1 =50;// 입력 받은 정수 50
		int num2 =15;// 입력 받은 정수 15
		String op = "*"; // 입력 받은 문자열 별칭 op는 "*" 이다.
		
		System.out.println(cal(num1, num2, op));//메서드 cal 을 출력(int , int, String) 타입

	}

	private static int cal(int num1, int num2, String op) {// 메서드 cal을 호출
		int res= 0;
		if(op.equals("-")) {// 만약 별칭 op 가 "-" 와 동일하다면.
			res= num1-num2;	// 정수 1번과 2번을 뺄 것이다.	
		}
		else if(op.equals("+")) {// 만약 별칭 op 가 "+" 와 동일하다면.
			res=num1+num2; // 정수 1번과 2번을 더할 것이다.
		}
		else if(op.equals("*")) {// 만약 별칭 op 가 "*" 와 동일하다면.
			res=num1*num2; // 정수 1번과 2번을 곱할 것이다.
		}
		else if(op.equals("/")) {// 만약 별칭 op 가 "/" 와 동일하다면.
			res=num1/num2; // 정수 1번과 2번을 나눌 것이다.
		}
		return res;
	
	}

}
