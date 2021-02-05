package com.callor.start;

public class Loop_04 {

	public static void main(String args[]) {
		// 0부터 10까지 덧셈을 하는 코드
		int intStart = 10;
		int intEnd = 12 ;
	
		int intSum = 0;
		for(int i = intStart; i < intEnd; i++) {
			
			//int num1 = i + 1;
			//intSum += num1
			intSum += (i + 1);
		}
		System.out.print(intStart + 1);
		System.out.print(" 부터 ");
		System.out.print(intEnd);
		System.out.print(" 까지의 덧셈 ");
		System.out.println(intSum);
	}
}
