package com.callor.applications;

import java.util.Scanner;

public class Array_03 {

	public static void main(String[] args) {
		
		/*
		 * 문자열 배열 strSub를 선언하고
		 * 문자열 "국어","영어","수학"을 저장(할당)하면서
		 * 자동으로 배열 개수를 생성하라
		 * 
		 * 배열에 저장될 데이터(값들)이 이미 정해져 있는 경우
		 */
		
		//국어 영어 수학 문자열을 데이터 요소로 갖는 strSub 배열을 생성
		String[] strSub = new String[] {"국어","영어","수학"};
		int[] intNum = new int[] {2,3,5,6,3,4,5,6,32,23,156};
		
		int sum = 0;
		//for 반복문을 이용하여 각 과목의 이름을 보여주고
		//키보드로부터 점수를 입력받아 scope변수에 저장
		for(int i = 0; i < intNum.length; i++) {
			sum += intNum[i];
		}
		System.out.println("전체배열의 갯수 : " + intNum.length);
		System.out.println("합계 : " + sum);
		
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < strSub.length; i ++) {
			System.out.print(strSub[i] + " 점수 >> ");
			int score = scan.nextInt();
			System.out.println("입력한 점수 :" + score);
		}
	}

}
