package 자바페스연습;

import java.util.Scanner;

public class no1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		int bf = s.nextInt();
		System.out.print("목표 몸무게 : ");
		int af = s.nextInt();
		for(int i=1;i<=100 ; i++) {
			System.out.print(i+"주차 감량 몸무게 : ");
			int w=s.nextInt();
			bf-=w;
			if(bf<=af) {
			System.out.println(bf+" kg 달성! 축하합니다 !!!");
			break;
			
				
			}
			}
		}
	}

