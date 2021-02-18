package com.callor.applications.service;

import java.util.Random;
import java.util.Scanner;

/*
 * service : 메인메소드가 없고 메인메소드에서 생성하고 호출해줘야함
 */
public class ClassServiceV2 {
	/*
	 * 클래스 차원에서 선언된 변수
	 * 인스턴스 변수
	 * 		ClassDerviceV2 클래스를 사용하여 (어디선가) 객체를 선언하고
	 * 		초기화 하여 인스턴스화 되었을떄 부터 자동으로 생성되는 변수
	 * 
	 * -현재 클래스의 모든 method에서 공용으로 읽고 쓰기가 가능한 변수
	 */
	private Random rnd = new Random();
	private int sum = 0;
	private Scanner scan = new Scanner(System.in);
	
	//
	public void for_1() {
		//sum1: (메소드) 지역 변수 : for_1 메소드가 끝나면 소멸
		int sum1 = 0;
		
		//i : (for반복문) 지역변수
		// 명령문이 끝나면 소멸
		for(int i = 0; i < 10; i++) {
			
			//num : (for 반복문) 지역변수
			int num = i + 1;  //for문이 끝나면 소멸
			sum1 += num;
		}
		 System.out.println(sum1);
	}
	
	public void sum() {
		System.out.println("sum method 에서의 sum = " + sum);
	}
	
	//덧셈
	public void add() {
		int num1 = rnd.nextInt(100);
		int num2 = rnd.nextInt(100);
		
		sum = num1 + num2;
		System.out.print(num1);
		System.out.print(" + ");
		System.out.print(num2);
		System.out.print(" = ");
		System.out.println(sum);
	}	
	//곱셈
	public void times() {
		/*
		 * num1 과 num2 는 add() method에도 선언되어있지만
		 * 선언된 method 가 다르므로 이름만 같을뿐 전혀다른 변수다.
		 */
		int num1 = rnd.nextInt(100) + 1;
		int num2 = rnd.nextInt(100) + 1;
		
		int result = num1 * num2;
		System.out.print(num1);
		System.out.print(" x ");
		System.out.print(num2);
		System.out.print(" = ");
		System.out.println(result);
		
	}
	//나눗셈
	public void division() {
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.print(num1);
		System.out.print(" / ");
		System.out.print(num2);
		System.out.print(" = ");
		System.out.print(num1 / num2);
		
	}
	//뺼셈
	public void substration() {
		
	}

}
