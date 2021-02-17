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

	

	/*
	 * 문자열형 변수 1개를 매개변수로 갖는 input() method
	 * input이 하는일?
	 * 무한반복을하는동안에 
	 * "점수입력 >> " 가 출력되고 임의의 수를 입력하면
	 * 0보다 작거나 100보다 크면 출력값이나오면서 무한반복하게된다. 
	 * 조건문에따라서 출력된다.
	 */
	public int input(String subject) {  //return 키워드를사용하려면 void 사용하면안된다(정수형 int/)
		//문자열형 변수 subject 를 매개변수로 전달받는 메서드 input 를 선언하라 
		Scanner scan = new Scanner(System.in);
		//Scanner 메서드변수 scan에 새로운 Scanner를 저장한다.(clear한다)
		int intScore = 0;
		//정수형 변수 intScore에 0을 저장한다.(clear한다)
		while (true) {
			//while 반복문이 true일때 break가 나오기전까지 무한반복한다.
			System.out.print( subject + " 점수 입력 >> ");
			//Run을 시작하면 Console에 "점수 입력 >> : " 을 출력하고 임의의 정수를 입력하라.
			intScore = scan.nextInt();
			//Console에 입력한 임의의 정수를 정수형변수 intScore에 저장한다.
			if (intScore < 0) {
				System.out.println(subject + " 점수는 0점 이상 입력!!!");
				//만약 정수형변수 intScore가 0보다 작으면 "점수는 0점 이상 입력!!!"을 출력하라 
			} else if (intScore > 100) {
				System.out.println(subject +" 점수는 100점 이하 입력!!!");
				//아니면 만약 정수형변수 intScore가 100보다 크면 "점수는 100점 이하 입력!!!"을 출력하라
			} else {
				break;
			}//아니면 break 하라(if 조건문을 종료하라)
		}
		//System.out.println("입력한 점수 : " + intScore);
	 	//"입력한 점수 : "와 intScore에 저장된 임의의 정수를 출력하라
			return intScore;
			//호출한 코드에서
			//return 30; == int intKor에 30을 담아라
			//return 100; == int intKor에 100을 담아라
	}
}
