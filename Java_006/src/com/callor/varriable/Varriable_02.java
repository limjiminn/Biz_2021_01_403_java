package com.callor.varriable;

public class Varriable_02 {

	public static void main(String[] args) {
		
		// 연산하고자 하는 원래 값이 저장되는 변수
		int num1 = 0;
		int num2 = 0;  //0으로 선언을 해놔야 안전하다.(클리어)
		
		//변수에 연산할 값을 저장하기
		num1 = 30;
		num2 = 40;
		
		// 연산결과를 저장할 변수 선언과 초기화
		int result1 = 0; //요것도 마찬가지
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;
		int result5 = 0;
		
		//연산결과를 변수에 저장하기
		result1 = num1 + num2;
		result2 = num2 - num1;
		result3 = num1 * num2;
		result4 = num2 / num1;
		result5 = num2 % num1;
		
		// 변수에 저장된 결과를 Console에 출력
		// 30 + 40 = 70
		//System.out.println("30 + 40 =" + (30+40));
		
		//간결한 출력문
		//덧셈
		System.out.print(num1);
		System.out.print(" + ");
		System.out.print(num2);
		System.out.print(" = ");
		System.out.println(result1);
		
		//뺄셈
		System.out.print(num2);
		System.out.print(" - ");
		System.out.print(num1);
		System.out.print(" = ");
		System.out.println(result2);
		
		//곱셈
		System.out.print(num1);
		System.out.print(" x ");
		System.out.print(num2);
		System.out.print(" = ");
		System.out.println(result3);
		
		//나눗셈
		System.out.print(num2);
		System.out.print(" ÷ ");
		System.out.print(num1);
		System.out.print(" = ");
		System.out.println(result4);
		
		//나머지(MOD)
		System.out.print(num2);
		System.out.print(" MOD ");
		System.out.print(num1);
		System.out.print(" = ");
		System.out.println(result5);
		
		
		
		

	}

}
