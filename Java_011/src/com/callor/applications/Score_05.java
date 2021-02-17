package com.callor.applications;

/*
 * c.c.a.service.ScoreServiceV4 클래스를 생성한 후
 * score() 메서드 생성한다.
 * score() 메서드 총점(intSum), 평균(floatAvg)을
 * 전달받는 매개변수가 있다.
 * Score_05의 main()에서 호출하여
 * 다음과 같이 Console에 출력하는 코드를 작성하라
 */
import com.callor.applications.service.ScoreServiceV4;

public class Score_05 {

	public static void main(String[] args) {
		ScoreServiceV4 scV4 = new ScoreServiceV4();

		scV4.score(242, 80.666F);
		
		scV4.print(82, 83, 77);
	}

}