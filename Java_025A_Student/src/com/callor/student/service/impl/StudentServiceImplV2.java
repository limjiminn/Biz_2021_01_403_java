package com.callor.student.service.impl;

import java.util.Scanner;

import com.callor.student.model.StudentVO;
import com.callor.student.values.Values;

public class StudentServiceImplV2 extends StudentServiceImplV1{

	
	/*
	 * StudentServiceImplV1을 상속받아서
	 * searchStudent() 만 다시 정의하여 구현하겠다.
	 */
	@Override
	public void searchStudent() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println(Values.dLine(50));
			System.out.println("찾는 학생 이름을 입력");
			System.out.println(Values.sLine(50));
			System.out.println("이름 >> ");
			String strName = scan.nextLine();
			
			if(strName.equals("QUIT")) {
				System.out.println("종료");
				break;
			}
			boolean bYesSearch = false;
			for(StudentVO sVO : stdList) {
				
			}
		}
		
	}
	
}
