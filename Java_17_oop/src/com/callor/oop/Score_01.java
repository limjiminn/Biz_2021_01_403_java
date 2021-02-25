package com.callor.oop;

/*
 * Value Object의 인스턴스 변수 은닉
 * 인스턴스 변수는 public으로 선언하지 않고
 * 보통 private 으로 선언을 한다.
 * VO클래스를 사용하여 선언된 VO객체는 인스턴스 변수에 직접 접근할 수 없다.
 * ScoreVO sVO = new ScoreVO();
 * sVO.strName ="홍길동" // 이런코드는 사용불가
 * String name = sVO.strName // 이코드도 사용불가
 * 
 * 
 * private 으로 선언된 인스턴스에 접근하기 위한
 * 		setter, getter method 들을 통해서 접근해야한다/
 * 저장할떄는 :sVO.seyStrName("홍길동");
 * 읽을때는 : name = sVO.getStrName();
 * 
 * 은닉된 인스턴스 변수는  getter,setter method 를 통해서 변수에 접근을 한다
 * 
 * 캡슐화
 * 	getter, setter의 코드를 몰ㄹ라도
 * 	setIntKor() method는 intKor 인스턴스 변수에 값을 저장
 * 	getIntKor() method는 intKor 인스턴스 변수에서 값을 읽기 기능을 한다는 것을 알수있다.
 *  코드내용이 어떠한지 몰라도
 * 	getter(읽는거)와 setter(저장하는거)를 통하여 변수에 접근(저장, 읽기)할수있다.
 * 
 */
import java.util.Scanner;

import com.callor.oop.model.ScoreVO;


public class Score_01 {
	public static void main(String[] args) {

		ScoreVO scoreVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);

		System.out.println("=======================");
		System.out.println("성적입력 시스템 v1");
		System.out.println("=======================");

		while (true) {
			System.out.println("학생 이름을 입력하세요");
			System.out.print(">> ");
			String strName = scan.nextLine();
			scoreVO.strName = strName;

			while (true) {
				System.out.println("국어점수를 입력하세요");
				System.out.print(">> ");
				String strKor = scan.nextLine();
				try {
					int intKor = Integer.valueOf(strKor);
					//scoreVO.intKor = intKor;
					break;
				} catch (Exception e) {
					System.out.println("국어점수는 숫자로만 입력");
					continue;
				}
			}

			System.out.println("영어점수를 입력하세요");
			System.out.print(">> ");
			String strEng = scan.nextLine();

			System.out.println("수학점수를 입력하세요");
			System.out.print(">> ");
			String strMath = scan.nextLine();

		} // end while
	}
}