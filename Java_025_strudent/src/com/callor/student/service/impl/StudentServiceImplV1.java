package com.callor.student.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.student.model.ListVO;
import com.callor.student.service.StudentService;

public class StudentServiceImplV1 implements StudentService {
	
	private List<ListVO> listVO;
	
	public StudentServiceImplV1() {
		listVO = new ArrayList<ListVO>();
	}
	
	@Override
	public void fileLoading() {
		// TODO 파일 읽어오기
		String fileName = "src/com/callor/student/학생정보리스트.txt";
		
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
				String[] stuData = reader.split(":");
				
				ListVO listVO = new ListVO(
						);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void dataSearch() {
		// TODO 데이터 찾기
		
	}

	@Override
	public void printData() {
		// TODO 데이터 출력
		
	}
	

}
