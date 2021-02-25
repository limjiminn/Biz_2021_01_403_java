package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_01 {

	public static void main(String[] args) {

		ScoreVO scoreVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);

		// 50 ~ 100점 까지만 입력가능
		try {
			while(true) {
			System.out.print("국어점수 >> ");
			scoreVO.intKor = scan.nextInt();
			if((scoreVO.intKor< 50)||(scoreVO.intKor > 100)) {
			}else
			System.out.print("영어점수 >> ");
			scoreVO.intEng = scan.nextInt();
			if((scoreVO.intEng> 50)&&(scoreVO.intEng < 100)) {

			System.out.print("수학점수 >> ");
			scoreVO.intMath = scan.nextInt();
			if((scoreVO.intMath> 50)&&(scoreVO.intMath < 100)) {
				
			
			}
		} catch (Exception e) {
			System.out.println("");
		}

	}

}
