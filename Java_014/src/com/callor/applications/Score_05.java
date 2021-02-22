package com.callor.applications;

import java.util.Random;

public class Score_05 {

	public static void main(String[] args) {

		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		String[] strName = new String[3];
		int[] intSum = new int[3];
		float[] fAvg = new float[3];
		// String[] strName = new String[3]{"홍길동", "이몽룡", "성춘향"};
		strName[0] = "홍길동";
		strName[1] = "이몽룡";
		strName[2] = "성춘향";
		// 학생별로 점수를 입력(생성)하는 코드
		Random rnd = new Random();

		for (int i = 0; i < intKor.length; i++) {

			intKor[i] = rnd.nextInt(100) + 1;

			intEng[i] = rnd.nextInt(100) + 1;

			intMath[i] = rnd.nextInt(100) + 1;

		}
		// 학생별로 총점을 계산하는 코드
		for (int i = 0; i < intKor.length; i++) {
			/*
			 * intSum[i] = intKor[i]; 
			 * intSum[i] += intEng[i]; 
			 * intSum[i] += intMath[i];
			 */
			intSum[i] = intKor[i] + intEng[i] + intMath[i];

		}
		// 학생별로 평균을 계산하는 코드
		for (int i = 0; i < intKor.length; i++) {
			 fAvg[i] = (float)intSum[i] / 3;
		}
		
		// 성적리스트 출력
		System.out.println("===================================================");
		System.out.println("빛나리 학습 성적일람표");
		System.out.println("===================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------------");

		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n"
					, strName[i]
							, intKor[i]
									, intEng[i]
											, intMath[i]
													, intSum[i]
															, fAvg[i]);
			// System.out.print(strName[i] + "\t");
			// System.out.print(intKor[i] + "\t");
			// System.out.print(intEng[i] + "\t");
			// System.out.print(intMath[i] + "\t");
			// System.out.print(intSum[i] + "\t");
			// System.out.printf("%3.2f\n", fAvg[i]);
		}
		System.out.println("===================================================");

	}

}
