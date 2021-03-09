package com.com.iolist;

import com.com.iolist.service.impl.IolistServiceImplV1;

public class IoListEx_01 {
	
	public static void main(String[] args) {
		
		IolistServiceImplV1 ioV1 = new IolistServiceImplV1();
		
		
		ioV1.readInfo();
		ioV1.printList();
	}
}
