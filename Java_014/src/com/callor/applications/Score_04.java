package com.callor.applications;

import java.util.Random;

public class Score_04 {

	public static void main(String[] args) {

		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		String[] strName = new String[3];

		strName[0] = "홍길동";
		strName[1] = "이몽룡";
		strName[2] = "성춘향";

		Random rnd = new Random();

		for (int i = 0; i < intKor.length; i++) {

			intKor[i] = rnd.nextInt(100) + 1;

			intEng[i] = rnd.nextInt(100) + 1;

			intMath[i] = rnd.nextInt(100) + 1;

		}
		System.out.println("================================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("--------------------------------");

		for (int i = 0; i < intKor.length; i++) {
			System.out.print(strName[i] + "\t");
			System.out.print(intKor[i] + "\t");
			System.out.print(intEng[i] + "\t");
			System.out.println(intMath[i] + "\t");
		}
		System.out.println("================================");

	}

}
