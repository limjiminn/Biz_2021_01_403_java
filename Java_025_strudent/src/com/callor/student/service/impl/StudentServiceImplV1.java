package com.callor.student.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.model.ListVO;
import com.callor.student.service.StudentService;
import com.callor.student.values.ValList;
import com.callor.student.values.Values;

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

			while (true) {

				String reader = buffer.readLine();

				if (reader == null) {
					break;
				}

				String[] stuData = reader.split(":");

				ListVO list = new ListVO(Integer.valueOf(stuData[ValList.STU_NUM]),
						stuData[ValList.STU_NAME],
						stuData[ValList.DE_PART],
						Integer.valueOf(stuData[ValList.GRADE]),
						Integer.valueOf(stuData[ValList.INT_CLASS]),
						stuData[ValList.ADRESS],
						stuData[ValList.PHONE]);

				listVO.add(list);

			} // while end
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(fileName + "파일이 없음");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일이 읽는 도중 문제 발생");
		}

	}

	@Override
	public void dataSearch() {
		// TODO 데이터 찾기
		Scanner scan = new Scanner(System.in);
		System.out.println(Values.dLine(50));
		System.out.println("찾는 학생이름을 입력하세요(종료하려면 QUIT를 입력)");
		System.out.println(Values.sLine(50));
		System.out.print("이름 >> ");
		String strName = scan.nextLine();
		
		

	}

	@Override
	public void printData() {
		// TODO 데이터 출력
		
		
	}

}
