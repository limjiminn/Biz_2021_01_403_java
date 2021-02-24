package com.callor.score.service;

import java.util.Random;

public class ScoreServiceV1 {
	int sum = 0;
	float fAvg = 0;
	int intKor = 0;
	int intEng = 0;
	int intMath = 0;
	Random rnd = new Random();

	// 총점 계산
	public int scoreSum() {
		
			sum = intKor;
			sum += intEng;
			sum += intMath;

		return sum;
	}

	// 평균 계산
	public float scoreAvg() {
		
		
		fAvg = (float) sum / 3;
		return fAvg;
	}

	// 성적 리스트
	public int scorePrint() {
		intKor = rnd.nextInt();
		intEng = rnd.nextInt();
		intMath = rnd.nextInt();
		
	}

}
