package 자바페스연습;

import java.util.Scanner;

public class No8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 입력 받을 도구 가져오기
		System.out.print("숫자 입력 : ");// 출력물
		int num = sc.nextInt();// 정수 입력용 도구
		if (num % 10 <= 4) {// 만약.. 정수 num을 10으로 나눈 나머지가, 4보다 작거나 같을 경우..
			System.out.print("반올림 수 : " + (num / 10) * 10);// 출력물+num을 10으로 나눈 값에 10을 곱한다..
			// ex)123 -> 120
		} else if (num % 10 <= 9) {// 정수 num을 10으로 나눈 나머지가.. 9보다 작거나 같을 경우..
			System.out.print("반올림 수 : " + (num / 10 + 1) * 10);// num을 10으로 나누고 1을 더한 값에 10을 곱해준다..
            // ex) 129 -> 130
		}
	}
}
