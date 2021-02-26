package com.callor.oop;

import java.util.Scanner;

public class String_01 {

	public static void main(String[] args) {


		String str1 = "대한민국";
		//아직 값이 정해지지않은 상태
		String str2 = ""; 
		
		int num1 = 0;
		//숫자값이 실제로 입력을했는지 안한건지 구별할때
		//null : 아무것도 아니다?
		Integer num2 = null; 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 >>");;
		String strNum = scan.nextLine();
		/*
		 * null : 0도아니고 어떤값도아닌 아무것도 없는 것
		 * 			클래스를 객체로 선언할때 임시로 설정하는값으로사용
		 * 
		 *  Random rnd = new Random(); 이렇게 사용하는것이 좋다.
		 *  또는 
		 *  Random rnd = null;
		 */
		if(strNum ==null) {
			System.out.println("숫자를 반드시 입력하세요");
		}

	}

}
