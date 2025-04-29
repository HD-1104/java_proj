package chap05.EX01;

import java.util.Arrays;

public class Array_Definition {

	public static void main(String[] args) {
		// 배열 ( Array ) : 참조 자료형, 변수명, 참조주소 <==  stack, 값 <==  heap에 저장 
		
		// 배열 선언 :  int[] a = new int[3]; 
		
		//1.  배열 선언 
		int[] arr1 = new int[3];  //  arr1 배열변수에 값을 저장할 수 있는 방3개를 생성, Heap 
		
		//2. 배열의 각 방의 내용을 출력 : 방번호[index]는 0, 1, 2  : arr1[0], arr1[1], arr1[2]
			// Heap의 메모리에는 반드시 값이 들어가 있어야 한다. 
				// int : 0 , double : 0.0, boolean : false
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
//		System.out.println(arr1[3]);  // ArrayIndexOutOfBoundsException, 
									  // 배열의 존재하지 않는 방번호를 출력시 발생하는 오류
		
		System.out.println("============");
		//3. 배열의 각 방에 값을 입력 
		arr1[0] = 10; 
		arr1[1] = 20; 
		arr1[2] = 30; 
		    // 방의 내용을 출력 
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		System.out.println("=== for 문을 사용해서 값 입력/출력====");
		//4. for 문을 사용해서  배열의 값을 입력/출력 
		int[] arr2 = new int [100];    // 0 ~ 99까지 있음.  기본값으로 : 0 
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[99]);
//		System.out.println(arr2[100]);  // 오류 발생
		
		System.out.println("============");
		   // for문을 사용해서 각 방의 내용을 출력 
		for (int i = 0 ; i < 100; i++) {
			// 배열의 각 방에 값을 입력 
			arr2[i] = i+2; 	
			// 배열의 각 방의 내용을 출력 
			System.out.println(arr2[i]);
		}
		
		// 배열의 방의 크기를 출력 메소드 : 배열변수명.length <== 방의 갯수를 출력 
		// 
		System.out.println(" 배열변수의 방의 갯수 출력 ");
		System.out.println(arr2.length);
		
		for (int i = 0 ; i < arr2.length ; i++) {
			arr2[i] = i ;    // 각 방의 값을 입력
			System.out.println(arr2[i]);
		}
		
		System.out.println("====향상된(Enhanced)  for 문을 사용해서 출력 =====");
		// 
		int[] arr3 = new int[100]; 
		// for 문을 사용해서 입력/ 출력 
		System.out.println("== for 문으로 입력/출력 == ");
		for (int i =0 ; i < arr3.length ; i++) {
			arr3[i] = i ;  // 각 방의 값을 입력
			System.out.println(arr3[i]);
		}
		
		System.out.println("== 향상된 for 문으로 출력 ==");
		// 배열의 0 ~ 마지막 방까지 돌면서 출력 
		for (int k : arr3) {
			System.out.println(k);
		}
		
		System.out.println("== Arrays.toString(배열변수) ===");
		System.out.println(Arrays.toString(arr3));
		
		// 배열의 각 방의 내용을 출력 하는 방법 4가지. 
		//     1. 생으로 출력 :  System.out.println(arr3[0]);  //직접 방번호를 넣어서 출력
		//     2. for 문을 사용해서 출력 
		//     3. 향상된 for 문을 사용해서 출력 
		//     4. Arrays.toString(배열변수명)  
				
		
		
	}

}
