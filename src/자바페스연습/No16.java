package 자바페스연습;

import java.util.Scanner;

public class No16 {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.print("정수 입력 : ");
	int num =sc.nextInt();
	int num2=0;
	 while(num > 0) {//num이 0보다 클 동안 반복.
         num2 += num % 10;// 입력 받은 값(num)을 10으로 나눈 나머지 num2에 대입.
                          //반복되며 숫자가 차례대로 더해짐.
         num /= 10; //마지막 자리씩 더하고 자리를 하나씩 빼면서 반복을 끝내기 .       
     }
	System.out.println("합은 "+num2+ " 입니다.");// 출력물
	// 123 1234
		//2131
	}

}
