package com.callor.applications;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int sum1 = 0;
		int sum2 = 0;
		//정수형 배열 inNum를 10개 선언
		int[] intNum = new int[10];
		
		//1 ~ 100까지 임의의 수의 합계 계산 
		for (int i = 0; i < 10; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
			//intNum 배열에 저장된 값의 합계를 계산하여 출력
			sum1 += intNum[i];
		}
		System.out.println("전체합 : " +sum1);
		
		//intNum 배열에 저장된 값 중 짝수의 합계 계산
		for (int i = 0; i < 10; i++) {
			if (intNum[i] % 2 == 0) {
				sum2 += intNum[i];
			}
		}
		System.out.println("짝수합 : " + sum2);
	}
}
