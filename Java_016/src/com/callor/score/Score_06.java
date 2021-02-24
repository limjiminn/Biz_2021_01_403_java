package com.callor.score;

import java.util.Random;



public class Score_06 {
	
	public static void main(String[] args) {
		
		ScoreVO scoreVO = new ScoreVO[10];
		for(int i= 0; i < scoreVO.length; i++) {
			scoreVO[i] = new ScoreVO();
		}
		
		Random rnd = new Random();
		
		for(int i = 0; i < scoreVO.length ; i ++) {
			scoreVO[i].inKor = rnd.nextInt(100) + 1;
			scoreVO[i].inEng = rnd.nextInt(100) + 1;
			scoreVO[i].inMath = rnd.nextInt(100) + 1;
		}
		
		System.out.println("==========================");
		System.out.println("국어\t영어\t수학");
		System.out.println("--------------------------");
		for(int i = 0; i < scoreVO.length ; i ++) {
			
			int sum = scoreVO[i].intKor;
			sum += scoreVO[i].inEng;
			sum += scoreVO[i].inMath;
			
			float floatAvg =(float)sum / 3;
			
			System.out.printf("%d\t%d\t%d\t%d\t%3.2f\n",
					scoreVO[i].intKor,
					scoreVO[i].inEng,
					scoreVO[i].inMath,
					sum, floatAvg);
		}
	}
	

}
