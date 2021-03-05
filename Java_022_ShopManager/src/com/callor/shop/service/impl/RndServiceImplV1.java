package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndServiceImplV1 {
	
	private String numsFile ;
	private List<Integer> intList ;
	private	Random rnd ;
	
	
	//생성자 메서드 : 객체를 선언하고 호출할때 쓰인다
	public RndServiceImplV1() {
		numsFile = "src/com/callor/shop/files/nums.txt";
		intList = new ArrayList<Integer>();
		rnd = new Random();
	}

	
	public void inputList() {
	
		for(int i = 0; i < 100; i++) {
			
			Integer num = rnd.nextInt(1000) + 1;
			intList.add(num);
		}
	}

	public void printList() {
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(numsFile);
			printer = new PrintWriter(fileWriter);
			
			for (Integer n : intList) {
				printer.print(n);
			}

			printer.close();
			fileWriter.close();
			
			System.out.println("Mission Complete!!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
