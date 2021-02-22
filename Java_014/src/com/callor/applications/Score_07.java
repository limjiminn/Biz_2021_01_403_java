package com.callor.applications;

import com.callor.applications.service.ScoreServiceV1;

//자동으로 데이터까지 보여주는 코드
public class Score_07 {

	public static void main(String[] args) {
		ScoreServiceV1 ssV1 = new ScoreServiceV1();// 인스턴스변수 선언
		ssV1.makeNamesAndArrayInit();
		ssV1.makeScore();
		ssV1.makeSum();
		ssV1.makeAvg();
		ssV1.print();

	}

}
