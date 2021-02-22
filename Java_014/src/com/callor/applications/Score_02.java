package com.callor.applications;

import java.util.Scanner;

public class Score_02 {

	public static void main(String[] args) {

		String[] strName = new String[3];
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < strName.length; i++) {
			System.out.print("이름 >> ");
			strName[i] = scan.nextLine();

			System.out.print("국어 >> ");
			//문자열 형으로 입력받고
			String strSubj1 = scan.nextLine();
			//문자열형숫자를 정수로 변경하여 저장
			intKor[i] = Integer.valueOf(strSubj1);
			
			System.out.print("영어 >> ");
			String strSubj2 = scan.nextLine();
			intEng[i] = Integer.valueOf(strSubj2);

			System.out.print("수학 >> ");
			String strSubj3 = scan.nextLine();
			intMath[i] = Integer.valueOf(strSubj3);
			
			//scan.nextLine();
			
			
		}
		System.out.println("===================================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("-----------------------------------");
		for (int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\n", strName[i], intKor[i], intEng[i], intMath[i]);
		}

	}

}
