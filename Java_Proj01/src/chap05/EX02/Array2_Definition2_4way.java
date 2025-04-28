package chap05.EX02;

public class Array2_Definition2_4way {

	public static void main(String[] args) {
		// 2차원 배열 선언 방법 4가지 
		
		//1.  권장 방법 
		int[][] arr1 = new int[3][5];
		
		//2. 
		int arr2[][] = new int[3][5]; 
		
		//3. 
		int[][] arr3 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		
		//4.    <== 선언/초기화를 분리 불가능 
		int[][] arr4 =  {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("==배열 선언 / 초기화를 분리 해서 사용== ");
		
		//1.  권장 방법 
		int[][] arr5 ;            // 선언
		arr5= new int[3][5];      // 초기화
		
		//2. 
		int arr6[][] ;
		arr6 = new int[3][5]; 
		
		//3. 
		int[][] arr7 ;
		arr7 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		
		//4.    <== 선언/초기화를 분리 불가능 
		int[][] arr8 ;
//		arr8 = {{1,2,3},{4,5,6},{7,8,9}};    //오류 발생
		
	}

}
