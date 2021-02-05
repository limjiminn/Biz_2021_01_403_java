package com.callor.start.logic;

public class Logic_02 {
	
	public static void main(String[] args) {
		
		//불값, 논리연산결과를 담는 변수
		//boolean, Boolean
		//3이 3하고 같냐의 답을 bYes라는 값에 저장
		boolean bYes = 3 == 3;  //true가 저장됨
		
		// 3이 3보다 크냐의 답을 bYes라는 값에 저장
		bYes = 3 > 3;   // false가 저장됨
		System.out.println(bYes);
		
		//3이 3이상이냐의 답을 bYes라는 값에 저장
		bYes = 3 >= 3;  //true가 저장됨
		
		int num1 = 55;
		int num2 = 65;
		
		bYes = num1 >= num2;  
		
		bYes = num1 * 2 >= num2;  //산술연산이 먼저 계산된후 논리연산이 진행된다.
		bYes = (num1 * 2) >= num2;
	}

}
