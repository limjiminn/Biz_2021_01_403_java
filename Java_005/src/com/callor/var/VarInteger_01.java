package com.callor.var;

public class VarInteger_01 {
	public static void main(String[] args) {
		
		//0. 정수형 변수 intNum1을 선언하고 정수형 값 30을 저장하라
		int intNum1 = 30;
		Integer intNum2 = 40;
		//키워드와 관계없이 변수 이름은 중복선언불가!!!
		//int intNum2 = 50;
		
		//변수의 사용법
		
		//1. 읽기
		//변수에 저장된 값은 아무리 많이 읽어도 저장된값이 변하지않는다.
		System.out.println(intNum1);
		System.out.println(intNum1);
		System.out.println(intNum1);
		System.out.println(intNum1);
		System.out.println(intNum1);
		
		//2. 변수에 값 저장하기
		//왼쪽에 변수명 = 오른쪽에 값
		//변수 intNum1에 정수형 값 50을 저장하라
		intNum1 = 20;
		//어떤값을저장하게되면 이미있던값은 클리어된다.
		intNum1 = 50;
		//50 = intNum1; 잘못된 코드
		intNum2 = 20;

	}

}
