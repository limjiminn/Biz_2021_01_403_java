package com.callor.start.loop;

public class pay_02 {
	
	public static void main(String[] args) {
		
		           
		int pay = 4_789_800;
		int paper = 50_000;
		
		int sw = -1;  
		for( ;pay > 0 ; ) {
			int count = pay /paper;
			pay -= (paper * count);  
			System.out.println(paper + "원권 : " + count );
			if(sw < 0) {  //sw가 0보다 작으면~ 동작후 else 건너뛰고 진행됨
				paper /= 5;
			} else { //그렇지 않으면~ else 만 동작
				paper /= 2;
			}
			
			sw *= (-1);
			
		}
	}		
}
	
