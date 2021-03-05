package com.callor.shop.files;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileWriter_04 {
	//인스턴스변수
	/*
	 * 클래스 영역에 변수를 선언하는 것은
	 * 현재 클래스가 포함하고 있는 모든 method들이
	 * 변수를 공유하여 코드를 수행하게 하려는 의도이다
	 * 
	 * 보통 생성자를 통해 객체를 생성하여 사용하는 클래스에
	 * 선언된 클래스 영역 변수를 "인스턴스 변수" 라고 한다.
	 * 인스턴스 변수는 GC에 의해 메모리 관리가 자동으로 이루어진다.
	 * 
	 * static method에서 필요한 변수들은
	 * 변수를 선언할떄 static 키워드를 추가하여 static 변수로 만든다.
	 * 
	 * static 변수는 GC이 접근하지못한다.
	 * 프로젝트가 시작될떄 만들어지고, 계속 존재하는 상태다
	 * 프로젝트가 시작될때 클래스가 자동으로 만들어지고
	 * 이때 static 변수들도 자동으로 생성된다.
	 * 
	 * 클래스가 생성될떄 같은 만들어진다는 의미로
	 * static 키워드가 부착된 변수를 "클래스변수" 라고 한다.
	 * 
	 * static 변수는 선언과 생성을 동시에 하도록 코드를 작성한다.
	 * 
	 * 다만, static 생성자를 만들어 변도로 생성을 하는 경우도 있다.
	 * ex) static {
	 * 		numsFile = "src/com/callor/shop/files/num.txt";
	 * 		intList = new ArrayList<Integer>();
	 *  }
	 * 
	 *  멤버변수: 클래스안에 있는 변수(클래스변수/ 인스턴스변수)
	 * 
	 *  클래스변수 / 인스턴스변수 차이점	
	 *   클래스변수는static라는 키워드 붙어있다.(자동으로 생성해야된다)
	 *  클래스변수는 
	 * 인스턴스변수는 클래스를 객체로 생성하고
	 *  생성자에의해 객체가 생성될때(필요할떄 생성자가 직접 만듦)
	 *  GC로 인해 관리된다.
	 */
	private static String numsFile = "src/com/callor/shop/files/num.txt";
	private static List<Integer> intList = new ArrayList<Integer>();
		/*
		 * main() method와 같은 클래스에 있는 다른 method를
		 * 호출하여 코들를 수행할 경우
		 * main() method의 호출을 받는 method들은 모드
		 * 			static으로 선언되어야 한다.
		 * 
		 * main() method와 static으로 선언된 method들이 클래스영역에 선언된 변수를
		 *  	공유하려면 클래스영역에 선언된 변수들도 모두
		 *  	static으로 선언되어야 한다.
		 */
	public static void main(String[] args) {
		/*
		 * static 으로 선언된 method 내에서는
		 * 같은 클래스의 다른 method를
		 * 		this.method() 형식으로 호출하지 못한다
		 * 
		 * 
		 */
		makeNums();
		saveFileNums();
		}// end main()
	
	
	//메서드를 분리하면 어떻게 선언해야되는지 생각해야한다.
	private static void makeNums() {
		Random rnd = new Random();
		
		//리스트를 만들어서 Random수를 저장하기
		List<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i < 100; i++) {
			// 1번코드
			Integer num = rnd.nextInt(1000) + 1;
			intList.add(num);
			
			// 2번코드
			intList.add(rnd.nextInt(1000) + 1);
		}
			
		
	}
	
	private static void saveFileNums() {
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(numsFile);
			printer = new PrintWriter(fileWriter);
			
			//nums 배열에 담긴 전체리스트를
			//향상된 for로 반복하면서 파일에 출력
			for(Integer n : intList) {
				printer.println(n);
			}
			
			// 표준형 for로반복함녀서 파일에 출력
			int nSize = intList.size();
			for(int i = 0; i < nSize; i++) {
				Integer n = intList.get(i);
				printer.println(n);
			}
			
			printer.close();
			fileWriter.close();
			System.out.println("Mission Complete!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}
}
