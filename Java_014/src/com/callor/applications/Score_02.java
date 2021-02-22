package com.callor.applications;

import java.util.Scanner;

public class Score_02 {

	public static void main(String[] args) {
		
		String[] strName = new String[3];
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < intKor.length; i++) {
		System.out.print("이름 >> ");
		strName[i] = scan.nextLine();
		
		strName[i] = Integer.valueOf();
		System.out.println("");
		System.out.print("국어 >> ");
		intKor[i] = scan.nextInt();
		
		System.out.print("영어 >> ");
		intEng[i] = scan.nextInt();
		
		System.out.print("수학 >> ");
		intMath[i] = scan.nextInt();
		
		}
		System.out.println("===================================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("-----------------------------------");
		for(int i = 0; i < 3; i++) {
			System.out.printf("%s\t%d\t%d\t%d\n", strName[i] ,intKor[i], intEng[i], intMath[i]);
		}
		
		

	}

}
