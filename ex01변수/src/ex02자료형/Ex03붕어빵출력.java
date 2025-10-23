package ex02자료형;

import java.util.Scanner;

public class Ex03붕어빵출력 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 입력 받는 도구 가져오기
        // 2. "구매 희망하는 팥붕 개수" 출력
        // 3. 팥붕 개수 입력 받아서 변수 num에 저장
        //    - 팥붕 개수 입력받아, 변수 num 선언하며 할당!
        // 4. num 출력
        System.out.println("구매 희망 팥붕 개수 :");
        int num = sc.nextInt();
        System.out.println("붕어빵의 개수 : " +num);
        // 콘솔창 내용 캡쳐해서 카톡에 올리기 : 카톡 아래 캡쳐 이모티콘 클릭하면 나타나는 사각형 캡쳐 클릭 후
        // 마우스로 범위 지정 캡쳐해서 완료 클릭 후 전달 클릭
        // 16번줄에서 +num 앞에 있는 여백은 무시됨, 띄어쓰기 필요시 ""안에서 띄어 쓸 것.
	}

}
