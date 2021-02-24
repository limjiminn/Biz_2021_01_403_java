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
		//Random클래스를 사용하여 2이상의 임의의 정수 100개 만들기
			int num = rnd.nextInt(100) + 2 ;
			
		//PrimeServiceV2의 prime()메서드를 호출
			int result = psV2.prime(num);
		//소수인 수들의 리스트 출력
			if (result > 0) {
				System.out.print(num + " ");
				//소수인 수의 합 출력
				sum += result;
			}
			
			
		}
		System.out.println();
		System.out.println("소수의 합 : " + sum);
	}

}
