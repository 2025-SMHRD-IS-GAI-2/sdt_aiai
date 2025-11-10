package view;

import java.util.Random;

public class Quotes {
	
	public final String[] LifeQuotes = { "피할수 없으면 즐겨라.", "한번의 실패와 영원한 실패를 혼동하지 마라.", 
			"내일은 내일의 태양이 뜬다.", "시간은 금이다.","실패는 새로운 시작이다.",
			"네 자신을 믿어라 너 자신이 큰 기적이다.","성공은 준비된 사람을 만나게 된다.","시작이 반이다","당신의 미래는 당신이 만든다."
			,"눈 앞의 어려움에 당황치 말고,큰 그림을 보라.","행동은 기대 이상의 많은 것을 만든다."};



	public String getRandomQuotes() {
			Random	rd = new Random();
			int index = rd.nextInt(LifeQuotes.length);
			return LifeQuotes[index];
		}
//	커밋
	
}
