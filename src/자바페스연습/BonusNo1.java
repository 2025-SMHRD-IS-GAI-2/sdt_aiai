package 자바페스연습;

import java.util.Scanner;

public class BonusNo1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//입력 받을 도구 생성
		while (true) {// true일때 까지 반복
			System.out.print("A 입력 >> ");// 출력물 1
			int num1 = s.nextInt();// 출력물 1을 입력할 도구
			System.out.print("B 입력 >> ");// 출력물 2
			int num2 = s.nextInt();// 출력물 2를 입력할 도구
			System.out.print("결과 >> " + (num1 - num2));// 출력물+num1과 num2를 뺀값.
			if (num1 == 0 && num2 == 0) {// 만약 num1이나 num2가 0이라면.
				System.out.println();// 개행
				System.out.println("프로그램 종료.");// "프로그램 종료." 출력
				break;// 반복을 멈추기.
			}
			System.out.println();// 개행
		}
	}

}
