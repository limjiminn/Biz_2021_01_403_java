package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {

		int[] intNums = new int[100];

		Random rnd = new Random();

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}

		Scanner scan = new Scanner(System.in);

		System.out.print("정수 입력 >> ");
		int num = scan.nextInt();
		int count = 0;
		for (int i = 0; i < 100; i++) {

			if (num == intNums[i]) {
				count += 1;

			}
		}
		System.out.println(count);
	}

}
