package com.callor.applications;

import java.util.Random;

public class Prime_04 {
/*
 * 배열없이 단순하게 난수를 생성하고
 * 소수인지 판별하여 출력하기
 * 중복(이중) 반복 문
 */
	public static void main(String[] args) {
		int intPrimeSum = 0;
		int intPrimeCount = 0;
		Random rnd = new Random();
		for(int i = 0; i < 10; i++) {
			int rndNum = rnd.nextInt(1000) + 2;
			
			//생성된 난수(rndNum) 값이 소수인지검사
			int index = 0;
			for(index = 2; index <rndNum; index++) {
					//여기코드는 i반복횟수 *index반복횟수만큼 반복
				if(rndNum % index == 0) {
					break;
				}
			}
			if(index < rndNum) {
				System.out.println(rndNum + "는 소수 아님");
			}else {
				System.out.println(rndNum + "는 소수");
				intPrimeSum += rndNum;
				intPrimeCount ++;
			}
		}// for i end
		
		System.out.println("합계 : " + intPrimeSum);
		System.out.println("개수 : " + intPrimeCount);

	}

}
