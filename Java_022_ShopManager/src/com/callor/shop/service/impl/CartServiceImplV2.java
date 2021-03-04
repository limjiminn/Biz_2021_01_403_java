package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartServiceV2;
/*
 * CartServiceImplV1을 extends(확장),상속 받아 V2를 생성
 */

public class CartServiceImplV2 extends CartServiceImplV1 implements CartServiceV2{
	
	/*
	 * CartServicImplV2는 인스턴스 객체와
	 * 생성자 만 있는 상태
	 */
	private final Scanner scan;  
	private List<CartVO> cartList;
	private String cartFileName;
	
	public CartServiceImplV2() {
		scan = new Scanner(System.in); //in : static
		cartList = new ArrayList<CartVO>();
		cartFileName = "src/com/callor/shop/cartList.txt";
	}
	
	/*
	 * cartList에 저장된 상품리스트를 "..../cartList.txt" 파일에 저장
	 * 
	 * 어떤 데이터를 파일에 저장하기
	 * 1. 파일이름(경로포함)을 결정하고
	 * 2. 파일을 생성
	 * 3. 모든 데이터를 문자열로만들고
	 * 4. 파일에 기록한다
	 * 5. 파일을 연결을 정상적으로 종료한다
	 */
	@Override
	public void saveCartToFile() {
		
		///1. 데이터를 저장할 파일 생성하기위하여
		// FileWriter 클래스를 사용하여 객체 선언
		
		FileWriter fileWriter = null;
		//2. FileWriter에 데이터를 전송하기 위하여
		// PrintWriter클래스를 사용하여 객체 선언
		PrintWriter print = null;
		
		//3. fileWriter 객체를 생성하면서
		// 뎅이터를 저장할 파일정보를 전달
		fileWriter = new FileWriter(cartFileName);

		
	}

	@Override
	public void loadCartToFIle() {
		// TODO Auto-generated method stub
		
	}
	
	

}
