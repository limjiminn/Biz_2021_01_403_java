package com.callor.oop.model;

public class ScoreVO {

	public String strName;
	private int intKor = -1;
	private int intEng = -1;
	public int intMath;
	
	public int intSum;
	public float floatAvg;
	/*
	 * 국어 점수를 저장할 인스턴스 변수를
	 * private 로 선언하여 직접 접근할수 없도록 만든다.
	 * 
	 * 국어점수 인스턴스변수에
	 * 간접적으로 값을 저장하는 setIntKor() method를 선언
	 * 
	 * setIntKor() method는 점수를 문자열로 받아서 정수로 변경한 다음
	 * 범위검사를 수행하고 유효성통화(정상적인 점수일 경우)를 한ㅇ 경우만
	 * 국어 인스턴스 변수에 저장한다.
	 * 
	 * 
	 * 만약 점수가 잘못되어 유효성검사를 통과하지 못하면 국어점수는 -1로
	 * 세팅되어 있을 것이다.
	 */
	//잘못입력되는 경우를 막을수있다.
	public void setIntKor(String strKor) {
		
		try {
			int intKor =Integer.valueOf(strKor);
			if(intKor >= 50 && intKor <= 100) {
				this.intKor = intKor;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	public int getIntKor() {
		return this.intKor;
	}
	/*
	 * VO클래스를 설계하면서
	 * intEng 인스턴스 변수를 private 으로 설정하여 변수에 직접 접근하지 못하도록 하고
	 * 변수에 값을 저장할떄는 setIntEng() method를 통해서 값을 저장하도록 설정한다.
	 * 
	 * 이때 setIntEng() method는 점수를 매개변수로 전달받아서 유효성검사를 수행하고
	 * 검사가 통과 되었을떄만 intEng 변수에 저장(setting)할수 있도록 만드는 것
	 * 
	 */
	//값 저장하는 부분
	public void setIntEng(String strEng) {
		try {
			int intEng = Integer.valueOf(strEng);
			if(intEng >= 50 && intEng <= 100) {
				this.intEng = intEng;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	/*
	 * 변수에 값을 저장하기 전에 유효성검사를 하기 위해서
	 * setIntEng() method를 통하도록 코드를 변경했다
	 * 변수는 private으로 setIntEng() method 선언
	 * intEng 변수의 값을 읽지도 못하는 상황이 발생한다
	 * intEng 변수의 값을 저장한 후 읽을수 있어야 되는데
	 * intEng 변수의 값을 읽기 위해서 getIntEng() 라는 메서드를 또하나 선언해둔다.
	 * 
	 */
	//값 읽는 부분
	public int getIntEng() {
		return this.intEng;
	}
	
	
}
