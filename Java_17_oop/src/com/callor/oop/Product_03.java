package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_03 {

	public static void main(String[] args) {

		ProductVO[] pVO = new ProductVO[5];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < pVO.length; i++) {
			pVO[i] = new ProductVO();
		}
		System.out.println("============================");
		System.out.println("나라쇼핑몰 상품관리 V1");
		System.out.println("============================");

		
		for (int i = 0; i < pVO.length; i++) {
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
			String iPrice = scan.nextLine();
			pVO[i].iPrice = Integer.valueOf(iPrice);
			if(pVO[i].iPrice < 0) {
				System.out.println("0이상 입력해주세요.");
				
			}

			System.out.print("매출단가 >> ");
			String oPrice = scan.nextLine();
			pVO[i].oPrice = Integer.valueOf(oPrice);
			if(pVO[i].oPrice < 0) {
				System.out.println("0이상 입력해주세요.");
			}
			pVO[i].toString();
		}

	}

}
