package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceExtendsV1 extends ScoreServiceV4 {
	/*
	 * 클래스의 extends (확장, 상속) ScoreServiceV4 클래스에있는 코드를 사용할수있게 한다.
	 * 
	 * ScoreServiceV4 : parent (부모) 클래스 ScoreServiceExtendsV1 : child(자식) 클래스
	 * 
	 * 단순한 extends 부모 클래스에 정의된 모든 method를 코드 한줄 추가, 수정없이 그대로 사용할수있다
	 * 
	 * 추가 extends 부모 클래스에 정의된 method와 새롭게 추가된 method가 있는 확장된 클래스의 생성
	 */

	public void input() {
		System.out.println("여기는 ExtendsV1의 input()");
	}

	/*
	 * 문자열형 변수 1개를 매개변수로 갖는 input() method
	 */
	public void input(String subject) {

		Scanner scan = new Scanner(System.in);
		int intScore = 0;
		while (true) {

			System.out.print("점수 입력 >> ");
			intScore = scan.nextInt();

			if (intScore < 0) {
				System.out.println("점수는 0점 이상 입력!!!");

			} else if (intScore > 100) {
				System.out.println("점수는 100점 이하 입력!!!");
			} else {
				break;
			}
		}
		System.out.println("입력한 점수 : " + intScore);
	}

}
