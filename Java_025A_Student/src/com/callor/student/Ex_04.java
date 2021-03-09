package com.callor.student;

import com.callor.student.model.StudentVO;

public class Ex_04 {
	
	public static void main(String args[]) {
		//배열 10개를 선언
		StudentVO[] stdArray = new StudentVO[10];
		//배열을 선언만하고 초기화를 안시켯다.
		int intdex = 2;
		
		stdArray[index] = new StudentVO();
		for(int i = 0; i < stdArray.length; i++) {
			stdArray[i] = new StudentVO();
		}
		
		stdArray[index].setStName("홍길동");
		stdArray[index].setStNum("0001");
		
		System.out.println("이름 :" + stdArray[index].setStName());
		System.out.println("이름 :" + stdArray[index].setStNum());
	}

}
