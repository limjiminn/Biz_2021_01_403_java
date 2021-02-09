package com.callor.start;

public class Multiple_01 {

	public static void main(String[] args) {

		int num = 0;
		int intSum = 0;
		
		//1부터 100까지 범위에서찾아
		for (int i = 0; i < 100; i++) {
			num = i + 1; // 1부터 100
			boolean bYes3M = num % 3 == 0;
			boolean bYes9M = num % 9 == 0;
			
			// 3의배수 이면서(AND) 9의 배수
			if (bYes3M && bYes9M) {

				intSum += num;

				System.out.println(intSum + " 3과 9의 배수");
			}

		}
		System.out.println("3의 배수이면서, 9의 배수인 수의 합 : " + intSum);
		System.out.println("==================================");
		
		intSum = 0;
		
		for(int i = 0; i < 100; i++) {
			int num1 = i + 1;
			boolean bYes3M = num1 % 3 == 0;
			boolean bYes9M = num1 % 9 == 0;
			
			//if () 비교연산문을 중복 처리하는 방식
			if(bYes3M) {
				if(bYes9M) {
					intSum += num1;
					System.out.println(num1);
				}
			}
			
		}
		System.out.println(intSum);
	}

}
