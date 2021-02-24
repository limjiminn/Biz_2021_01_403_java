package com.callor.score.service;

import com.callor.score.model.ScoreVO;

public class ScoreServiceV2 {
	//과목이 많아지면 감당이 안됨
	public int soreSum(int kor, int eng, int math,
			int music, int art, int hiost) {
		
		int sum = kor;
		sum += eng;
		sum += math;
		sum +=music;
				
		return sum;
	}
	
	public int scoreSum(ScoreVO scoreVO) {
		int sum = scoreVO.intKor;
		sum += scoreVO.intEng;
		sum += scoreVO.intMath;
		sum += scoreVO.intMusic;
		sum += scoreVO.intHistory;
		return sum;
	}
	
}
