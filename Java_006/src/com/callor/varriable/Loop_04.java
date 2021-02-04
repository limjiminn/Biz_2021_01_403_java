package com.callor.varriable;

public class Loop_04 {

	public static void main(String[] args) {
		
		int intDan = 3;
		int num1 = 1;
		
		System.out.println("===========================");
		System.out.println("구구단");
		System.out.println("---------------------------");
		
		for(; num1 < 10 ;) {
			
			System.out.print(intDan);
			System.out.print(" x ");
			System.out.print(num1);
			System.out.print(" = ");
			System.out.println(intDan * num1);
			// 반복문으로 코드를 묶는다.
			num1  += 1;
		}
	}
}
