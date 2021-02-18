package com.callor.applications.service;

public class ClassServiceV1 {
/*
 * Java 코딩을 할때
 * {중가로}내에서 같은 이름의 변수는 2번이상 선언 불가
 * class{} 내에서 같은 이름의 메서드는 2번이상 선언불가
 * 
 * 하지만 java 에서는 메서드의 매개변수 개수, 타입이 다르면
 * 같은 이름의 메서드를 중복하여 선언할수 있다.
 */
	public void sum(int num1, int num2) {
		
	}
	public void sum(int num1, float num2) {
		
	}
	
	public void add(int intNum1, int intNum2) {
	
		System.out.println(intNum1 + intNum2);

	}

	public void add(int intNum1, float fNum2) {

		System.out.println(intNum1 + fNum2);

	}

	public void add(double dNum1, float fNum2) {

		System.out.println(dNum1 + " + " + fNum2 + " = " + (dNum1 + fNum2));
		System.out.println(dNum1 + " - " + fNum2 + " = " + (dNum1 - fNum2));
		System.out.println(dNum1 + " x " + fNum2 + " = " + (dNum1 * fNum2));
		System.out.println(dNum1 + " / " + fNum2 + " = " + (dNum1 / fNum2));

	}
}
