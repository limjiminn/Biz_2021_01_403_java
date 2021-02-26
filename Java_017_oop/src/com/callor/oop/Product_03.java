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

			// 매입단가, 매출단가는 0미만값은 입력할수 없도록 코드를 수정
			while (true) {
				System.out.print("매입단가 >> ");
				String strIprice = scan.nextLine();
				//문자열을 숫자열로
				int intIprice = Integer.valueOf(strIprice);
				if (intIprice < 0) {
					System.out.println("0이상 입력해주세요.");
				} else {
					pVO[i].iPrice = intIprice;
					break;
				}
			}

			while (true) {
				System.out.print("매출단가 >> ");
				String strOprice = scan.nextLine();
				//문자열을 숫자열로
				int intOprice = Integer.valueOf(strOprice);
				if (intOprice < 0) {
					System.out.println("0이상 입력해주세요.");
				} else {
					// 정상처리되었으면(단가가 0이상 입력되었으면)
					// VO에 값을 저장하고 다음단계로 진행
					// 현 시점의 While()은 중단하라
					pVO[i].oPrice = intOprice;
					break;
				}
			}
			pVO[i].toString();

		}

	}

}
