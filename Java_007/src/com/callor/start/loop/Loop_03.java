package com.callor.start;

public class Loop_03 {
	
	public static void main(String args[]) {
		//메인메소드 (로컬) 스코프 변수 intSum
		int intSum = 0;
		
		for(int i = 0; i < 10; i++) {
			// main() method scope 변수인 intSum은
			//for() 반복문 내에서 자유롭게 읽기 저장이 가능
			intSum += 10;
			System.out.println(i + " " +intSum);
		}
		//
		//		변수 i는 이미 소멸되었다
		//		변수 intSum은 값을 읽을 수 있다
		System.out.println("======================");
		System.out.println("intSum =" + intSum);
		System.out.println("======================");
		
		// 이미 선언되어 사용중인 변수를 clear
		intSum = 0;
		for(int i = 0; i < 10; i++) {
			
			int num1 = i + 1;
			intSum += num1;
			
		}
		System.out.println("1 ~ 10 까지 덧셈 : " + intSum);
	}

}
