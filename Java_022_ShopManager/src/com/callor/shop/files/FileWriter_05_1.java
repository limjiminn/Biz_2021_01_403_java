package com.callor.shop.files;

import com.callor.shop.service.impl.RndServiceImplV1_1;

public class FileWriter_05_1 {

	public static void main(String[] args) {
								
		RndServiceImplV1_1 rvV1 = new RndServiceImplV1_1();
		
		rvV1.makeRnd();
		
		rvV1.saveFileRnd();
			
		}

	}


