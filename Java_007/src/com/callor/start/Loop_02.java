package com.callor.start;

public class Loop_02 {

	public static void main(String args[]) {
		
		for(int i = 0; i < 10; i +=1) {
			 
		}
		
		int num = 0;
		num = num + 1;
		num += 1;  
		//num =+ 1; 이코드는 사용하지말것
		num++;    //num라는 변수를 1증가시켜라(단항 연산자)
		++num;    //num라는 변수를 1증가시켜라
		
		
		num = num - 1;
		num -= 1;
		num--;   //num라는 변수를 1감소시켜라
		--num;
		//for(i값을 선언하고; 비교문; 어떻게 변화시킬것인가)
		for(int i = 0; i < 10; i++) {
			
		}
		
		for(int i = 100; i > 0; i--) {
			System.out.println(i);
		}
		
	}
}
