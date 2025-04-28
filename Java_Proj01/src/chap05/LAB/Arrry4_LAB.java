package chap05.LAB;

public class Arrry4_LAB {
	public static void main(String[] args) {
		/* arr[4][40] 
			arr[0] = 7의 배수를 입력
			arr[1] = 9의 배수를 입력
			arr[2] = 13의 배수 입력
			arr[3] = 15의 배수를 입력 
			
			arr[0] 7의 배수의 합 : sum , 평균 : avg 
			arr[1] 9의 배수의 합 : sum , 평균 : avg 
			arr[2] 13의 배수의 합 : sum , 평균 : avg 
			arr[15] 15의 배수의 합 : sum , 평균 : avg 
			
			완료시간 : 4시 20분 
		 */
		//1. 배열 선언 
		int[][] arr = new int[4][40]; 
		
		//2. 배열의 각 방에 값을 입력 
		int o = 7, l=9, m = 13, n=15 ; // 각 배열 행의 들어갈 초기값 할당
		for (int i = 0 ; i < 40; i++) {
			arr[0][i] = o; 
			arr[1][i] = l ; 
			arr[2][i] = m; 
			arr[3][i] = n; 
			o += 7; l += 9; m += 13; n += 15; 
		}
		// 3. 출력 
		for (int[] a : arr) {
			for (int k: a) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		// 4. 평균과 합을 구하는 for 
		for (int i = 0 ; i < arr.length; i++) {
			int sum =0; 
			for (int j = 0; j <arr[i].length; j++) {				
				sum += arr[i][j]; 
			}
			double avg = 0.0; 
			avg = (double)sum / arr[i].length; 
			
			System.out.println(i +"행의 sum : " + sum + ", 평균 : " + avg);
		}
		
		
		
	}
}
