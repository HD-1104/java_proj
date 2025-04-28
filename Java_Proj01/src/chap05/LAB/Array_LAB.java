package chap05.LAB;

import java.util.Arrays;

public class Array_LAB {
	public static void main(String[] args) {
		// 1. arr1 배열 변수에 방 100개 생성, 2의 배수의 값을 입력 : 0 ~ 99 방
		// for 문으로 출력, enhanced for 문으로출력, Arrays.toString()으로 출력
		// 코드 자동 정렬 : ctrl + shift + F
		// 주석을 깔끔하게 처리, 팀원과 협업할 수 있도록 깔끔하게 처리

		// 1. 문제 풀이
		int[] arr1 = new int[100]; // 방 100개 : index : 0 ~ 99

		for (int i = 0; i < arr1.length; i++) {

			if (i == 0) {
				continue; 
			}
			
			if (i % 2 == 0) {

				System.out.print(i + "   ");
			}
		}
		System.out.println();
		// 2. for 문을 출력 하는 방법 4가지  
		
		int[] arr2 = new int[5]; 
		
		//for 값 입력 
		for (int i= 0 , j=0 ; i < arr2.length; i++) {
			arr2[i] = j += 10;       // j+=10  <== j = j + 10
		}
		
		// 1. System.out.println(); 
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		
		//2. for 문을 사용해서 출력 
		System.out.println("==for 문으로 출력==");
		for (int i = 0 ; i < arr2.length; i++) {
			System.out.print(arr2[i] + "  ");
		}
		System.out.println();
		
		//3. 향상된 for 문으로 출력 
		System.out.println("==향상된 for ==");
		for (int k : arr2) {
			System.out.print(k + "  " );
		}
		System.out.println();
		
		//4. Arrays.toString(배열변수); 
		System.out.println("==Arrays.toString() 출력 ==");
		System.out.println(Arrays.toString(arr2));
		
	}
}
