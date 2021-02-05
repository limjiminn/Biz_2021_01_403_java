package com.callor.start.loop;

public class While_03 {

	public static void main(String[] args) {
		
		int index = 0;
		while(true) {
			// 매우 불편한 코드
			if(index % 3 > 0) {
				System.out.println("3의 배수가 아님");
			}
			
			// 정상적인 코드
			if(++index % 3 == 0) {
				System.out.println(index + " 는 3의 배수");
			} else {   //나머지가 1또는 2인경우
				System.out.println(index + " 는 3의 배수가 아님");
			}
			
			
			if(index > 1000) {
				break;
			}
			//if(index == 999){  break; }  :인덱스가 절대적인 정수여야한다.(위험한코드)
										// : 실수가 있다면 절대 멈추지않는다.
			
			
		}
		
		
	}
}
