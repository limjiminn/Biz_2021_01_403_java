package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_02 {

	public static void main(String[] args) {
		// 1. 100개의 요소를 저장 할 수 있는 정수형 배열
		// intNums 선언 및 생성

		int[] intNums = new int[100];

		// Random클래스를 사용하여 1 ~ 10까지의
		// 정수를 생성하여 intNums 배열에 저장

		Random rnd = new Random();

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}

		// Scanner클래스를 사용하여 키보드를 통해
		Scanner scan = new Scanner(System.in);

		System.out.println("정수 1 ~ 10 까지 중 숫자 입력");
		System.out.print("숫자 입력 >> ");
		// 1 ~ 10까지 중 정수를 입력 받고
		int keyNum = scan.nextInt();
		//입력 받은 정수가 배열 intNums에서 몇번째에 나타나는지 위치 번호 출력
		for (int i = 0; i < intNums.length; i++) {
			boolean bYes = intNums[i] == keyNum;
			if (bYes) {
				System.out.println((i + 1) + "번째 위치");
			}
		}
	}

}
