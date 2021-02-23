package com.callor.applications.service;

public class PrimeServiceV1 {
	// 정수 1개를 매개변수로 갖는 prime() method
	public void prime(int num) {

		int i = 0;
		for (i = 2; i < num; i++) {
			
			boolean bYes = num % i == 0;

			if (bYes) {

				break;
			}
		}

		if (i < num) {
			System.out.println(num + "은(는) 소수가 아님");

		} else {
			System.out.println(num + "은(는) 소수임");
		}

	}
}