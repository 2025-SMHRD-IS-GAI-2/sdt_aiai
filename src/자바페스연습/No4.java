package 자바페스연습;

import java.util.Scanner;

public class No4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int total = sc.nextInt();
		System.out.println("잔돈: "+ total);
	
		System.out.println("만원 : "+(total/10000)+"개");
		System.out.println("오천원 : "+(total%10000/5000)+"개");	
		System.out.println("천원 : "+(total%10000%5000/1000)+"개");
    	System.out.println("오백원 : "+(total%1000/500)+"개");
    	System.out.println("백원 : "+(total%1000%500/100)+"개");

	}

}
