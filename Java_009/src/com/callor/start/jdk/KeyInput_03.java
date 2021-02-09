package com.callor.start.jdk;

import java.util.Random;
import java.util.Scanner;

public class KeyInput_03 {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num1 = rnd.nextInt(100) + 1;
		
		System.out.print("숫자입력 >> ");
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println( num1 + "은(는) " + num2 +"보다 크다");
		}
		if(num1 == num2) {
			System.out.println( num1 + "은(는) " + num2 +"와(과) 같다");
		}
		if(num1 < num2 ) {
			System.out.println( num1 + "은(는) " + num2 +"보다 작다");
		}
		
		
		

	}

}
