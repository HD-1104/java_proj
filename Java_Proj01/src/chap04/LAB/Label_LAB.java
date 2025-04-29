package chap04.LAB;

public class Label_LAB {
	public static void main(String[] args) {
		// 구구단 출력 , 홀수단 만 출력하되  continue, break를 사용해서 , 단은 1씩증가 
		out:for (int i=1 ; i <10 ; i++) {
			if (i % 2 == 0) {   // 2의 배수 
				continue out; 
			}
			
			System.out.println(i + "단 출력 ");
			System.out.println("===========");
			for (int j = 1 ; j < 10 ; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println();
		}
		
		
		
		
	}
}
