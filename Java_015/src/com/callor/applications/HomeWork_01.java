package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_01 {

	public static void main(String[] args) {

		PrimeServiceV2 psV2 = new PrimeServiceV2();
		Random rnd = new Random();
		int sum = 0;
		System.out.println("100개중 소수인 수 리스트");
		for (int i = 0; i < 100; i++) {

			int num = rnd.nextInt(100) + 2 ;

			int result = psV2.prime(num);

			if (result > 0) {
				System.out.print(num + " ");
				sum += result;
			}
			
			
		}
		System.out.println();
		System.out.println(sum);
	}

}
