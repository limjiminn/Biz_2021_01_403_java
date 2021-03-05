package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;

public class MenuServiceImplV1 implements MenuService {

	private Scanner scan;
	
	
	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}

	public Integer selectMenu() {
		int intNum = 0;
		while(true) {
		System.out.println("============================");
		System.out.println("빛나라 고교 성적처리 시스템");
		System.out.println("----------------------------");
		System.out.println("1. 학생성적 점수 생성");
		System.out.println("2. 학생성적 점수 파일에 저장");
		System.out.println("3. 성적결과 확인");
		System.out.println("QUIT. 끝내기");
		System.out.println("============================");
		System.out.print("선택 >> ");
		String strNum = scan.nextLine();
		if(strNum.equalsIgnoreCase("QUIT")) {
			break;
		}
		try {
			intNum = Integer.valueOf(strNum);
			if(intNum >= 1 && intNum <= 3) {
				return intNum ;
			}else {
				System.out.println("1 ~ 3 중에 하나만 선택해주세요");
			}
		} catch (Exception e) {
			System.out.println("QUIT, 1, 2, 3 중에 하나만 선택해주세요");
		}
		}
		
		return null;
	}
	
	
	

}
