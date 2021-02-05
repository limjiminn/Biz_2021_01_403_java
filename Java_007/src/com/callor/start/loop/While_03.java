package com.callor.start.loop;

public class While_03 {

	public static void main(String[] args) {
		
		int index = 0;
		while(true) {
			
			if(++index % 3 == 0) {
				System.out.println(index + " 는 3의 배수");
			} else {   //나머지가 1또는 2인경우
				System.out.println(index + " 는 3의 배수가 아님");
			}
			
			
			if(index > 1000) {
				break;
			}
			
			
			
		}
		
		
	}
}
