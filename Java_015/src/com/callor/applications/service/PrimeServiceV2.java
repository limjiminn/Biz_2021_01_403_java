package com.callor.applications.service;

public class PrimeServiceV2 {
	
	public int prime(int num) {
		int i = 0;
		for(i = 2; i < num; i++) {
			if(num % i == 0) {
				break;
			}
		}
		
		if(i < num) {
			return num;
		}else {
			return -1;
			
		}
	}

}
