package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeServiceV2;

public class Prime_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		
		System.out.print("숫자입력 >> ");
		int num = scan.nextInt();
		
		//return 을 썻을땐 변수를 사용하여야한다.
		int result =psV2.prime(num);
		//result 값은 num값( num or -1) 이므로 if문에서 판결난다.
		if(result < 0) {
			System.out.println(num + "는 소수가 아님");
		}else {
			System.out.println(num + "는 소수");
		}
	}

}
