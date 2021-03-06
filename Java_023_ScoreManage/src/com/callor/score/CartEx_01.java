package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.MenuServiceImplV1;
import com.callor.score.service.impl.ScoreServiceImplV1;
import com.callor.score.values.Values;

public class CartEx_01 {
	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceImplV1();
		ScoreService cService = new ScoreServiceImplV1();
		
		while(true) {
			Integer menuItem = mService.selectMenu();
			if(menuItem == null) {
				break;
			}else if(menuItem == Values.MENU_INPUT) {
				cService.makeScore();
				// 학생성적 점수 생성
			}else if(menuItem == Values.MENU_SAVE) {
				cService.saveScoreToFile();
				//학생성적 점수 파일에 저장
			}else if(menuItem == Values.MENU_USER_LIST) {
				cService.loadScoreFromFile();
				//성적 결과 확인
			}
		}
		
		mService.selectMenu();
	}

}
