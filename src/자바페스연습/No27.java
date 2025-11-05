package 자바페스연습;

import java.util.Scanner;

public class No27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정답 입력 :");
        String str = sc.next();// 정답 입력을 위한 도구

        int sum = 0;   // 총점. 결과 대입을 위해 0으로 시작.
        int cnt = 0;   // 연속된 o 개수

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') { // 만약 str의 i번째 글자가 o 인경우.
                cnt++;       // 연속된 o 증가 (만약 o라는 문자열이 있을 경우 cnt에 1씩 ++)
                sum += cnt;  // 점수 누적 . sum을 cnt에 더해서 대입.(값 누적을 위해)
             } else {
                cnt = 0;     // o 외에 다른 문자열이 있다면 누적을 초기화.(0)
                             //ex)ooooxo=1,2,3,4,0,1 = 11 이 나온다.
            }
        }

        System.out.println("총점 : " + sum);// 출력물+결과값
    }
}