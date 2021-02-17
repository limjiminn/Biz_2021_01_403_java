package com.callor.applications;

import java.util.Scanner;

public class Score_01 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int kor = 0;
		int eng = 0;
		int mat = 0;
		/*
		 * 프롬프트
		 * scanner의 nestInt() 를 사용하여
		 * 키보드 입력을 받는 코드가 실행되면 
		 * 화면에 아무것도 없이 멈춘것처럼 보이는 현상이
		 * 있는데 미리 어떤일을 할것인지 알려주는 메시지
		 */
		System.out.print("국어 점수 : ");
		
		//Blocking 되었다. Code Blocking (코드가 멈췃다.)
		//scan.nextInt() 메서드를 호출하면 코드 동작이 멈추고,
		//사용자가 키보드로 무엇인가 입력한 후 enter를 누를때 까지
		// 이후 코드가 실행되지 않는다.
		kor = scan.nextInt();

		System.out.print("영어 점수 : ");
		eng = scan.nextInt();

		System.out.print("수학 점수 : ");
		mat = scan.nextInt();

		if (kor < 100 || eng < 100 || mat < 100) {
			while(true) {
				System.out.println("점수 오류");
				break;
			}
			int tot = kor + eng + mat;
			/*
			 * avg 변수는 실수형이지만 tot은 정수형, 3도 정수형이기 떄문에
			 * avg 변수에 저장되는 값은 소수점 이하가 무조건 0으로 세팅된다.
			 */
			float avg = tot / 3.0f;
			/*
			 * 결과값을 실수형(float, double)으로 하고자 할때는 
			 * tot변수값이나 숫자3을 실수로 만들어줘야 한다.
			 * 
			 * 1. tot을 실수형으로 변경하고 계산하기
			 * 정수형 tot에 담긴 값을 float형 값으로 강제 형변환하여 나눗셈 준비
			 * avg = (float)tot / 3;
			 * 
			 * 2. 숫자 3을 실수형으로 만들어서 나눗셈
			 * tot을 실수 3.0f로 나눗셈을 지시하면 tot변수에 담긴 값은
			 * 자동형변환(자동으로 실수형으로 변환 된다.
			 * avg = tot / 3.0f ( 3.0d)
			 * 
			 * avg = tot / (float)3;
			 */
			System.out.println("===========================================");
			System.out.println("국어\t영어\t수학\t총점\t평균");
			System.out.println("-------------------------------------------");
			System.out.println(kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg);
			System.out.println("===========================================");
		}
	}
}
