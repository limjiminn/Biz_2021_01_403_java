package com.callor.score;

import java.util.Random;

/*
 * 다음과 같은 데이터를 배열로 선언하여 저장하고 총점, 평균을 구하여 성적 리스트를 출력하시오
 * 1. 이름 : 홍길동, 이몽룡, 성춘향, 장녹수, 임꺽정
 * 2. 주소: 서울시, 익산시, 남원시, 한양시, 함흥시
 * 3. 과목 : 국어, 영어, 수학
 * 4. 점수 : Random 클래스 사용 1 ~ 100까지 임의로 사용
 */
public class Score_01 {

	public static void main(String[] args) {

		String strName[] = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정" };
		String strAddr[] = { "서울시", "익산시", "남원시", "한양시", "함흥시" };

		int arrLen = strName.length;

		int[] intKor = new int[arrLen];
		int[] intEng = new int[arrLen];
		int[] intMath = new int[arrLen];

		int[] intSum = new int[arrLen];
		float[] floatAvg = new float[arrLen];

		Random rnd = new Random();

		// 점수 생성
		for (int i = 0; i < strName.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;

		}
		// 총점
		for (int i = 0; i < strName.length; i++) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
		}
		// 평균
		for (int i = 0; i < strName.length; i++) {
			floatAvg[i] = (float) intSum[i] / 3;

		}
		System.out.println("===========================================================");
		System.out.println("이름\t주소\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------------------");

		for (int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%3.2f\n", strName[i], strAddr[i], intKor[i], intEng[i],
					intMath[i], intSum[i], floatAvg[i]);

		}
		System.out.println("===========================================================");
	}
}
