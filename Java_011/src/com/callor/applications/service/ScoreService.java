package com.callor.applications.service;

import java.util.Scanner;

public class ScoreService {
	/*
	 * java의 class와 method() 호출
	 * ScoreService 클래스에는 main()method가 없어서
	 * 여기에 있는 코드는 직접 Run하여 실행할수 없다.
	 * 누군가가 ScoreService를객체.인스턴스로 만들고
	 * score()method 를 호출해주어야만 코드를 실행할 수 있다.
	 * 
	 * 다른 언어에서는 module 등의 이름으로 사용한다.
	 */
	/*
	 * 클래스와 메서드(메소드, method)의 명명법
	 * 클래스 : 첫글자 영문대문자, 이후 영문 대소문자 숫자
	 * 메소드 : 첫글자 영문소문자, 이후 영문 대소문자 숫자
	 * 
	 * 클래스 명명법 Upper CamelCase 라고 한다.
	 * 메소드 명명법 Lower CamelCase 라고 한다.
	 */
	public void score() {
		Scanner scan = new Scanner(System.in);

		int kor = 0;
		int eng = 0;
		int mat = 0;

		System.out.print("국어 점수 : ");
		kor = scan.nextInt();

		System.out.print("영어 점수 : ");
		eng = scan.nextInt();

		System.out.print("수학 점수 : ");
		mat = scan.nextInt();

		int tot = kor + eng + mat;

		float avg =(float)tot / 3; //권장 코드

		System.out.println("===========================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------");
		System.out.println(kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg);
		System.out.println("===========================================");
	}
}
