package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	// 클래스 영역에 선언된 변수들
	// 인스턴스 변수 (= 멤버 영역)
	// ScoreServiceV1 cscV1; : 클래스를 객체로 선언하고
	// =new scV1() : 객체의 초기화
	// 인스턴스 : 객체가 초기화( = new scV1()) 를하면
	// 자동으로 사용할 준비가 되는 변수들
	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	private int intSum = 0;
	private float fAvg = 0;
	private Scanner scan = new Scanner(System.in);

	// input() method가 호출되면
	// 키보드를 통해서 국어,영어,수학 점수를 입력받고
	// intKor,intEng,intMath에 저장

	public void input() {

		// input() method의 지역변수
		// int intKor = 0;

		System.out.print("국어 점수 : ");
		intKor = scan.nextInt();

		System.out.print("영어 점수 : ");
		intEng = scan.nextInt();

		System.out.print("수학 점수 : ");
		intMath = scan.nextInt();
	}

	public void sum() {
		intSum = intKor + intEng + intMath;

	}

	public void avg() {
		fAvg = (float)(intSum) / 3;

	}

	public void print() {
		System.out.println("국어 : " + intKor);
		System.out.println("영어 : " + intEng);
		System.out.println("수학 : " + intMath);
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + fAvg);
		
		//%3.2f = 실수값을 출력하는데
		//정수부분 3자리,소수점 2자리 출력
		//소숫점이하 3번째에서 반올림
		//System.out.printf("평균 : %3.2f\n", fAvg);
	}

}
