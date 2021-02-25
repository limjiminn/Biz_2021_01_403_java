package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_02 {
	
	public static void main(String[] args) {
		
		//ProductVO 클래스를 사용하여
		//객체배열 5개를 선언
		ProductVO pVO[] = new ProductVO[5];
		
		// 키보드를 통해 상품코드, 상품명, 거래처, 품목, 매입단가,
		// 매출단가를 입력받아 객체배열에 저장
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < pVO.length; i++ ) {
		System.out.print("상품코드 >> ");
		pVO[i].strPCode = scan.nextLine();
		}
		for(int i = 0; i < pVO.length; i++ ) {
		System.out.print("상품명 >> ");
		pVO[i].strPName = scan.nextLine();
		}
		for(int i = 0; i < pVO.length; i++ ) {
		System.out.print("품목명 >> ");
		pVO[i].strItem = scan.nextLine();
		}
		for(int i = 0; i < pVO.length; i++ ) {
		System.out.print("거래처 >> ");
		pVO[i].strDName = scan.nextLine();
		}
		for(int i = 0; i < pVO.length; i++ ) {
		System.out.print("매입단가 >> ");
		pVO[i].iPrice = scan.nextInt();
		}
		for(int i = 0; i < pVO.length; i++ ) {
		System.out.print("매출단가 >> ");
		pVO[i].oPrice = scan.nextInt();
		}
		//저장된 결과 출력
		pVO.toString();
		
	}

}
