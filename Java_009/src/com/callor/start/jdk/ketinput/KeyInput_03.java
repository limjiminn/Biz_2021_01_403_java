package com.callor.start.jdk.ketinput;

import java.util.Random;
import java.util.Scanner;

public class KeyInput_03 {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num1 = rnd.nextInt(100) + 1;
		
		System.out.print("숫자입력 >> ");
		int num2 = scan.nextInt();
		System.out.println("=====================================================");
		if(num1 > num2) {
			System.out.println( num1 + "은(는) " + num2 +"보다 크다");
		}
		if(num1 == num2) {
			System.out.println( num1 + "은(는) " + num2 +"와(과) 같다");
		}
		if(num1 < num2 ) {
			System.out.println( num1 + "은(는) " + num2 +"보다 작다");
		}
		System.out.println("=====================================================");
		
		if(num1 > num2) {                //1. num1 > num2 이냐?
			System.out.println( "큰값"); // 맞으면 "큰값" 표시하고 종료
		}else if(num1 == num2) {	 	 // 2. 그렇지 않으면  num1 == num2 이냐?
			System.out.println( "같음"); // 맞으면 "같음" 표시하고 종료
		}else if(num1 < num2 ) {		 // 3. 그렇지 않으면 num1 > num2 이냐?
			System.out.println( "작은값"); //  맞으면 "작은값" 표시하고 종료
		}
		
		
		

	}

}
