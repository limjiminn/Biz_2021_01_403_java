package com.callor.shop.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.shop.model.ScoreVO;
import com.callor.shop.values.Values;

public class FileReader_02 {

	public static void main(String[] args) {
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		List<String> strLines = new ArrayList<String>();
		String fileName = "src/com/callor/shop/files/score.txt";
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
			
			String[] scores = str.split(":");
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setKor(Integer.valueOf(scores[0]));
			scoreVO.setEng(Integer.valueOf(scores[1]));
			scoreVO.setMath(Integer.valueOf(scores[2]));
			scoreVO.setHistory(Integer.valueOf(scores[3]));
			scoreVO.setMusic(Integer.valueOf(scores[4]));
			
			scoreList.add(scoreVO);
		}
		
		for(ScoreVO vo : scoreList) {
			
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();
			sum += vo.getHistory();
			
			float avg = (float)sum / 5;
			//total (총점) 출력
			vo.setTotal(sum);
			//avg (평균) 출력
			vo.setAvg(avg);
			
		}
		System.out.println(Values.dLine);
		System.out.println("국어\t영어\t수학\t음악\t국사\t총점\t평균");
		System.out.println(Values.sLine);
		
		for(ScoreVO vo : scoreList) {
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getMusic() + "\t");
			System.out.print(vo.getHistory() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
		}
		
	}

}
