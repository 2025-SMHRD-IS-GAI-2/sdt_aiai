package 자바페스연습;

import java.util.Scanner;

public class No2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int num =sc.nextInt();
		int num2= 5000;
		if(num<=8) {
	    System.out.print("총 임금은 "+(num*num2)+"입니다");
			
		}
		else if(num>8) {
		int a = 5000*8;
		double b = (num-8)*5000*1.5;
		System.out.print("총 임금은 "+(a+(int)b)+"입니다");
	      
		}
		

	}

}
