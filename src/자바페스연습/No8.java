package 자바페스연습;

import java.util.Scanner;

public class No8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		if (num % 10 <= 4) {
			System.out.print("반올림 수 : " + (num / 10) * 10);

		} else if (num % 10 <= 9) {
			System.out.print("반올림 수 : " + (num / 10 + 1) * 10);

		}
	}
}
