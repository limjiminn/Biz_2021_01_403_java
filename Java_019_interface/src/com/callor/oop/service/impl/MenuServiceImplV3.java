package com.callor.oop.service.impl;

import java.util.Scanner;

import com.callor.oop.service.MenuService;

public class MenuServiceImplV3 implements MenuService {
	
	private Scanner scan;
	
	public MenuServiceImplV3() {
		scan = new Scanner(System.in);
	}
	
	/*
	 * 메뉴를 보여주고 선택된 메뉴에 따라 카트에
	 * 추가, 삭제 하거나 리스트를 보여줘야한다.
	 * 
	 * 사용자가 메뉴를 보고 선택을 했을때
	 * 선택된 결과값을 호출한 곳에 return해줘야 한다.
	 * 
	 * 이렇게 설계를 변경하려면 method를 void type 이 아닌 int나 String 등
	 * 다른 type으로 변경해야한다.
	 * 클래승 method를 변경하려면 interface 부터 변경하고, interface를 impl...한
	 * 모든 클래스를 다 변경해야 한다.
	 * 
	 * interface, class의 원형을 변경하지않고 현재 method에만 어떤 기능을 추가하고자한다.
	 */
	
	public Integer selectMenu = null;
	
	
	public void selectMenu() {
		
		while(true) {
			System.out.println("================================");
			System.out.println("카트 메뉴 시스템 V3");
			System.out.println("--------------------------------");
			System.out.println("1. 카트 추가");
			System.out.println("2. 카트 삭제");
			System.out.println("3. 카트 리스트");
			System.out.println("QUIT. 끝내기");
			System.out.println("--------------------------------");
			System.out.print("선택 >> ");
			String strMenu = scan.nextLine();
			if(strMenu.equals("QUIT")) {
				this.selectMenu = null;
				break;
			}
			try {
				int intMenu = Integer.valueOf(strMenu);
				if(intMenu > 1 && intMenu <= 3) {
					this.selectMenu = intMenu;
					break;
				}
			} catch (Exception e) {

				System.out.println("메뉴는 QUIT(끝내기),"
						+ " 1 ~ 3 까지만 입력하세요");
			}
		}
	}

}
