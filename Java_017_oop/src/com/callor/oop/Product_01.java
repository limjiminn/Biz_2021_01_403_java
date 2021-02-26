package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_01 {
	public static void main(String[] args) {
	
	ProductVO pdVO = new ProductVO();
	System.out.println("toString() :" + pdVO.toString());
	//클래스를 만들면 클래스 내부에 toString() 메소드를 자동으로
	//만들어 놓는다. 
	Scanner scan = new Scanner(System.in);
	
	System.out.println("=================================");
	System.out.println("상품 정보 등록(입력) 시스템 V1");
	System.out.println("---------------------------------");
	
	System.out.print("상품코드 입력 >> ");
	pdVO.strPCode = scan.nextLine();
	
	System.out.print("상품명 입력 >> ");
	pdVO.strPName = scan.nextLine();
	
	System.out.print("품목명 입력 >> ");
	pdVO.strItem = scan.nextLine();
	
	System.out.print("거래처 입력 >> ");
	pdVO.strDName = scan.nextLine();
	
	System.out.print("매입단가 입력 >> ");
	pdVO.iPrice = scan.nextInt();
	
	System.out.print("매출단가 입력 >> ");
	pdVO.oPrice = scan.nextInt();
	
	//내가 만든 코드가 정상적으로 작동되는지
	//오류가있는지 확인하기위한 코드 : 디버깅 코드
	
	pdVO.toString();// 디버깅을 편하게하기위한 코드
	
	
	}
}

