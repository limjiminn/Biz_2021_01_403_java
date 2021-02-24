package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class Homework_011 {
	/*
	 * 2 이상의 임의의 정수 100를 만들고 primeServiceV2의 prime() method 호출하여 임의 정수 100개 중 소수인
	 * 수들의 리스트를 출력 소수인 수들의 합(리스트 = 배열)
	 */
	public static void main(String[] args) {
		/*
		 * java에서는 변수, 객체를 선언할때
		 * 사용하기 직전에 선언 및 초기화를 하면된다.
		 * 통상적으로 코딩을 할때 변수, 객체 등의 선언은
		 * 가급적 코드의 시작부분
		 * (클래스 선언 명령문 아래,method 선언문 아래)에 작성한다.
		 */
		Random rnd = new Random();
		PrimeServiceV2 psV2 = new PrimeServiceV2();

		int sum = 0;
		int count = 0;
		// int intNums[] = new int [100]
		int[] intNums = new int[100];
		// 생성된 intNuum 배열에 임의 정수 100개를
		//저장해 두었다.
		// 이처럼 배열을 만들어 두면
		// 이후의 코드에서 한번 생서오딘 임의 정수 100개를
		// 자유롭게 활용할수 있다.
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10000) + 2;

		}
		// intNum 배열에 담겨있는 정수들을
		// psV2.prime() method에게 보내서
		// 소수인가를 검사하자
		
		//다음처럼 prime() method에 배열을 통째로 전달하여
		///코드를 수행할수 없는 이유
		//psV2.prime(intNum);
		//psV2.prime() method는 매개변수가 (intNum)로
		//선언되어있다.
		// 즉 이 method는 전달 받을수 있는 값이 정수 1개이다.
		//그런데 배열(100개의 정수)를 한꺼번에 전달하여고
		// 시도라기 때문에 안된다.
		// 그렇다면 psV2.prime() method를 사용하기 위해서는
		//intNum의 요소들을 한개씩 전달해야한다.
		//결론은 for() 반복문을 사용해야한다.
		for (int i = 0; i < intNums.length; i++) {
			//리스트 출력
			int num = intNums[i];
			int result = psV2.prime(num);

			if (result > 0) {
				System.out.print(num + " ");
			}
		}
		for (int i = 0; i < intNums.length; i++) {
			// 합계 구하기
			int num = intNums[i];
			int result = psV2.prime(num);
			
			if (result > 0) {
				sum += num;
			}
		}
		for (int i = 0; i < intNums.length; i++) {
			// 갯수 구하기
			int num = intNums[i];
			int result = psV2.prime(num);
			
			if (result > 0) {
				count++;
			}
		}
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("갯수 : " + count);
	}

}
