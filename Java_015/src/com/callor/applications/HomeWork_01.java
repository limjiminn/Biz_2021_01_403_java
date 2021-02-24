package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_01 {
	/*
	 * 2 이상의 임의의 정수 100를 만들고
	 * primeServiceV2의 prime() method 호출하여
	 * 임의 정수 100개 중 소수인 수들의 리스트를 출력
	 * 소수인 수들의 합
	 */
	public static void main(String[] args) {

		PrimeServiceV2 psV2 = new PrimeServiceV2();
		Random rnd = new Random();
		//합을 출력하는 변수 sum을 0으로 초기화한다.
		
		// 이 두개의 변수는 for()반복문에서 수행한 연산
		// 덧셈, 개수세기를 수행한 후
		// 결과를 출력하는 곳에서 사용해야할 변수이다
		//따라서 for() 반복문이 시작되기전에
		// 변수를 선언 및 초기화 해 두어야 한다.
		int sum = 0;
		int count = 0;
		System.out.println("100개중 소수인 수 리스트");
		
		for (int i = 0; i < 100; i++) {
		//Random클래스를 사용하여 2이상의 임의의 정수 100개 만들기
			/*
			 *  0 ~ 9999까지의 난수를 생성하고
			 *  생성된 난수에 +2를 수행하라
			 *  실제 생성된 수는 2 ~ 10001 까지 중에 난수를 생성하여
			 *  num에 저장
			 */
			int num = rnd.nextInt(10000) + 2 ;
			
		//PrimeServiceV2의 prime()메서드를 호출
			//psV2 클래스의 prime() method는
			// num가 소수이면 그수는 그대로 return
			//아니면 -1을 return
			int result = psV2.prime(num);
		//소수인 수들의 리스트 출력
			if (result > 0) {
				System.out.print(num + " ");
				//소수인 수의 합 출력
				//sum += num;
				//count++;
			}
			//소수들의 합을 구하기
			//sum 변수에 값을 누적하여 합계 계산
			if(result > 0) {
				sum += num;
			}// 소수들의 개수 세기
			if(result > 0) {
				count++;
			}
		}// end for
		System.out.println();
		System.out.println("소수의 합 : " + sum);
		System.out.println("소수의 개수 : " + count);
	}

}
