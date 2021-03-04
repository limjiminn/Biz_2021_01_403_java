package com.callor.shop;
/*
 * 아무것도(변수,method등등)이 없는 비어있는 클래스는
 * java클래스들의 시조(원조)조상인 Object를 자동으로 ㅣ
 * extends한다.
 */
public class Class_01 extends Object{

	/*
	 * 원천적으로 모든 클래스는 Object 클래스에 만들어져(정의되어있는)
	 * toString()메소드를 가지고있다.
	 * 
	 * toString() method는 object 클래스로부터 상속 받은것이다
	 * 
	 * java 에서는 상속받은 method를 필요에 따라 마음대로 요리해서 변형할수있다.
	 * 	이러한 것을 재정의 라고한다.
	 * 
	 * @... : Annotation(주석)
	 * 
	 * @Override : Override Annotation
	 * 		이 method는 부모클래스에서 상속받았지만
	 * 		여기에서 재 정의 하겟다 라는 의미
	 * 
	 */

	
	public String toString() {
	
	return "나는 Object를 상속받은 Class_01입니다";

}
}
