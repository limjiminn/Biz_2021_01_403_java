package com.callor.hello;

// 여기는 클래스 시작입니다.
//슬래시 연속 2번으로 시작하는 문장은
//주석문(comment) 이라고 한다.
//주석문은 어떠한 내용이 있더라도
//코드가 아닌것으로 무시하는 문장이다.
/*
 *여기는 주석문장(comment statement)
 *여러줄에 걸쳐 주석을 작성하고자 할때
*/

public class HelloExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//"" 내에 있는 글자, 단어 등을
		// 문자열(=String 리터럴) 이라고 한다.
		System.out.println("반갑습니다");
		
		//우리나라만세 문자열을
		//Console에 출력하라(보여달라)
		System.out.println("우리나라만세");
		
		//숫자 30과 40을 덧셈하여
		//Console에 출력하라
		//연산부호(+,-,*,/)와 숫자사이는
		//빈칸의 개수가 아무런 문제가 없다
		//하지만 가독성을 위하여
		//빈칸을 한칸씩 넣어주자
		System.out.println(30+40);
		System.out.println(30 + 40);//요렇게써야 보기편해
		System.out.println(30+ 40);
		System.out.println(30 +40);
		
		//30 + 40이라는 문자열을
		//Console에 출력하라
		System.out.println("30 + 40");
		
		//숫자 30을 문자열 30으로 바꾸고
		//숫자 40을 문자열 40으로 바꾸고
		// 두 문자열을 연결하여
		//Console 에 출력하라
		System.out.println("30" + "40");
		
		System.out.println("우리나라 + 대한민국");
		System.out.println("우리나라" + "대한민국");
		
		System.out.println("30 * 40");
		//System.out.println("30" * "40");
		
				
		/*
		 * 연산
		 * 숫자, 숫자는 사칙연산을 모두 수행할수 있다.
		 * 숫자, 숫자의 사칙연산은 수학의 연산 규칙과 같다
		 * 문자열, 문자열의 연산은 연결(+)연산만 가능
		 * 문자열과 문자열을 연결하여 한 문자열로 만든다	 
		 */
		
		//문자열과 숫자를 덧셈연산하면
		//숫자가 자동으로 문자열화(변환) 된다.
		System.out.println("30" + 30);
		
		System.out.println("30 + 40 =" + 30 + 40);
		
		//문자열과 (덧셈)가 있으면
		//(덧셈) 먼저 계산해주고
		//문자열화 한다.
		System.out.println("30 + 40 =" + (30 + 40));
		System.out.println("30 * 40 =" +30 * 40);
		
	}

}
