 package com.callor.start.logic;

public class Logic_04 {
	
	public static void main(String[] args) {
		
		//i : 0 ~ 9 ++ 하면서 변화
		// i : 0,1,2,3,4,5,6,7,8,9
		for(int i = 0; i < 10; i++) {
			
			boolean bYes = i % 2 == 0;  //짝수일때 true
			
			//bYes값이 true(짝수)이면 {}의 코드를하고 그렇지않으면 무시하라
			if( bYes ) {
				System.out.println(i + "는 짝수!!");	
			}
		}
		
		int num = 0;
		// num값이 어떤 연산결과를 저장하는 코드
		boolean bYes = num % 2 == 0;
		if(bYes) {
			System.out.println(num + "는 짝수");
		}
	}

}
