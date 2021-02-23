package com.callor.applications;

import java.util.Scanner;

public class Prime_01 {

	public static void main(String[] args) {

		// Scanner 클래스를 사용하여 2이상의 정수를 입력받아 변수에 저장
		Scanner scan = new Scanner(System.in);

		System.out.print("2이상의 정수 입력 >> ");
		int num = scan.nextInt();

		// 변수에 저장한 정수가 소수 인가를 판별하여 출력

		for (int i = 2; i < num; i++) {

			boolean bYes = num % i == 0;

			if (bYes) {
				System.out.println("소수가 아니다");
				break;
			}
		}

		int pos = 0;
		for (pos = 2; pos < num; pos++) {
			if (num % pos == 0) {
				break;
			}
		}
		// pos의 값은?
		System.out.println(pos);
		// for 반복문이 중간에 break 되면
		// 항상 pos < num 관계가 된다.
		// for 반복문이 break 없이 모두 완료 되었으면
		if (pos < num) {
			System.out.println(num + "는 소수가 아님");
		} else {
			System.out.println(num + "는 소수임");
		}

	}

}
