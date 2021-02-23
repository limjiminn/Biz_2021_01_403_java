package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {

	public static void main(String[] args) {

		// 100개의 요소를 저장할수 있는 정수형 배열 intNums 선언 및 생성(초기화)
		int[] intNums = new int[100];

		// Random 클래스를 사용
		Random rnd = new Random();

		// 1 ~ 10까지의 정수를 생성하여 intNums 배열에 저장
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}

		// Scanner클래스를 사용
		Scanner scan = new Scanner(System.in);

		// 키보드를 통해 1 ~ 10까지중 정수를 입력 받고
		System.out.println("1 ~ 10까지중 정수 입력");
		System.out.print("정수 입력 >> ");
		int keyNum = scan.nextInt();

		// 입력받은 정수가 배열 intNums의 몇번째에서 최초로 나타나는 위치 번호만 출력
		for (int i = 0; i < intNums.length; i++) {
			if (keyNum == intNums[i]) {
				System.out.println(i + "번째 위치");
				break;
			}

		}
	}

}
