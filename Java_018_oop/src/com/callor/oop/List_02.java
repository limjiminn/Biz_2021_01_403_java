package com.callor.oop;

import java.awt.List;
import java.util.ArrayList;

/*
 * List 클래스
 * 배열의 단점을 보완하기 위해서 java의 JDK 포함되어있는
 *  데이터 리스트를 관리하기위한 클래스
 *  
 *  1. 데이터(값)들을 다량으로 저장하는 용도의 객체 생성
 *  2. 배열을 선언하여 값을 저장하는 것과 비슷한 용동
 *  3. 처음 생성할떄 몇개의 데이터를 저장할지 결정하지 않고
 *  4. 필요에 따라 데이터를 추가,수정,삭제 할 수있다.
 *  	-배열은 처음 생성한 개수를 변경하면, 저장되어있던
 *  	데이터를 사용할수없게된다.
 *  5. add() method 사용하여 데이터를 추가하고
 *  6. get() method 사용하여 저장된 데이터를 읽을 수 있다,
 *  	- 다른변수에 저장하거나,출력할수있다.
 */
public class List_02 {

	public static void main(String[] args) {
		/*
		 * 배열은 처음 생성할때 지정한 type이외는
		 * 다른어떠한 type도 저장할수 없다.
		 * 
		 * 이미 선언된 배열을 다른 type으로
		 * 다시 선언할수도 없다.
		 */
		int[] nums = new int[10];
		nums[0] = 30;  //숫자형
		//문법오류
		//nums[1] = "30";  //문자열
		//nums[2] = "대한민국"; //문자열
		//nums[3] = 30f; // 실수형
		
		// ArrayList 형 객체 생성
		/*
		 * 공통 type의 ArrayList 객체 생성
		 * list1 객체에 여러 type의 데이터를 추가하여
		 * 관리하겠다 라는 의미
		 */
		ArrayList list1 = new ArrayList();
		list1.add(3); //정수
		list1.add("대한민국"); // 문자열
		list1.add(3.2f); // 실수열
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		
		
		//권장하는 ArrayList 객체 생성하기
		// ArrayList형 객체를 생성하는데
		//strList 객체에는 String type의 데이터들만 추가할수있다.
		// <String>: Generic type
		// strList1은 ArrayList 객체이지만
		// 여기에는 문자열만 저장하도록 하겠다.
		// Generic type은 int,float.log, double 등은 사용불가
		//Generic type은 Integer,Float.Long, Double 등을 사용해야한다.
		//Generic type은 VO 클래스를 사용할수 있다.
		ArrayList<String> strList1 = new ArrayList<String>();
		ArrayList<Integer> intList1 = new ArrayList<Integer>();
		
		//strList1 은 Generic이 string으로 설정되어있기떄문에
		//문자열 외에는 add 할수 없다.
		strList1.add("대한민국");
		//strList1.add(30);
		//strList1.add(30.0f);
		
		//intList1은 Generic이 Integer로 설정되어있기때문에
		// 정수값 외에는 add 할수없다.
		intList1.add(30);
		//intList1.add("30");
		intList1.add(Integer.valueOf("39"));

	}

}
