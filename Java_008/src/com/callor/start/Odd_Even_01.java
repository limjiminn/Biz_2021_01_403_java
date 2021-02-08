package com.callor.start;

public class Odd_Even_01 {

	public static void main(String[] args) {

		int sum = 0;
		
		// 0~99
		//even 짝수  //odd 홀수
		for(int i = 0; i < 100; i++) {
			
			// 1 ~ 100
			int num = i + 1;
			
			boolean bYes = num % 2 == 0;

			// 만약 byes true 이면
			if (bYes) {
				// 값을 변수에 계속 더하라
				sum += num;							
			}
			
		}
		System.out.println("1부터 100까지 짝수의 합 = " + sum);
		
	
		for(int i = 0; i < 100; i++) {
			
			int num = i + 1;
			
			if(num % 2 == 1) {
				
				sum += num;
					
			}
		}
		System.out.println("1부터 100까지 홀수의 합 = " + sum);
		
		// 위에서 선언하고 사용했던 변수를 "재 사용" 하기
		// 반드시 초기화(clear) 해야한다.
		int intSumOdd = 0;
		for(int i = 0; i < 100 ; i++) {
			int num = i + 1;
			boolean bYes = num % 2 == 0;
			
			//if( bYes == false) {
			// bYes가 true가 아니면
			if( !bYes) {
				intSumOdd += num ;
				
			}
		}
			System.out.println("홀수의 합 : " + intSumOdd);
			
			
	}

}
