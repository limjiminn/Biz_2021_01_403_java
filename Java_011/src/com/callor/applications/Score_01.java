package com.callor.applications;

import java.util.Scanner;

public class Score_01 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int kor = 0;
		int eng = 0;
		int mat = 0;

		System.out.print("국어 점수 : ");
		kor = scan.nextInt();

		System.out.print("영어 점수 : ");
		eng = scan.nextInt();

		System.out.print("수학 점수 : ");
		mat = scan.nextInt();

		if (kor < 100 || eng < 100 || mat < 100) {
			while(true) {
				System.out.println("null");
				break;
			}
			int tot = kor + eng + mat;
			float evr = tot / 3F;

			System.out.println("===========================================");
			System.out.println("국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균");
			System.out.println("-------------------------------------------");
			System.out.println(kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + evr);
			System.out.println("===========================================");
		}
	}
}
