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
	}

	// Random 수를 생성하여 List에 담을 method
	public void makeRnd() {
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {

			Integer num = rnd.nextInt(1000) + 1;
			intList.add(num);
		}
	}

	// LIst에 담긴 숫자들을 파일에 저장하는 method
	public void saveFileRnd() {
		String fileName = "src/com/callor/shop/files/nums_rnd.txt";
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

}
