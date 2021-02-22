package com.callor.applications;

public class Number_02 {

	public static void main(String[] args) {
		
		int intNum1 = 0;
		int intNum2 = 0;
		
		intNum1 = 33;
		intNum2 = 77;
		//num1 =33   (44)  77
		//num2 = 77  (44)  33
		
		
		if(intNum1 < intNum2) {
			intNum1 += 44;
			intNum2 -= 44;
		}
		System.out.println(intNum1);
		System.out.println(intNum2);
		
		

	}

}
