package com.callor.applications;

import java.util.Scanner;

public class Prime_01 {

	public static void main(String[] args) {


		//Scanner 클래스를 사용하여 2이상의 정수를 입력받아 변수에 저장
		Scanner scan = new Scanner(System.in);
		
		System.out.print("2이상의 정수 입력 >> ");
		int num = scan.nextInt();
		
		//변수에 저장한 정수가 소수 인가를 판별하여 출력
		//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 
		//  d d   d   d         d     d 
		boolean bYes1 = num % (num / 2) != 0;
		
		
		if(bYes1) {
			System.out.println(num + "은(는) 소수다");
		}else {
			System.out.println(num + "은(는) 소수가 아니다");
		}
		
		
		
		
	}

}
