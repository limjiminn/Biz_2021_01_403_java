package com.callor.applications;

import java.util.Random;

public class Array_05 {

	public static void main(String[] args) {
		// 100개의 요소를 저장 할 수 있는 정수형 배열 intNums 선언 및 생성(초기화)
		int[] intNums = new int[100];
		// Random 클래스를 사용
		Random rnd = new Random();

		// 1 ~ 100까지의 정수를 생성하여 intNums 배열에 저장

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}
		
		// intNums 배열에 저장된 값중 3의 배수이면서 5의 배수인 값들의 리스트와 합을 계산하여 출력
		
		System.out.println("3의 배수이면서 5의 배수 리스트");
		int sum = 0;
		for (int i = 0; i < intNums.length; i++) {
			boolean bNum1 = intNums[i] % 3 == 0;
			boolean bNum2 = intNums[i] % 5 == 0;

			if (bNum1 && bNum2) {
				System.out.print(intNums[i] + " ");

				sum += intNums[i];

			}
		}
		System.out.println("\n3의 배수이면서 5의배수의 합 : " + sum);

	}

}
