package com.callor.start;

public class Multiple_01 {

	public static void main(String[] args) {
		// for()반복 명령문, if() 비교연산 명령문을 사용하여 다음문제를 풀이하시오
		//7~106까지 범위 수 중에서 3의 배수들을 Console에 보이고 그합을 구하시오
		
		int sum = 0;
		
		for(int i = 0; i < 100; i++) {
			
			if((i + 7) % 3 == 0) {
				
				sum += i + 7;
			}
		}
		System.out.println("7부터 106까지 3배수의 합 : " + sum);
	}

}
