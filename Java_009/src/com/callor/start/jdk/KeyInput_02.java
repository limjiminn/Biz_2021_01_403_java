package com.callor.start.jdk;

import java.util.Scanner;

public class KeyInput_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자입력 >> ");
		int intNum1 = scan.nextInt();
		
		boolean bYes = intNum1 % 2 == 0;
		if(bYes) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		

	}

}
