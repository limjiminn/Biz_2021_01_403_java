package com.callor.applications;

public class IntegerEx_01 {
	public static void main(String[] args) {
		
		String strNum1 = "30";
		String strNum2 = "40";
		String strSum = strNum1 + strNum2;
		System.out.println(strSum);
		
		/*
		 * IntegervalueOf("문자열형숫자")
		 * 
		 * 문자열형숫자를 4칙연산이 가능한 정수로 바꾸어서
		 * return 해주는 method
		 */
		int intNum1 = Integer.valueOf(strNum1);
		int intNum2 = Integer.valueOf(strNum2);
		int intSum = intNum1 + intNum2;
		System.out.println(intSum);
		
		String str1 = "11";
		String str2 = "22";
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println(str1 + str2);
		
		
		int num1 = Integer.valueOf(str1);
		int num2 = Integer.valueOf(str2);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println(num1 + num2);
		
	}

}
