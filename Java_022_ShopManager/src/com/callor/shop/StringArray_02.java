package com.callor.shop;

public class StringArray_02 {

	public static void main(String[] args) {
		
		String strCart ="홍길동:초코파이:10:1000";
		
		/*
		 * 원래문자열.split(구분자)
		 * 
		 *   원래 문자열을 구분자문자열을 기준으로 나누고
		 *   문자열 배열로 만들어 return한다
		 */
		String[] cartList =strCart.split(":");  // {"홍길동","초코파이"}
		//:으로 나누어 쪼갠다음 배열 4개만들어서 cartList에 담는다.
		for(String s : cartList) {
			System.out.println(s);
		}
		
		/*
		 * strCart에 담긴 문자열을
		 * 글자 단위로 달라서 배여렝 담아 달라
		 */
		cartList = strCart.split(""); //구분자 안에 아무것도 없으면 한글자씩자름
		for(String s : cartList) {
			System.out.println(s);
		}
		
		//String.format :정수열을 문자열로만들어 변수에 담아낸다.
		//지정된 형식(폼)으로 문자열을 만들어서
		//return 해주는 method
		strCart = String.format("%d:%d:%d",10, 20, 30);
		System.out.println(strCart);
		
		
		//strCart라는 변수에 10이라는 문자열이있으면 
		//대한민국이라는 문자열로 바꿔서 return
		strCart = strCart.replace("10", "대한민국");
		
		System.out.println(strCart);
		
		String strName = "홍 길동   ";   
		System.out.println(strName);
//		//문자열 중에 공백을 모두 제거하기
		strName = strName.replace(" ", "");
		System.out.println(strName);
		
		//"이후부터 9번쨰까지 제거하기 (태극기 앞에)
		strName = "나는 자랑스러운 태극기 앞에";
		String strFlag = strName.substring(9);
		
		System.out.println(strFlag);
		//9번쨰와 12번째 사이만 출력하기(태극기)
		strFlag = strName.substring(9,12);
		System.out.println(strFlag);
		
		
	}
}
