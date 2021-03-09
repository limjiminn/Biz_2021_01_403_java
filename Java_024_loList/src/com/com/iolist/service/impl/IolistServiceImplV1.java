package com.com.iolist.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.com.iolist.model.IoListVO;
import com.com.iolist.service.IolistService;

public class IolistServiceImplV1 implements IolistService{

	private String fileName;
	private List<IoListVO> ioList; 
	
	public IolistServiceImplV1() {
		fileName = "src/com/com/iolist/애입매출데이터.txt";
		ioList = new ArrayList<IoListVO>();
	}
	
	
	//정보 파일 읽기
	public void readInfo() {
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				
				String reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				String scores[] = reader.split(",");
				IoListVO vo = new IoListVO();
				
				
				
				ioList.add(vo);
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void printList() {
		
		System.out.println();
		System.out.println("거래일자\t거래처\t상품명\t매입금액\t판매금액");
		System.out.println();
		
		for(IoListVO vo : ioList) {
			System.out.println(vo.getDealDate() + "\t");
			System.out.println(vo.getAccout() + "\t");
			System.out.println(vo.getProName() + "\t");
			System.out.println(vo.getaPrice() + "\t");
			System.out.println(vo.getbPrice() + "\t");
			
		}
	}
	
}
