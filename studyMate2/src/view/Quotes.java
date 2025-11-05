package view;

import java.util.Random;

public class Quotes {
	
	public final String[] LifeQuotes = { "피할수 없으면 즐겨라", "한번의 실패와 영원한 실패를 혼동하지 마라", "내일은 내일의 태양이 뜬다", "시간은 금이다" };



	public String getRandomQuotes() {
			Random	rd = new Random();
			int index = rd.nextInt(LifeQuotes.length);
			return LifeQuotes[index];
		}

}
