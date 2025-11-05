package 자바페스연습;

import java.util.Scanner;

public class 연습용메모장 {

	public static void main(String[] args) {
		int base =2;
		int n =4; 
		int res = powerN(base, n);
		System.out.println("결과 확인  : "+res);
		
		}

	private static int powerN(int base, int n) {
		int bse = 1;
		for(int b=1 ;b<=n; b++) {
			bse*=base;
		}
		return bse;
	}
	}


