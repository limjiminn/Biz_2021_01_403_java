package com.callor.applications;

import com.callor.applications.service.ClassServiceV5;

public class Class_07 {
	public static void main(String[] args) {

		ClassServiceV5 csV5 = new ClassServiceV5();

		float result = csV5.sum(55.2f, 33.7f);
		
		System.out.println(result);
		
		
		//int num1 = 3;
		//long num2 = 3;
		
		//float 변수를 저장할때 3.0으로만 사용하면
		// double형으로 채택된다.
		//float num3 = 3.0f;
		//double num4 = 3.0;
		
	}

}
