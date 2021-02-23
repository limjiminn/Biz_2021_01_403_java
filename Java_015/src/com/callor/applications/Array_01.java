package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {

		// 1. 100개의 요소를 저장할수 있는
		// 정수형 배열 intNums 선언 및 생성(초기화)
		int[] intNums = new int[100];

		/*
		 * 2.  Random 클래스를 사용하여 1 ~ 10까지의 정수를 생성하여 intNums 배열에 저장
		 */
		//Random클래스를 사용하여 rnd객체를 선언하고
		//= new Random() 명령을 사용하여
		// rnd 객체를 인스턴스화 시킨다.
		// rnd : Random 클래스의 인스턴스
		Random rnd = new Random();
		
		//rnd 인스턴스의 nextInt() method 를 호출(실행) 하라
		//매개변수 값으로 100을 전달하라
		
		// Random 클래스의 nextInt() method에 정수 100을 전달하고 실행하여
		// return하는 결과를 num 변수에 저장하라
		// num 변수에는 0 ~ 99 까지 중 1개의 숫자가 저장될 것이다.
		// int num =rnd.nextInt(100);
		
		/*
		 *  num 변수에는 1 ~ 100까지 중 1개의 숫자가 저장될 것이다
		 *  num = rnd.nextInt(100) + 1;
		 *  
		 *  정수 100개를 저장할 배열 변수를 선언
		 *  // 생성(초기화 : 사용할 준비를 하라) 하라
		 *  int[ ] intNums = new int[100];
		 *  
		 *  0 ~ (intNums.length -1) 횟수만큼 반복문을 실행하겟다
		 *  for(int i - 0; i < intNums.length; i++) {
		 *  
		 *  intNums의 i번째 위에 정수 100을 저장하라
		 *  i 값을 0 ~(intNums.length -1)까지 값을 갖게 되므로
		 *  전체 배열 100개에 정수 100을 저장하라
		 *  intNums[i] = 100;
		 *  }
		 *  
		 *  정수 0 ~ intNums.length 까지의 정수를 만들어서 intNums의 위치값으로 정하고
		 *  1 ~ 10까지 임의 숫자를 생성하여 intNums의 배열에 채워 넣어라
		 *  for(int i = 0; i < intNums.length; i++) {
		 *  
		 *  		Random 클래스의 nextInt() method 를 호출하면서
		 *  		정수 10을 전달하고 return 된 결과에 1을 더하라
		 *  		1 ~ 10까지 중 임의 숫자 1개를 만들어라
		 *  		임의로 생성된 숫자를 intNums의 i번째 위치에 저장하라
		 *  	intNums[i] = rnd.nextInt(10) + 1;
		 * 
		 */
							

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}

		/*
		 * 3. Scanner 클래스를 사용하여 키보드를 통해 1 ~ 10까지 중 정수를 
		 * 입력 받아 입력 받은 정수가 배열 intNums 에 몇번 저장되어
		 * 있는지 찾아 개수를 출력
		 */
		Scanner scan = new Scanner(System.in);

		System.out.print("정수 입력(1 ~ 10) >> ");
		int num = scan.nextInt();
		int count = 0;

		for (int i = 0; i < intNums.length; i++) {

			if (num == intNums[i]) {
				count += 1;

			}
		}

		System.out.println(count);
	}

}
