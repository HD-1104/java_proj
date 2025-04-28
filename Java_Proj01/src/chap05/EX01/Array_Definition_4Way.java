package chap05.EX01;
public class Array_Definition_4Way {
	public static void main(String[] args) {
		// 배열(Array) : 하나의 변수에 여러 개의 값을 처리 , index : 0 ~ n 개 
		
		//1. 배열 선언 : 자료형에 []   <== 권장 사항. , 배열 방 3개 : index : 0 ~ 2  
		int[] arr1 = new int[3];  // 초기값 : 0
		arr1[0] = 10; 
		arr1[1] = 20;
		arr1[1] = 30;
		//2. 배열 선언 2 : 변수에서 []
		int arr2[] = new int[3];  // 초기값 : 0
		arr2[0] = 10; 
		arr2[1] = 20;
		arr2[1] = 30;
		//3. 배열을 선언과 동시에 값을 할당 
		int[] arr3 = new int[] {10,20,30,40,50} ; 
		
		//4. 배열 선언과 동시에 값을 할당 :  new int[] 생략 
		//    선언과 초기화을 분리할 수 없다. <== 
		int[] arr4 = {60,70,80,90,100}; 
		
		System.out.println("=======배언 선언 과 초기화를 분리=================");
		//1. 
		int[] arr5;          // 배열 선언
		arr5 = new int[3];   // 초기화 
		//2. 
		int arr6[]; 
		arr6 = new int[3]; 
		//3. 
		int[] arr7 ; 
		arr7 = new int[] {10,20,30}; 
		
		//4. 선언과 초기화를 분리할시 오류 발생 
		int[] arr8[]; 
//		arr8 = {10,20,30};      // 오류 발생 
		

	}
}
