package com.callor.oop;

import java.util.Random;

public class ToString_01 {

	public static void main(String[] args) {


		int num = 30;
		//num에담긴 30을 문자열로 형변환
		System.out.println("num: " + num);
		
		Integer num1 = 30;
		System.out.println("num: " + num1.toString());
		
		//rnd 123은 다 다른곳에 저장되어있다.
		Random rnd1 = new Random();
		Random rnd2 = new Random();
		Random rnd3 = new Random();
		//저장되어있는 기억장치 위치
		System.out.println(rnd1.toString());
		System.out.println(rnd2.toString());
		System.out.println(rnd3.toString());

	}

}
