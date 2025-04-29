package chap04.LAB;

import java.util.Scanner;

public class IF_Statement_LAB {

	public static void main(String[] args) {
		// 요일을 입력 받아서 
		// 월요일 : 월요일은 자바를 공부 합니다. 
		// 화요일 : 화요일은 SQL을 공부 합니다. 
		// 수요일 : 수요일은 HTML을 공부 합니다. 
		// 목요일 : 목요일은 CSS를 공부 합니다. 
		// 금요일 : 금요일은 JavaScript를 공부 합니다. 
		// 툐요일 : 토요일은 운동을 합니다. 
		// 일요일 : 일요일은 음악 감상을 합니다. 
		//   그외 : 제대로된 요일을 입력해 주세요.        변수명.equals() 를 사용 / if / switch 
		
		// 기본 타입은 값을 비교 할때 ==, 참조 타입 값을 비교할때  변수명.equals() 
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("요일을 입력해 주세요>>>");
		String a = sc.next(); 
		
		if (a.equals("월요일")) {
			System.out.println("월요일은 자바를 공부 합니다.");
		}else if (a.equals("화요일")) {
			System.out.println("화요일은 SQL을 공부 합니다.");
		}else if (a.equals("수요일")) {
			System.out.println("수요일은 HTML을 공부 합니다.");
		}else if (a.equals("목요일")) {
			System.out.println("목요일은 CSS를 공부 합니다.");
		}else if (a.equals("금요일")) {
			System.out.println("금요일은 JavaScript를 공부 합니다.");
		}else if (a.equals("토요일")) {
			System.out.println("토요일은 운동을 합니다.");
		}else if (a.equals("일요일")) {
			System.out.println("일요일은 음악 감상을 합니다.");
		}else  {
			System.out.println("제대로된 요일을 입력해 주세요.");
		}
		
		System.out.println("=======  switch ================");
		
		switch (a) {
		
		case "월요일": 
			System.out.println("월요일은 자바를 공부 합니다.");
			break; 
		case "화요일": 
			System.out.println("화요일은 SQL을 공부 합니다.");
			break; 
		case "수요일": 
			System.out.println("수요일은 HTML을 공부 합니다.");
			break; 
		case "목요일": 
			System.out.println("목요일은 CSS를 공부 합니다.");
			break;
		case "금요일": 
			System.out.println("금요일은 JavaScript를 공부 합니다.");
			break; 
		case "토요일": 
			System.out.println("토요일은 운동을 합니다.");
			break;
		case "일요일": 
			System.out.println("일요일은 음악 감상을 합니다.");
			break;
		default : 
			System.out.println("제대로된 요일을 입력해 주세요.");
		}
		
		
		
		
		
		sc.close();

	}

}
