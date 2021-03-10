package com.callor.score;

import com.callor.score.service.impl.ScoreServiceImplV1;

public class ScoreEx_01 {

	public static void main(String[] args) {
		
		ScoreServiceImplV1 ssV1 = new ScoreServiceImplV1();
		
		ssV1.inputList();
		ssV1.inputWrite();
		ssV1.printRead();
		ssV1.printScore();
	}
}
