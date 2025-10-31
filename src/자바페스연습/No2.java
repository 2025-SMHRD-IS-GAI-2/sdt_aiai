package 자바페스연습;

import java.util.Scanner;

public class No2 {

	public static void main(String[] args) {
		/**String str ="01001100";
		int a = Integer.parseInt(str, 2);
		System.out.println(str+"(2)"+"="+a+"(10)");**/
		Scanner sc=new Scanner(System.in);// 입력 받을 도구 생성
		System.out.print("일한 시간을 입력하세요 : ");// 출력물
		int t=sc.nextInt();// 정수 입력용 도구
		int m=5000;// m은 정수 5000.
		if(t>8) {//만약 t가 8보다 클때.
			int e=5000*8;// 정수 e는 5000*8이다.
			double d=(t-8)*5000*1.5;// 실수 d는 (t(시간)-8)*5000*1.5 이다.
			System.out.print("총 임금은 " + (e+(int)d));// 8시간을 초과한 총 임금의 출력물.
			                                          // 실수로 출력되지 않게.d(실수) 앞에 (int) 입력.
			
		}else {// 그렇지 않다면. 8시간까지는 일반 시급으로 책정하여 임금 지불.
			System.out.print("총 임금은 " + t*m);
		}
			}
			
		

	}


