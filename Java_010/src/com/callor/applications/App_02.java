package com.callor.applications;

import java.util.Scanner;

public class App_02 {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자입력 >>");
		int num = scan.nextInt();

		System.out.println("=========================");
		System.out.println("구구단 " + num + "단");
		System.out.println("-------------------------");

		boolean bYes = num < 1 && num > 10;
		if (bYes) {
			System.out.println("경고");
			// break;
			for (int i = 0; i < 8; i++) {
				int num1 = i + 2;
				System.out.println(num + " x " + num1 + " = " + (num * num1));
			}
		}

	}
}
