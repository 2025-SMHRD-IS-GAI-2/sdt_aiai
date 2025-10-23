package 자바페스연습;

public class No21 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };//비교할 숫자 데이터를 담은 배열.

		// 기준값 만들기
		int min = Math.abs(point[0] - point[1]);//int min = Math.abs(point[0]-point[1]);
		//우선 첫 번째 두 값(92, 32) 의 차이를 초기값으로 둔다.(0번 인덱스 - 1번 인덱스]
//		→ Math.abs(92 - 32) = 60
//		→ 현재 min = 60
//
//	    즉, “현재까지 발견한 최소 거리값은 60이다”로 시작.

		int a = 0;
		int b = 0;
		// 가장 가까운 두 값의 인덱스 위치를 저장할 변수이다.
		//처음엔 아직 아무 것도 모르는 상태니까 0, 0으로 시작.

		// 거리 비교를 위한 이중 반복문
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point.length; j++) {
				if (i != j) {
					if (min > Math.abs(point[i] - point[j])) {
						min = Math.abs(point[i] - point[j]);
						a = i;
						b = j;
//						외부 반복문 i
//
//						기준값을 하나씩 선택 (예: 92 → 32 → 52 …)
//
//						내부 반복문 j
//
//						i로 고른 값과 나머지 값들을 전부 비교.
//
//						if (i != j)
//
//						자기 자신끼리는 비교하지 않기 위해 추가한 조건.
//
//						Math.abs(point[i] - point[j])
//
//						두 수의 거리(절대값 차이) 를 구한다.
//
//						if (min > ...)
//
//						현재 저장된 최소 거리보다 더 작은 거리를 발견하면,
//						min을 갱신하고 a, b에 해당 인덱스를 저장.

					}
				}
			}
		}
		System.out.println("result = ["+a + ","+b+"]");
        //a와 b는 “가장 가까운 두 수의 인덱스”. 라는 출력물
	}

}
