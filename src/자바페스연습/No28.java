package 자바페스연습;

public class No28 {

	public static void main(String[] args) {
		String str = "01001101";// 변환할 2진수 문자열.

		String[] str1 = str.split("");// 문자열을 문자 단위로 쪼갠 결과를 문자열 배열로 만든다.

		int[] arr = new int[str1.length];// 각 문자 "0"/"1"를 정수 0/1로 담을 정수 배열 생성.

		for (int i = 0; i < str.length(); i++) {
			arr[i] = Integer.parseInt(str1[i]);
		} // 문자열 배열 str1의 각 원소(문자 "0" 또는 "1")를
			// Integer.parseInt로 정수(0 또는 1)로 변환해 arr에 저장.

		// 승 수별 연산을 통한 10진수 값 만들기
		int cnt = 1;// 거듭제곱

		int sum = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			sum += arr[i] * cnt;
			cnt = cnt * 2;
		}    // arr의 **맨 오른쪽(최하위 비트)**부터 왼쪽으로 반복.
			// cnt는 현재 자리의 2의 거듭제곱 값.
			// 각 자리 비트와 cnt를 곱해 sum에 더합니다. 반복할 때마다
			// cnt *= 2로 다음 자리(한 칸 왼쪽)의 값으로 이동합니다.

		System.out.println(str + " (2) = " + sum + "(10)");
//		최종 결과 출력.

	}

}
