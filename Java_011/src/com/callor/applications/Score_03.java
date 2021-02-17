package com.callor.applications;

import com.callor.applications.service.ScoreServiceV2;

public class Score_03 {
	public static void main(String[] args) {
		
		ScoreServiceV2 scServiceV2 = new ScoreServiceV2();
		//호출하는곳에서 어떤값을전달을 하면 마치 프린트라는 매소드에는 그변수값을 초기화하는것과 같다.
		scServiceV2.print(88,77,56);
		
		//ScoreServiceV2 클래스의
		// Sum() 메서드를 호출하면서
		// 정수 99, 88, 77을 전달한다.
		scServiceV2.sum(99,88,77);
		
	}

}
