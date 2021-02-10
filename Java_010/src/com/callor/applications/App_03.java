package com.callor.applications;

import java.util.Scanner;

public class App_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while (true) {

			System.out.print("숫자입력 >> ");
			int num = scan.nextInt();

			boolean bYes = num > 1 && num < 10;

			if (!bYes) {
				System.out.println("경고");
			} else {
				System.out.println("=======================");
				System.out.println("구구단 " + num + "단");
				System.out.println("-----------------------");

				for (int i = 0; i < 8; i++) {
					int num1 = i + 2;

					System.out.print(num);
					System.out.print(" x ");
					System.out.print(num1);
					System.out.print(" = ");
					System.out.println(num * num1);

				}
				System.out.println("=======================");
			}

		}

	}

}
