package com.callor.oop.model;
/*
 * 쇼핑몰에서 판매되는 상품을 관리하기 위한
 * 데이터를 저장할 용도의 Value object 클래스 디자인(설계)
 * 
 * ProductVO 클래스는
 * productVO.java 파일로 생성이 된다.
 * 클래스를 만들고 파일을 저장하는 과정
 * 클래스 디자인, 설계
 * 
 * "클래스 프로토타입 작성"
 * 클래스 프로토 타입은 객체를 생성하기 위한 설계도 코드
 * 
 * VO(Value Object)클래스는 가장 중요한 부분이
 * 인스턴스 변수를 선언하는 부분
 * 
 * 상품관리를 위해 필요한 데이터들
 * product :상품코드, 상품명, 
 * item : 품목명, 
 * dept :거래처, 
 * 단가:매입단가, 매출단가
 * 		수량을 곱셈하여 연산을 수행
 */
public class ProductVO {
	//상품코드
	public String strPCode;
	//상품명
	public String strPName;
	//품목명
	public String strItem;
	//거래처
	public String strDName;
	//매입단가
	public int iPrice;
	//매출단가
	public int oPrice;



}
