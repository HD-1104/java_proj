package chap05.EX02;

import java.util.Arrays;

public class Array2_Definition {
	public static void main(String[] args) {
		/*
		   2차원 정방형 배열  : 행에 대해서과 열의 갯수가 일치 배열 
		   2차원 비정방형 배열 : 행에 대해서  열의 갯수가  다른 배열 
		 */
		
		//1. 배열 선언 
		int[][] arr1 = new int[2][3];  // 행의 방의 갯수 : 2, 열의 갯수 : 3 
		
		//2. 각 배열 방에 값을 입력 
		arr1[0][0] = 10; 
		arr1[0][1] = 20; 
		arr1[0][2] = 30; 
		arr1[1][0] = 40; 
		arr1[1][1] = 50; 
		arr1[1][2] = 60; 
		
//		arr1[1][3] = 70;   // 실행시 오류 발생 : 없는 방번호 <== 주의 
						   //ArrayIndexOutOfBoundsException
		
		//3. 출력 4가지 방법 
		//3-1 System.out.println() 
		System.out.println("== System.out.println() == ");
		System.out.print(arr1[0][0] + "  ");
		System.out.print(arr1[0][1] + "  ");
		System.out.println(arr1[0][2]);
		
		System.out.print(arr1[1][0] + "  ");
		System.out.print(arr1[1][1] + "  ");
		System.out.println(arr1[1][2]);
		
		//3-2. for 문으로 출력 하는 방법 : 2중 for 문을 사용해서 출력 
			//  arr1.langth : 1차원 배열일때 : index[방]의 갯수, 열의 갯수 
		    //                2차원 배열일때 : 행의 갯수 
		System.out.println(arr1.length);   // 행의 갯수 : 2 
		System.out.println(arr1[0].length); // 0행의 열의 갯수 : 3
		System.out.println(arr1[1].length); // 1 행의 열의 갯수 : 3

		System.out.println("==for문으로 출력==");
		
		for (int i = 0 ; i < arr1.length; i++ ) {   //행의 갯수를 정의 
			for (int j = 0 ; j < arr1[i].length ; j++) {  // 행에대한 열의 갯수 정의
				System.out.print(arr1[i][j] + "  ");
			}
			System.out.println();
		}
		
		//3. 향상되 for 문을 사용해서 출력 
		System.out.println("==향상된 for 문을 사용해서 출력===");
		for (int[] a : arr1) {    //행을 순환하면서 배열 a 로 끄집어낸다
			for (int k : a) {
				System.out.print(k + "  ");
			}
			System.out.println();
		}
		
		//4. Arrays.toString() 을 사용해서 출력 : 1차원 배열의 값을 출력 
		System.out.println("==Arrays.toString()==");
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));
		
		
		
	}
}
