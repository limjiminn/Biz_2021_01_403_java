package com.callor.applications.service;

/*
 * Version(버전)
 * V1.0.0 (최초)
 * V1.0.1 사소한 기능 수정
 * V1.1.0 기능 수정
 * V2.0.0 디자인? 기능 수정
 * V2.1.0
 * V2.1.11 
 * 
 * 버전이 배포가 되는순간 릴리즈 되었다고 표현한다.
 * (= 개발자가 App 을 완성하여 (보통)사용자가 사용할 준비가 되었다.)
 */
public class ScoreServiceV2 {
	/*
	 * 성적을 출력하는 용도만의 method
	 * 매개변수(Parameter,argument)
	 * 		method의 ()안에서 선언된 변수들..
	 * 여기에서는 intKor,intEng,intMath
	 * 
	 *누군가 print() method 를 호출하면서 국어, 영어, 수학 점수(값)을
	 *  주입하면그 값을 받을 변수(바구니)
	 * 
	 * 만약 객체.print(3,6,8) 형식으로 호출을 하면
	 * int intKor = 3. int intEng = 6, int intMath = 8 처럼
	 * 변수를 선언하는 것과 같은 코드가 된다.
	 * 
	 */
	public void print(int intKor, int intEng, int intMath) {
		
		System.out.println("====================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------");
		
		System.out.print(intKor + "\t");
		System.out.print(intEng + "\t");
		System.out.print(intMath + "\t");
		
		int intSum = intKor + intEng + intMath;
		
	}
	/*
	 *  누군가가 3개의 정수값을 전하면서 호출을 하면
	 *  각각 intKor, intEng, intMath에 받고
	 *  세 변수의 값을 덧셈하여 intSum에 저장하고
	 *  저장된 값을 Console에 출력
	 */
	public void sum(int intKor, int intEng, int intMath) {
		int intSum = intKor + intEng + intMath;
		System.out.println(intSum);
	}
	
	public void sum() {
		System.out.println("3개의 매개변수가 필요");
	}
	
	public void sum(int num1,int num2,int num3,int num4) {
		System.out.println("매개변수는 3개만");
	}

}
