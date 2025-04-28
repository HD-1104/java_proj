package chap03.LAB;

import java.util.Scanner;

public class OperatorLAB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in); 
		
		System.out.println("점수를 입력하세요>>>");
		int a = sc.nextInt(); 
		
		System.out.println( ( a > 60 )? "합격": "불합격");

	}

}
