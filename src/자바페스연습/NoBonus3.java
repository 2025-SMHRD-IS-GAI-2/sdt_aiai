package 자바페스연습;

public class NoBonus3 {

	public static void main(String[] args) {
		int num1 =50;
		int num2 =15;
		String op = "*";
		
		System.out.println(cal(num1, num2, op));

	}

	private static int cal(int num1, int num2, String op) {
		int res= 0;
		if(op.equals("-")) {
			res= num1-num2;		
		}
		else if(op.equals("+")) {
			res=num1+num2;
		}
		else if(op.equals("*")) {
			res=num1*num2;
		}
		else if(op.equals("/")) {	
			res=num1/num2;
		}
		return res;
	
	}

}
