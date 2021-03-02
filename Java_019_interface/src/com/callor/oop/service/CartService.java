package com.callor.oop.service;

/*
 * project에서 interface를 만드는 이유
 * 1. 앞으로 cartService** 클래스를 만들떄는 반드시
 * 		CartService interface 를 implements 하라
 */
public interface CartService {
	
	public void inputCart();
	public void printCart();

}
