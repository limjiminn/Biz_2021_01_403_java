package com.callor.oop.service.impl;

import java.util.Scanner;

public class MenuServiceImplV1 {

	Scanner scan = new Scanner(System.in);

	public void selectMenu() {

		while (true) {
			System.out.println("===================================");
			System.out.println("Java Menu System v1");
			System.out.println("-----------------------------------");
			System.out.println("1. 카트추가\n2. 카트삭제\n3. 카트리스트\nQ. 끝내기");
			System.out.println("-----------------------------------");
			
			while (true) {
				System.out.print("선택>> ");
				String strNum = scan.nextLine();
				if (strNum == "Q") {
					System.out.println("종료");
					
				}
				
			}

		}

	}

}
