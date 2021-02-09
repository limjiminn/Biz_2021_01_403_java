package com.callor.start.jdk;

import java.util.Scanner;

public class KeyInput_01 {

	// 키보드로 숫자 2개를 입력받고 두 숫자의 덧셈을 계산
	// scanner : 키보드로부터 무언갈 입력받기위한 명령어 
	public static void main(String[] args) {
		
		System.out.println(); //Console 출력문
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력 >> "); //프롬프트
		int intNum1 = scan.nextInt();   //임의의 정수를 intNum1에 저장
		
		System.out.print("두번째 숫자를 입력 >> ");	//프롬프트
		int intNum2 = scan.nextInt();	//임의의 정수를 intNum2에 저장
		
		System.out.println(intNum1 + intNum2);
		

	}

}
