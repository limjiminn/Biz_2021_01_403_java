package com.callor.shop.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.shop.values.Values;

public class FileReader_01 {

	public static void main(String[] args) {

		List<String> strLines = new ArrayList<String>();
		String fileName = "src/com/callor/shop/files/nums_rnd.txt";
		/*
		 * 파일을 읽을때 사용하는 클래스
		 */
		FileReader fileReader = null;
		BufferedReader buffer = null;
		// 아스키코드 : 미국정보교환표준부호
		try {
			fileReader = new FileReader(fileName);
			/*
			 * 
			 * fileReader를 사용한 저수준 코드 
			 * while(true) { 
			 * 	int ascii = fileReader.read();
			 * if(ascii== -1) { break; //(파일전체를 읽으면 탈출하라 )
			 *  } //%c :아스키코드값을 실제문자로 바꿔주세요
			 * System.out.printf("%c\n",ascii); //한글자씩 출력됨 }
			 */

			buffer = new BufferedReader(fileReader); // 임시저장
			while (true) {
				String str = buffer.readLine(); // nextLine()
				if (str == null) {
					break;
				}
				// System.out.println(str); //한줄씩 출력됨
				strLines.add(str); //리스트에 담아놓기

			}
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//파일 읽기 끝
		for(String str : strLines) {
			
			String[] nums = str.split(":");
			
			System.out.printf("첫번째 숫자 : %s\n", nums[0]);
			System.out.printf("두번째 숫자 : %s\n", nums[1]);
			System.out.printf("세번째 숫자 : %s\n", nums[2]);
			System.out.printf("네번째 숫자 : %s\n", nums[3]);
			System.out.printf("다섯번째 숫자 : %s\n", nums[4]);
			System.out.println(Values.sLine);
			
			int sum = Integer.valueOf(nums[0]);
			 sum += Integer.valueOf(nums[1]);
			 sum += Integer.valueOf(nums[2]);
			 sum += Integer.valueOf(nums[3]);
			 sum += Integer.valueOf(nums[4]);
			 System.out.println("합계 : " + sum);
			 System.out.println(Values.dLine);
			
		}

	}

}
