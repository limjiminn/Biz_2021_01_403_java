package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndServiceImplV1_1 {
	// makeRnd()와 saveFileRND() method가 공용으로 사용할
	// 객체이므로 인스턴스 객체변수로 선언
	private List<Integer> intList;
	// 생성자 메서드 : 객체를 선언하고 호출할때 쓰인다
	public RndServiceImplV1_1() {
		intList = new ArrayList<Integer>();
		//생성자에도 매게변수를 붙일수있다.
		
	}

	// Random 수를 생성하여 List에 담을 method
	public void makeRnd() {
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {

			Integer num = rnd.nextInt(100) + 1;
			intList.add(num);
		}
	}
	//다형성(오버로딩) ,(중복정의)
	//한클래스내에서 같은 이름의 메소드 두번이상쓸수없다.
	//하지만 매개변수의 갯수 타입이 틀리면 같은이름을 쓸수있다.
	/*
	 * 객체지향의 (메서드)다형성
	 * 원칙은 한 클래스 파일내에서는 같은 이름의 method를
	 * 두번이상 정의할수 없다.
	 * 
	 * 하지만 객체지향 언어에서는 method의 매개변수가
	 * 있거나 없거나 또는 매개변수의 갯수가 다르거나
	 * 매개변수의 type이 다르면 같은이름의 method를
	 * 중복하여 정의할수 있다.
	 * 
	 * 다형성, Overloading이라고 한다.
	 * 
	 */
	public void saveFileRnd() {
		String fileName = "src/com/callor/shop/files/nums_rnd.txt";
		
		this.saveFileRnd(fileName);
	}
	/*
	 * RndServiceImplV1클래스를 처음 디자인 할때는
	 * 파일의 이름을 코드에 직접 작성하였다.
	 * 이후 필요에 의해 파일의 이름을 method 매개변수로
	 * 받아서 사용할수 있도록 변경했다.
	 * 그랬더니 처음 V1 클래스를 호출하여 만들었던 코드들에서
	 * 오류가 나타나 버렸다.
	 * 
	 * 이 오류를 객체지향의 다형성 원리를 이용하여 해결하였다.
	 * 
	 * 만약 saveFileRnd() 라고 method를 호출하면 
	 * 코드에 포함된 파일 이름을 적용하여
	 * saveFileRnd(파일이름) method를 호출하도록 만들었다
	 * 
	 * 이제는 saveFileRnd(), saveFileRnd(파일이름) 두가지중 
	 * 어떤 것이든 호출하여 사용해도 문제가 없어졌다.
	 */
	

	// LIst에 담긴 숫자들을 파일에 저장하는 method
	public void saveFileRnd(String fileName) {
		//파일경로를 바꿀때마다 변경해야한다.
//		String fileName = "src/com/callor/shop/files/nums_rnd.txt";
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			int nCount = 0;
			for (Integer n : intList) {

				printer.print(n + ":");
				if (++nCount % 5 == 0) {
					printer.println();
				}
			}
			printer.close();
			fileWriter.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * saveFileRnd() method의 코드를 실행하여
	 * Random수들이 저장되어있는 파일에서
	 * 
	 * Random 수들을 다시 읽어들여
	 * 연산을 수행하는 method
	 * 
	 * 저장할떄 사용한 파일이름 == 읽을떄 사용할 파일이름
	 * 
	 * 이 상황은 2개의 method가 1개의 공통된 파일이름을 사용한다는 것이다.
	 * 
	 * 결국 saveFileRnd() method만 사용하기 위해 선언된 fileName 변수는 인스턴스 영역에 선언되어야
	 * 코드가 간편해 질 것이다.
	 * 
	 */
	public void loadFileRnd() {
		
	}

}
