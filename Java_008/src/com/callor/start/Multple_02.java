package com.callor.start;

public class Multple_02 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 0; i < 100; i++) {
			int num = i + 7;
			boolean bYes = num % 3 == 0;

			if (!bYes) {

				sum += num;

			}
		}
		System.out.println("3의 배수가 아닌수들의 합 : " + sum);
		
		
		
		// 다른 방법
		// ~ 범위의 값을 덧셈(합산,누적)용 변수 선언
		int intSum = 0;

		for (int i = 0; i < 100; i++) {
			int num = i + 7;
			boolean bYes = num % 3 == 1; // 3의배수가 아닌경우 나머지: 1
			if (bYes) {
				intSum += num;
			}

			boolean bYes2 = num % 3 == 2; //3의 배수가 아닌경우 나머지: 2
			if (bYes2) {
				intSum += num;
			}
		}
		System.out.println("3의 배수가 아닌 수의 합 : " + intSum);
		
		
		// 다른 방법
		intSum = 0;

		for (int i = 0; i < 100; i++) {
			int num = i + 7;
			boolean bYes = num % 3 > 0; // 3의 배수가 아닌경우 나머지 > 0
			if (bYes) {
				intSum += num;
			}
		}
		System.out.println("3의 배수가 아닌 수의 합 : " + intSum);

		// 다른 방법
		intSum = 0;

		for (int i = 0; i < 100; i++) {
			int num = i + 7;
			boolean bYes = num % 3 != 0;  // 변수num 3의 나머지가 0이 아니냐?
			if (bYes) {
				intSum += num;
			}

			
		}
		System.out.println("3의 배수가 아닌 수의 합 : " + intSum);
		
	}

}
