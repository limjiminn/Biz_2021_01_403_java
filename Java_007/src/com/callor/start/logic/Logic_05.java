package com.callor.start.logic;

/*
 * 화폐매수 계산
 * 
 * 4789800
 * 오만원권 	: 95매
 * 만원권		: 3매  	: 오만원 /5
 * 오천원권		: 1매	: 만원 /2
 * 천원권		: 4매 	:   오천원 /5
 * 오백원		: 1개 	:   천원 /2
 * 백원			: 3개   :  오백원 /5
 * 규칙을 찾는게 중요
 */
public class Logic_05 {
	
	public static void main(String[] args) {
		
		int pay = 4_789_800;
		int paper = 50_000;   //_는 구분자(,)
		int count = pay / paper; 
		
		System.out.println(paper +"원권 : " + count ); //5만원권의 갯수 
		
		int intMod = pay % paper;
		System.out.println(intMod);
	}
	

	
}
