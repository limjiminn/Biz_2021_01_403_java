package com.callor.varriable;

public class Var_01 {
	
	public static void main(String[] args) {
		
		// 변수를 선언하고 초기화(0저장, clear)
		int num1 = 0;
		
		// 변수 num1에 정수 30을 저장하라
		//=변수 num1에 정수 30을 할당하라
		//=변수 num1에 정수 30을 대입하라
		num1 = 30;
		
		// 변수를 만들고 값을 저장하는 이유는
		// 이 이후의 코드에서 변수에 담긴 값을
		// 활용하여 연산을 수행 하려고 하는 것이다
		System.out.println("num1 = " + num1);  //사용자를 배려하는 코드
		
		num1 = 30 + 40;
		
		/*
		 *  =을 중심으로 오른쪽을 먼저 해석
		 *   변수 num1에 저장되어있는 값(70)과 숫자 10을 덧셈하라
		 *   그리고 그 결과(80)을 num1변수에 저장하라
		 *   
		 *   원래 num1에 저장된 70은 clear되고 정수 80이 저장될 것이다
		 */
		num1 = num1 + 10; //변수 num1에 num1값(70)과 10을 더한후 저장하라(80)
		num1 = num1 + 10; //변수 num1에 num1값(80)과 10을 더한후 저장하라(90)
		num1 = num1 + 10; //변수 num1에 num1값(90)과 10을 더한후 저장하라(100)
		
		num1 = num1 + 20;
		num1 = num1 + 1;
		num1 = num1 + 22;
		
		num1 = num1 - 20;//변수 num1에 num1값과 20을 뺀후 저장하라
		num1 = num1 / 2;
		num1 = num1 * 2;
		num1 = num1 % 2;  //0또는 1이나온다. 짝수or 홀수
		
		num1 = num1 + (-1); //-1 //교대로 사용할때 사용하는코드(=스위치를만든다)
		num1 = num1 * (-1); //1
		num1 = num1 * (-1); //-1
		num1 = num1 * (-1); //1
		num1 = num1 * (-1); //-1
		num1 = num1 * (-1); //1

		
		
	}

}
