package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;

public class ScoreServiceImplV1 implements ScoreService {

	
	private List<ScoreVO> scoreList;
	private String fileName;

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		fileName = "src/com/callor/score/score.txt";

	}

	// 성적 만들기----------------------------------------
	public void makeScore() {

		Random rnd = new Random();

		for (int i = 0; i < 20; i++) {

			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setUserNum(i + 1);
			scoreVO.setKor(rnd.nextInt(100) + 1);
			scoreVO.setEng(rnd.nextInt(100) + 1);
			scoreVO.setMath(rnd.nextInt(100) + 1);
			scoreVO.setMusic(rnd.nextInt(100) + 1);
			scoreVO.setHistory(rnd.nextInt(100) + 1);

			scoreList.add(scoreVO);

		}
		
		
	}

	// 성적 저장하기---------------------------------------------
	public void saveScoreToFile() {
		
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;

		try {
			fileWriter = new FileWriter(fileName);
			printWriter = new PrintWriter(fileWriter);

			int nSize = scoreList.size();
			for (int i = 0; i < nSize; i++) {
				ScoreVO scoreVO = scoreList.get(i);
				printWriter.print(scoreVO.getUserNum());
				printWriter.print(scoreVO.getKor());
				printWriter.print(scoreVO.getEng());
				printWriter.print(scoreVO.getMath());
				printWriter.print(scoreVO.getMusic());
				printWriter.println(scoreVO.getHistory());

			}

			printWriter.close();
			fileWriter.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	// 파일로부터 성적출력--------------------------------
	public void loadScoreFromFile() {
		FileReader fileReader = null;
		BufferedReader buffer = null;

		// 파일을 읽어 들여서 한줄씩 scoreString에 담기
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// 합계및 평균 출력
		for (ScoreVO vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();
			sum += vo.getHistory();

			float avg = (float) sum / 5;

			vo.setTotal(sum);
			vo.setAvg(avg);

		}
		System.out.println(Values.dLine);
		System.out.println("순번\t국어\t영어\t수학\t음악\t국사\t총점\t평균");
		System.out.println(Values.sLine);

		for (ScoreVO vo : scoreList) {
			System.out.print(vo.getUserNum() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getMusic() + "\t");
			System.out.print(vo.getHistory() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
		}
		System.out.println(Values.dLine);

	}
}