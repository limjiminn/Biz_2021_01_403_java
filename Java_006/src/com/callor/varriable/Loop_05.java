package com.callor.varriable;

public class Loop_05 {

	public static void main(String[] args) {
		
		int intDan = 7;
		for(int num = 1; num < 10; num += 1) {
			
			
		}//변수 num 소멸하므로 밑에 변수 num을 다시 만들수있다.
		for(int num =1; num < 100; num += 1) {
			
		}
		for(int num = 20; num < 42; num += 1) {
			System.out.println("안녕"); //42-20 = 22번출력한다
		}
		//   시작하는값;비교하는값;증가하는값; 
		for(int num = 12; num<= 20; num +=1) {
			System.out.println("반가워"); // 20-12+1 =9번 출력한다
		}
		for(int num = 12; num <= 20; num += 2) {  //5번 출력한다.
			System.out.println(num);
		}

	}

}
