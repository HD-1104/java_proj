package chap06.Ex02;
class car{
	// 1. 필드 , 2. 생성자 , 3. 메소드 ,4. 인너클래스
	String carName;
	String carColor;
	int carAge;
	
	// 2. 생성자 : 객체를 생성할 때 호출됨, 필드의 초기값을 할당 , 객체이름과 동일한 이름의 메소드, 리턴타입이 없는 것
	car(){} // 기본 생성자 : 생략 기능 , 다른 생성자가 존재할 때 반드시 명시
	car(String carName , String carColor , int carAge){
		this.carName = carName;
		this.carColor = carColor;
		this.carAge = carAge;
	}
	//3. 메소드 : 함수(메소드) , 리턴타입 메소드명(인풋매개변수){실행블락}
	void printAll() {
		System.out.println("자동차 이름 : " + carName + "자동차 색깔 : " + carColor +
				"자동차 연식 : " + carAge);
	}
}
public class Class_VS_Olbject {
	public static void main(String[] args) {
		// 1. 객체 생성 : Class ->  객체
		car car1 = new car("현대자동차", "빨간색", 2005);
	// 클래스명 변수(객체화) = 힙에 저장하라 클래스명(생성자);
		
		
		// 2. 메소드 호출
		car1.printAll();
		
		car car3 = new car("삼성자동차", "횐색", 2010);
		car3.printAll();
		car car4 = new car("람보르니", "금색", 2023);
		car4.printAll();
		
		car car5 = new car("마세라티", "검정색", 2024);
		car5.printAll();
	}
}






