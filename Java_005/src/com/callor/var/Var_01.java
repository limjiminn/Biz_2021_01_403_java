package com.callor.var;

// 가.
public class Var_01 {
	
	//1
	public static void main(String[] args) {
		
		//Top(윗쪽) 부분에 선언된 변수는 
		//Down(아랫쪽) 에서 또 선언해서는 안된다.
		//한번 선언된 변수 이름으로 
		//또다시 선언할수 없다.
		int num1 = 30;
		int	num2 = 40;
		int	num3 = 50;
		
		/*
		 * 변수 이름 짓기
		 * 첫글자는 영문 소문자
		 * 이후 숫자, 영문대소문자,_사용할수 있다
		 * 두개 이상의 단어를 조합하여 사용하는것을 권장한다.
		 * 두번째 단어부터는 첫글자를 대문자로...
		 * (lower) Camel Case
		 */
		int korScore = 90;
		int engScore = 100;
		int mathScore = 95;
		
		//2개 이상의 단어로 조합이 다소 불편할때
		// 변수명 접두사로 변수의 형(type)을 붙인다.
		//헝가리언 표기법: 변수명 앞에 변수의 형을 붙이는것
		int intNum1 = 20;
		int intNum2 = 30;
		int intNum3 = 40;
		
		float floatNum1 = 20.0F;
		float fNum2 = 30.0F;
		
		double doNum1 = 20.0;
		double doNum2 = 30.0;
		
		
		String strName = "홍길동";
		String strNation = "대한민국";
		String strAddr = "서울특별시";
		/*
		 * 변수명 단어와 단어 사이에 UnderScore(_)
		 * snake case
		 * 
		 * 데이터베이스와 연동하는 프로젝트를 만들떄
		 * 주로 사용하는 명명법
		 */
		String str_name = "이몽룡";
		
		String st_name= "성춘향"; // student_name
		String st_num = "202101001"; //studen_num
		
		String dept_name = "컴퓨터공학";
		
				
		
		
	
		
		
	}//2  1~2의 구역을 mina() method의 local area, local scope라고 하며
	 	//줄여서 그냥 local이라고 한다.

}//나
//가~나의 구역을 클래스 Var_01의 private 영역이라고한다,
//또는 그냥 Var_01 클래스의 local영역 이라고 한다.