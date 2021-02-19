package com.callor.applications;

import java.util.Scanner;

public class ScannerEx_01 {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두개의 정수를 입력하세요");

		System.out.print("숫자 1 >> ");
		int num1 = scan.nextInt();	
		
		System.out.print("숫자 2 >> ");
		int num2 = scan.nextInt();
		scan.nextLine(); // 이름 입력할수있게 도와줌
		
		System.out.print("이름 >> ");
		String strName = scan.nextLine();
		
		
		/*
		 * nextline으로 인한 숫자 저장은 문자열로 인식
		 * 문자열 입력후 숫자열 입력은 가능
		 * 하지만
		 * 숫자열 입력후 문자열 입력은 불가능
		 */
		System.out.println(num1 + num2);
		System.out.println("30" + "40");
		System.out.println(strName);
		
		
		
	}

}
