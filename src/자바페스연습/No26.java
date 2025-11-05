package 자바페스연습;

import java.util.Scanner;

public class No26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 입력 받을 도구 생성
		System.out.print("첫 번째 숫자 입력 >> ");// 첫번째 정수를 입력할 문자열
		int num1 = sc.nextInt();// 첫번째 정수를 입력할 도구
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();// 두번째 정수를 입력할 도구
		System.out.println(num1 * (num2 % 10));// 두번째 숫자를 10으로 나눈 나머지를 첫번째 숫자와 곱한다..
		System.out.println(num1 * (num2 % 100 / 10));// 두번째 숫자를 100으로 나눈 나머지를 10으로 나눈 후 곱한다..
		System.out.println(num1 * (num2 / 100));// 세번째 숫자를 100으로 나눈 후 첫번째 숫자와 곱한다.
		System.out.println(num1 * num2);// 첫번째, 두번째 숫자를 곱한 값.

	}

}
