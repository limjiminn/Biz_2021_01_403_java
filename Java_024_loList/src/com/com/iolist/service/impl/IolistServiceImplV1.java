package com.com.iolist.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
	
	//정보담기
	public void inputInfo() {
		//매입금액/판매금액 구분후 담기	
		IoListVO vo = new IoListVO();
		IoListVO scores[] = new IoListVO[10];
		
		
		
	
		
		
		
		
		
	}
	
	
	//정보 파일에 저장
	public void saveInfo() {
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
			try {
				fileWriter = new FileWriter(fileName);
				printer = new PrintWriter(fileWriter);
				
				
			for(IoListVO vo : ioList) {
				printer.print(vo.getDealDate());
				printer.print(vo.getProName());
				printer.print(vo.ge);
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
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
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
