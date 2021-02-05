package com.callor.start.loop;

public class While_02 {

	public static void main(String[] args) {
		
		int count = 0;
		
		//while(count++ < 10) {  //count++ < 10  :  0이 10보다 작냐? true : 1로 변환  
		//	System.out.println(count);		// :  1이 10보다 작냐? true: 2로 변환
											// : ....9가 10보다 작냐? true : 10으로변환
		//}
		while(++count < 10) {  //++count < 10  :0이 1로변환 :1이 10보다 작냐?    
			System.out.println(count);	//	   :1이 2로 변환: 2가 10보다 작냐?
		}
		
		count = 0;
		while(count < 10) {
			System.out.println(++count);  // 1 출력
		}
		//1
		System.out.println(count ++);
		//풀어쓰면
		System.out.println(count);
		count += 1;
		
		//2
		System.out.println(++count);
		//풀어쓰면
		count++;
		System.out.println(count);
		
		
		
		
	}
}
