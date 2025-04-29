package chap04.EX06;

public class Label {

	public static void main(String[] args) {
		// labe (라벨, 레이블) <== 이동할 깃발을 꽂는다. : 제어 키워드 (continue, break) 를 특정 위치로 점프 해서 이동 함 
		
		// 구구단 출력 : continue 에서  label 사용해서 특정 위치로 점프 
		POS1:for (int i = 1 ; i < 10 ; i++) {   // 단을 출력 
			System.out.println(i + " 단 입니다");
			System.out.println("============");
			for (int j = 1 ; j < 10 ; j++ ) {
				
				if (i == j) {
					continue POS1;
				}
				
				System.out.println(i + " * " + j + " = " + (i * j));
				
			}
			System.out.println();
			
		}
		
		System.out.println("======================");
		
		// 구구단 : break를 사용해서 label 사용해서 특정 위치로 점프 
		POS2:for (int i=1 ; i < 10 ; i++) {
			System.out.println(i + " 단 출력");
			System.out.println("=============");
			for (int j=1; j <10; j++) {
				
				if (j==7) {
					break POS2; 
				}
				
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println();
		}
		

	}

}
