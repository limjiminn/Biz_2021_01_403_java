package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_02 {

	public static void main(String[] args) {

		// ProductVO 클래스를 사용하여
		// 객체배열 5개를 선언
		// VO클래스를 배열로 선언하고
		// 사용(데이터 저장, 읽기) 하려면
		// 선언된 객체배열 요소요소를 모두
		// 다시 초기화(생성)하는 과정이 필요하다.
		ProductVO[] pVO = new ProductVO[5];

		// 키보드를 통해 상품코드, 상품명, 거래처, 품목, 매입단가,
		// 매출단가를 입력받아 객체배열에 저장
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < pVO.length; i++) {
			// 이 과정이 생략되면 이후 코드에서
			// NullppointerException이 발생한다.
			pVO[i] = new ProductVO();
		}
		System.out.println("============================");
		System.out.println("나라쇼핑몰 상품관리 V1");
		System.out.println("============================");

		// 숫자을 문자열로 바꾸기
		// String strN = 3 + ""; "3" 이라는 문자열로 저장

		// 문자를 숫자열로 바꾸기
		// int intN = Integer.valueOf(strN);

		for (int i = 0; i < pVO.length; i++) {
			// 연속된 값으로 상품코드 생성(숫자열을 문자열로)
			String pCode = (i + 1) + "";
			pVO[i].strPCode = pCode;
			System.out.println(pCode + "번 상품정보 입력");

			System.out.print("상품코드 >> ");
			pVO[i].strPCode = scan.nextLine();

			System.out.print("상품명 >> ");
			pVO[i].strPName = scan.nextLine();

			System.out.print("품목명 >> ");
			pVO[i].strItem = scan.nextLine();

			System.out.print("거래처 >> ");
			pVO[i].strDName = scan.nextLine();

			System.out.print("매입단가 >> ");
			// 숫자열을 문자열로 만듬(매입/매출)
			String iPrice = scan.nextLine();
			pVO[i].iPrice = Integer.valueOf(iPrice);

			System.out.print("매출단가 >> ");
			String oPrice = scan.nextLine();
			pVO[i].oPrice = Integer.valueOf(oPrice);
			
			// 저장된 결과 출력
			pVO[i].toString();
		}

	}

}
