package com.callor.score.values;

public class Values {
	//public으로 해야함
	public static final String dLine;
	public static final String sLine;
	
	// static final 변수 생성하기
	static {
		//=============================================
		//"%050d" : 빈칸 50개 나머지빈칸은 0
		dLine = String.format("%050d", 0).replace("0","="); // 0을 =로 바꿔라
			//	블럭?   메서드?
		sLine = String.format("%050d", 0).replace("0", "=");
		
	}

}
