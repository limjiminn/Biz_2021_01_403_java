package com.callor.start.loop;

public class Loop_05 {
	
	public static void main(String args[]) {
		
		int intSum = 0;
		//0,2,4,6,8
		for(int i = 0; i < 10; i +=2) {
			//i값이 10미만이면 for문안쪽문을 실행하고 False면 실행종료해라
			intSum += (i + 1);  //홀수의 합
		}
		System.out.println("0 ~ 10 까지 중 홀수의 합 = " + intSum);
		
		//intSum을 clear하지 않으면 이후의 계산결과가 엉뚱한값이 나온다
		intSum = 0;
		// 1,3,5,7,9
		for(int i = 1; i < 10; i+= 2) {
			//2,4,6,8,10
			intSum +=(i + 1);
		}
		
		intSum = 0;
		//0,2,4,6,8
		for(int i = 0; i < 10; i += 2) {
			intSum +=1;
		}
		System.out.println(intSum);
	}

}
