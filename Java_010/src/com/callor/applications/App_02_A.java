package com.callor.applications;

import java.util.Scanner;

public class App_02_A {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자입력(2~ 9) >> ");
		int num = scan.nextInt();

		boolean bYes2 = num >= 2;
		boolean bYes9 = num <= 9;

		if (bYes2 && bYes9) {
			// 구구단 출력
			System.out.println("=========================");
			System.out.println("구구단 " + num + "단");
			System.out.println("-------------------------");
			for (int i = 0; i < 8; i++) {
				int num1 = i + 2;
				System.out.println(num + " x " + num1 + " = " + (num * num1));
			}
			System.out.println("=========================");
		} else {
			System.out.println("경고");

		}
	}
}