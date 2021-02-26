package com.callor.oop.exp;

import java.util.Scanner;

public class Exception_01 {
	
	public static void main(String args[]) {
		
		
		//Integer.valueOf("3"); // 숫자 3을 만들어낸다.
		//Integer.valueOf(""); //아무것도 아니다
		//""값을 정수로 바꿔봐라
		
		//try catch : 예외처리
		try {
			Integer.valueOf("");
		} catch (NumberFormatException e) {
			System.out.println("null 값은 숫자로 변환할수 없음");
		}
		
		// 정수형 3과 문자열 3은 아예다른 코드이다.
		//boolean bYes = 3 == "3";
		//if ( 3 == "3") {}
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("0이상의 정수를 입력하세요");
		System.out.print(">> ");
		String strNum =scan.nextLine();
		
		
		//NumberFormatException: NumberFormatException만 잡아준다.
		//Exception : 모든 Exception 을 잡아준다.
		try {
			int intNum = Integer.valueOf(strNum);
			
			if(intNum < 0) {
				System.out.println("정수 0 이상 입력하세요!!!");
			}else {
				System.out.println("입력한 정수 : " + intNum);
			}
		} catch (Exception e) {
			System.out.println("반드시 숫자로 입력해 주세요");
			
		}
		
		
		
	}

}
