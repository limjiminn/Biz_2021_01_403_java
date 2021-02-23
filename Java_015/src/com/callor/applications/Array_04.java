package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_04 {

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
		System.out.println("1 ~ 10까지 중 정수 입력");
		System.out.print("정수 입력 >> ");
		int keyNum = scan.nextInt();
		
		/*
		 * 변수는 앞에서 어떤 값을 저장했던 상관없이 
		 * 가장 마지막에 저장한 값만 가지고있다.
		 */
		int last = 0;
		// 입력받은 정수가 배열 intNums의 몇번째에서 가장 마지막으로 나타나는 위치 번호만 출력
		for (int i = 0; i < intNums.length; i++) {
			// System.out.printf("%d %d\n",intNums[i],i); 디버깅
			if (keyNum == intNums[i]) {
				// 키보드로 입력한 값이 일치할때마다
				// 그 위치를 lastPos에 저장한다.
				last = i;

			}

		}
		//여기 오면 last에 저장된 값은 가장 마지막으로 last = i 이 실행된
		// 결과만 담고 있다.
		System.out.println(last + "번째");
	}

}
