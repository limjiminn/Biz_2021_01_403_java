package com.callor.start;

public class Odd_Even_01 {

	public static void main(String[] args) {

		
		int sum = 0;
		
		// 0~99
		
		for(int i = 0; i < 100; i++) {
			
			// 1 ~ 100
					
			boolean bYes = (i+1) % 2 == 0;

			// 만약 byes true 이면
			if (bYes) {
				// 값을 변수에 계속 더하라
				sum += i+1;							
			}
			
		}
		System.out.println("1부터 100까지 짝수의 합 = " + sum);
		
	
	
		
		for(int i = 0; i < 100; i++) {
			
			if((i + 1) % 2 == 1) {
				
				sum += i + 1;
					
			}
		}
		System.out.print("1부터 100까지 홀수의 합 = " + sum);
		
		
			
			
	}

}
