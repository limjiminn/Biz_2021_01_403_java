package com.com.iolist;

import com.com.iolist.service.IolistService;
import com.com.iolist.service.impl.IolistServiceImplV1;

public class IolistEx_01 {

	public static void main(String[] args) {
		
		
		IolistService ioService = new IolistServiceImplV1();
		
		ioService.loadDataFromFile();
		ioService.iolistSum();
		ioService.printIolist();
	}
}
