package com.callor.applications;

import com.callor.applications.service.ScoreServiceV1;

public class Score_01 {
	public static void main(String[] args) {
	
		ScoreServiceV1 scV1 = new ScoreServiceV1();
		
		//method return 값을 변수에 저장하려면
		//method return type 이 void가 아니어야한다.
		//Score_S_V1의 input() method 는
		//return type이 void(형, type)이다.
		//따라서 아래코드처럼 사용할수 없다.
		//int num = scV1,input();		
		
		scV1.input();
		scV1.print();
		
	}

}
