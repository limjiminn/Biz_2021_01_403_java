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
		// 랜덤클래스 선언
		Random rnd = new Random();

		// 각각의 과목에 20개의 랜덤점수 저장
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
		// 파일에 데이터를 저장하기위해 2개의 클래스를 객체로 선언
		FileWriter fileWriter = null; // 파일생성
		PrintWriter printer = null; // 파일저장

		// try_catch를 의무적용해야한다.
		// exception이 발생하는 상황이 많음
		try {
			fileWriter = new FileWriter(fileName);

			// fileWriter를 printWriter와 연결
			printer = new PrintWriter(fileWriter);

			// scoreList에 성적이 20개씩 저장됨
			// int nSize = scoreList.size();
			for (ScoreVO scoreVO : scoreList) {
				// ScoreVO scoreVO = scoreList.get(i);
				printer.print(scoreVO.getUserNum());
				printer.print(scoreVO.getKor());
				printer.print(scoreVO.getEng());
				printer.print(scoreVO.getMath());
				printer.print(scoreVO.getMusic());
				printer.println(scoreVO.getHistory());

			}
			// 파일에 내용을 기혹한 후에는 반드시 close()
			printer.close();
			fileWriter.close();
			System.out.println("저장완료");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 파일로부터 성적출력--------------------------------
	public void loadScoreFromFile() {

		// 파일을 읽을때 사용하는 클래스
		FileReader fileReader = null;
		
		try {
			
			fileReader = new FileReader(fileName);

			fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} // 파일 읽기 끝

		// scoreList에 저장된값들을 차례대로 가져와서
		// vo에 넣어라
		for (ScoreVO vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();
			sum += vo.getHistory();

			float avg = (float) sum / 5;
			// 합계및 평균 출력
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
