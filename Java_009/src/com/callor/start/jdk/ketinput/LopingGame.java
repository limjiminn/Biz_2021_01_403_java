package com.callor.start.jdk.ketinput;

import java.util.Random;
import java.util.Scanner;

/*
 * 1. Random 클래스를 사용하여 1 ~ 100까지 임의 수를 생성하여 rndNum변수에 담아 놓는다.
 * 
 * 2. Console에 "숫자입력 >> " 프롬프트를 보여주고 
 * 3. 1 ~ 100까지 정수를 입력 받는다
 * 4. 입력받은 정수와 rndNum 변수에 저장된 값을 비교하여
 * 5. 큰가, 작은가를 알려주고
 * 6. rndNum에 저장된 값을 맞추는 게임
 * 
 * 7. 2 부터 5 까지를 계속 반복하면서 값을 맞춘다.
 * 8. 만약 정수값에 -1을 입력하면 게임을 중단한다
 */
public class LopingGame {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		// 난수 1개 생성
		int rndNum = rnd.nextInt(100) + 1;
		
			while(true) {
			System.out.print("숫자 입력 ( -1 : Quit) >> ");
			int keyNum = scan.nextInt();
			
			if( keyNum < 0) {
				System.out.println("You Lose !!!");
				break;
			}
			
			if(keyNum == rndNum) {
				System.out.println( "You Win!!!!");
				break;
			}else if(keyNum  > rndNum ) {
				System.out.println("입력값이 크다 !!!");
			}else if(keyNum  < rndNum) {
				System.out.println("입력값이 작다 !!!");
			}
		} //while end
		System.out.println("GAME OVER");
		
		
	
	}
}
