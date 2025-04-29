package chap05.LAB;

public class Array3_LAB {
	public static void main(String[] args) {
		// arr[3][20] 
		//   arr[0] : 2의 배수를 저장 
		//   arr[1] : 3의 배수를 저장 
		//   arr[2] : 5의 배수를 저장 
		// for문을 사용해서 저장 ,  for 문을 사용해서 출력 
		// 완료시간 : 3시 15분까지 
		
		//1. 배열 선언 
		int[][] arr = new int[3][20];
		//2. for 문을 사용해서 각 행의 값을 입력 
		
		for (int i = 0, j = 2,k =3, l=5; i < 20; i++) {
			
			arr[0][i] = j; //2의 배수 저장 
			arr[1][i] = k; //3의 배수 저장
			arr[2][i] = l; //5의 배수 저장 
			
			j+=2;   // j = j + 2
			k+=3; 	// k = k + 3
			l+=5; 	// l = l + 5
		}
		
		//3. for 문을 사용해서 출력 / 향상된 for문을 사용해서 출력 
		System.out.println("==for 문을 사용해서 출력==");
		for ( int i= 0 ; i < arr.length ; i++) {       //행을 루프
			for (int j= 0; j < arr[i].length;j++) {    //행의 열을 루프
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==향상된 for 문을 사용해서 출력==");
		for (int[] a : arr) {
			for (int k: a) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		

	}
}
