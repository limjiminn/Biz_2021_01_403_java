package com.callor.student;

import com.callor.student.values.Values;

/*
 * ===========================
 * 구구단 7단
 * ---------------------------
 * 7 x 1 = 7
 * 7 x 2 = 14
 * 7 x 3 = 21
 * 7 x 4 = 28
 * 7 x 5 = 35
 * 7 x 6 = 42
 * 7 x 7 = 49
 * 7 x 8 = 56
 * 7 x 9 = 63
 * ===========================
 * 
 * 
 */
public class Ex_10 {
	
	public static void main(String[] args) {
		int num = 0;
		
		
		System.out.println(Values.dLine(20));
		System.out.println("구구단 7단");
		System.out.println(Values.sLine(20));

		for(int i = 1; i < 10; i++) {
			 num = 7 * i;
			 System.out.printf("7 x %d = %d\n", i, num);
		}
		System.out.println(Values.dLine(20));
		
		
	}

}
