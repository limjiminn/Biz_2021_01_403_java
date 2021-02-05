package com.callor.start.loop;

public class pay_05 {
	
	public static void main(String[] args) {
		
		           
		int pay = 4_789_800;
		int paper = 50_000;
		
		int sw = -1;  
		/*
		 * 일반적으로 for() 반복문은 반복되는 횟수가 명확할때 사용
		 * while(조건문) 반복문은 반복되는 횟수가 경우에따라 다를때 사용
		 * 						조건에 부여하여 반복 수행을 결정
		 * 						조건문이 true일때만 반복하고
		 * 						조건문이 False가 되면 종료한다
		 */
		while(pay > 0) { //while ()조건에 횟수에상관
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
	
