package chap05.LAB;

import java.util.Arrays;

public class Array2_LAB {
	public static void main(String[] args) {
		// #. 4가지 방법으로 출력 
		int[][] arr = new int[][] {{1,2,3},{4,5,6},{7,8,9}}; 
		
		// 1. System.out.print(), System.out.println()
		System.out.println("==System.out.println() 출력==");
		System.out.print(arr[0][0] + " ");
		System.out.print(arr[0][1] + " ");
		System.out.println(arr[0][2] );
		
		System.out.print(arr[1][0] + " ");
		System.out.print(arr[1][1] + " ");
		System.out.println(arr[1][2]);
		
		System.out.print(arr[2][0] + " ");
		System.out.print(arr[2][1] + " ");
		System.out.println(arr[2][2]);
		
		// 2. for 문으로 출력 
		//    arr.length : 행의 갯수  <== 2차원 
		//    arr[0].length : 열의 갯수 
		System.out.println("==for 문으로 출력==");
		for (int i=0; i < arr.length; i++ ) {   // 행을 루프 돌림 
			for(int j=0; j < arr[i].length; j++) { //행에대한 열을 루프 돌림 
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		
		// 3. 향상된 for 문으로 출력 
		System.out.println("== 향상된 for ==");
		for (int[] a : arr) {   // 2차원 배열의 행자체[1차원배열] 을 a로 순환하면서..
			for (int k : a) {
				System.out.print(k + "  ");
			}
			System.out.println();
		}
		
		// 4. Arrays.toString() 으로 출력 
		System.out.println("==Arrays.toString()로 출력== For");
		for (int i = 0 ; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		System.out.println("==Arrays.toString()로 출력== 향상된 for");
		for (int[] k : arr) {
			System.out.println(Arrays.toString(k));
		}
		
		
		

	}

}
