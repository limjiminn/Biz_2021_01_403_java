package com.callor.oop.controller;

import com.callor.oop.service.CartSerViceV2;

/*
 * controller 클래스
 * web application 프로젝트를 수행할때
 * 처음 시작하는 시작점 클래스
 * 
 * Service 등 모듈클래스를 객체로 선언하고
 * 모듈클래스의 method들을 호출하는 일만 수행
 */
public class CartControllerV5_01 {

	public static void main(String[] args) {
		
		CartServiceV2 scV2 = new CartSerViceV2();
		csV2.inPutCart();
		csV2.printCart();
	}

}
