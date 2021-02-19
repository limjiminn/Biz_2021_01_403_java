package com.callor.applications;

import java.util.Scanner;

public class Score_06 {

	public static void main(String[] args) {
		//문자열 배열 strSubject를 3개 선언
		String[] strSubject = new String[3];
		
		//배열의 0번 부터 "국어","수학", "영어"문자열 저장
		strSubject[0] = "국어";
		strSubject[1] = "수학";
		strSubject[2] = "영어";
		
		// 정수형 배열 intScore를 3개 선언
		int[] intScore = new int[3];
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("각 과목의 성적을 입력하세요");
		//for() 반복문을 이용하여 각 과목의 이름을 보여주고 키보드로부터
		//점수를 입력 받아 intScore 배열에 저장
		for(int i = 0; i < 3; i++) {
			System.out.print(strSubject[i] + " >> ");
			intScore[i] = scan.nextInt();
		}
		
		//inScore 배열에 저장된 과목점수의 합계를 계산하여 출력
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += intScore[i];
			
		}
		System.out.println(sum);
	}

}
