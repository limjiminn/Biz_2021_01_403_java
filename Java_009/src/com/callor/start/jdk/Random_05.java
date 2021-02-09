package com.callor.start.jdk;
/* 
 * for(int i =0; i< 100; i++){
 * Random 클래스를 이용
 * 
 * 1~100 까지 범위 에서 임의 숫자 100를 만들고
 * 100개 중에 짝수가 있으면 짝수들의 합을 계산
 */
import java.util.Random;

public class Random_05 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int sum2M = 0;

		for (int i = 0; i < 100; i++) { 

			int num = rnd.nextInt(100) + 1;
			boolean bYes = num % 2 == 0;

			if (bYes) {
				//num가 짝수이면 실행되는 부분
				//num값을 다른 변수(sum2M)에 누적
				sum2M += num;
				
				System.out.println(num);
			}
			
		}
		System.out.println("1부터 100까지 임의 수 100개중 짝수의 합 : " + sum2M);

	}

}
