package com.callor.start.jdk;

import java.util.Random;

public class Random_05 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int sum2M = 0;

		for (int i = 0; i < 100; i++) { 

			int num = rnd.nextInt(100) + 1;

			if (num % 2 == 0) {

				sum2M += num;

			}

		}
		System.out.println("1부터 100까지 임의 수 100개중 짝수의 합 : " + sum2M);

	}

}
