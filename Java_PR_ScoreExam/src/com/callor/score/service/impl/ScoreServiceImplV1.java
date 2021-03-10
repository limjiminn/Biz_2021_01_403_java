package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;

public class ScoreServiceImplV1 implements ScoreService {

	private List<ScoreVO> scoreList;
	private String fileName;
	private ScoreVO vo;

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		fileName = "src/com/callor/score/score.txt";
		vo = new ScoreVO();
	}

	@Override

	// 키보드를 통해 입력
	public void inputList() {
		int num = 0;
		int kor = 0;
		int eng = 0;
		int math = 0;
		int music = 0;

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 20; i++) {

			while (true) {
				System.out.print("학번 >> ");
				String strNum = scan.nextLine();
				try {
					num = Integer.valueOf(strNum);
					if (num == vo.getStuNum()) {
						System.out.println("중복되서 입력할수없습니다");
					} else {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("숫자로만 입력해주세요");
				}
			}

			while (true) {
				System.out.print("국어 >> ");
				String strKor = scan.nextLine();
				try {
					kor = Integer.valueOf(strKor);
					if (kor < 0 || kor > 100) {
						System.out.println("1 ~ 100 범위내에 입력");
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("1 ~ 100 범위내에 입력");
				}
			}
			while (true) {
				System.out.print("영어 >> ");
				String strEng = scan.nextLine();
				try {
					eng = Integer.valueOf(strEng);
					if (eng < 0 || eng > 100) {
						System.out.println("1 ~ 100 범위내에 입력");
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("1 ~ 100 범위내에 입력");
				}
			}
			while (true) {
				System.out.print("수학 >> ");
				String strMath = scan.nextLine();
				try {
					math = Integer.valueOf(strMath);
					if (math < 0 || math > 100) {
						System.out.println("1 ~ 100 범위내에 입력");
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("1 ~ 100 범위내에 입력");
				}
			}
			while (true) {
				System.out.print("음악 >> ");
				String strMusic = scan.nextLine();
				try {
					music = Integer.valueOf(strMusic);
					if (music < 0 || music > 100) {
						System.out.println("1 ~ 100 범위내에 입력");
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("1 ~ 100 범위내에 입력");
				}
			}
			System.out.println();
			vo.setStuNum(num);
			vo.setKor(kor);
			vo.setEng(eng);
			vo.setMath(math);
			vo.setMusic(music);
			
			scoreList.add(vo);
		}

	}

	// 입력 받은 값 score.txt에 저장
	@Override
	public void inputWrite() {

		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			for (ScoreVO vo : scoreList) {
				printer.print(vo.getStuNum() + ":");
				printer.print(vo.getKor() + ":");
				printer.print(vo.getEng() + ":");
				printer.print(vo.getMath() + ":");
				printer.print(vo.getMusic() + ":");
			}
			printer.close();
			fileWriter.close();
			System.out.println("파일 저장 성공");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일 생성중 문제 발생");
		}

	}

	// 출력
	@Override
	public void printRead() {

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
				String scores[] = reader.split(":");

				ScoreVO vo = new ScoreVO(Integer.valueOf(scores[0]), // 학번
						Integer.valueOf(scores[1]), // 국어
						Integer.valueOf(scores[2]), // 영어
						Integer.valueOf(scores[3]), // 수학
						Integer.valueOf(scores[4]) // 음악
				);
				scoreList.add(vo);
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(fileName + "파일이 없습니다");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일을 읽는 동안 문제 발생");
		}

	}

	public void printScore() {
		for (ScoreVO vo : scoreList) {
			int total = vo.getKor();
			total += vo.getEng();
			total += vo.getMath();
			total += vo.getMusic();

			float avg = (float) total / 4;

			vo.setTotal(total);
			vo.setAvg(avg);
		}

		int totalSum = 0;

		System.out.println(Values.dLine(40));
		System.out.println("성적알람표");
		System.out.println(Values.dLine(40));
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println(Values.sLine(40));
		for (ScoreVO vo : scoreList) {
			System.out.printf("%05d\t", vo.getStuNum());
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getMusic() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.printf("%3.2f\n", vo.getAvg());

			totalSum += vo.getTotal();

		}

		System.out.println(Values.sLine(40));
		System.out.println("총점: " + totalSum);
		System.out.printf("평균: %3.2f\n", (totalSum / 20f));
		System.out.println(Values.dLine(40));
	}

}
