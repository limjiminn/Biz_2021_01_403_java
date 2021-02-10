package com.callor.applications.myclass;

import java.util.Scanner;

/*
 * main() method 가 없는 클래스 선언
 */
public class MyGuGuDan {

	/*
	 * public (누구나) 사용할수 있는 gugu() method 선언 대문자로 시작하는건 클래스뿐 / 변수나 메소드는 소문자
	 * 
	 * 임의로 어떤 일을 수행하기 위한 명령문 생성
	 */
	public void gugu() {

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력 (2 ~ 9) >> ");
		int num = scan.nextInt();

		System.out.println("======================");
		System.out.println("구구단 " + num + "단");
		System.out.println("----------------------");

		for (int i = 0; i < 8; i++) {
			int num2 = i + 2;
			System.out.print(num);
			System.out.print(" x ");
			System.out.print(num2);
			System.out.print(" = ");
			System.out.println(num * num2);
		}

	}

}
