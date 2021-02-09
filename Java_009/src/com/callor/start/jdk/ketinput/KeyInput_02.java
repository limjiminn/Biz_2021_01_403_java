package com.callor.start.jdk.ketinput;

import java.util.Scanner;

public class KeyInput_02 {

	public static void main(String[] args) {
		
		//Scanner 클래스를 객체로 생성하면서 
		// 운영체제의 키보드 시스템과 연결한다
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("숫자입력 >> ");
		int intNum1 = scan.nextInt();
		
		boolean bYes = intNum1 % 2 == 0;
		// 입력한 숫자가 짝수인지 홀수인지 판별하여 console에 출력
		if(bYes) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		
		

	}

}
