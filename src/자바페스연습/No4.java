package 자바페스연습;

import java.util.Scanner;

public class No4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int total = sc.nextInt();
		System.out.println("잔돈: "+ total);// 입력받은 정수의 값.
	
		System.out.println("만원 : "+(total/10000)+"개");// 정수(total)나누기 10000 를 한 값.
		System.out.println("오천원 : "+(total%10000/5000)+"개");// 정수를 10000으로 나눈 나머지 나누기 5000을 한 값.
		System.out.println("천원 : "+(total%10000%5000/1000)+"개");// 정수를 10000으로 나눈 나머지,에서 5000으로 나눈 나머지,에서 1000을 나눈 값.
    	System.out.println("오백원 : "+(total%1000/500)+"개");//  정수를 1000으로 나눈 나머지를 500으로 나눈 값.
    	System.out.println("백원 : "+(total%1000%500/100)+"개");//정수를 1000으로 나눈 나머지,500으로 나눈 나머지를 100으로 나눈 값.

	}

}
