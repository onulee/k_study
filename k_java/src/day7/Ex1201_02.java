package day7;

import java.util.Scanner;

public class Ex1201_02 {

	public static void main(String[] args) {
		
		//45개 배열 선언후
		// 배열에 1~45 랜덤숫자를 저장하고 출력하시오.
		int[] input = new int[45];
		for(int i=0;i<input.length;i++) {
			input[i] = (int)(Math.random()*45)+1;
		}
		
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
		
		
		// 1~100까지의 숫자를 배열에 저장하고 출력하시오.
//		int[] input = new int[45];
//		
//		for(int i=0;i<input.length;i++) {
//			input[i] = i+1; // 1,2,3....
//		}
//		
//		for(int i=0;i<input.length;i++) {
//			System.out.println(input[i]);
//		}
		
		
		
		// 5번 숫자를 입력받아, 배열에 저장하고 배열을 출력해보세요.
		// 1. 5번 반복문 - for
		// 2. 숫자입력 
		// 3. 배열 출력
//		Scanner scan = new Scanner(System.in);
//		int[] input = new int[5];
//		// 숫자입력
//		for(int i=0;i<input.length;i++) {
//			System.out.println("숫자를 입력하세요.>>");
//			input[i] = scan.nextInt();
//		}
//		//숫자출력
//		System.out.println("[ 입력한 숫자 ]");
//		for(int i=0;i<input.length;i++) {
//			System.out.print(input[i]+" ");
//		}
		
//		int[] score = {100,90};
//		for(int i=0;i<score.length;i++) {
//			System.out.println(score[i]);
//		}
//		System.out.println("배열의 크기 : "+score.length);
		
		
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		int d = 0;
//		int e = 0;
//		
//		int[] score = new int[5];
//		score[0] = 100;
//		score[1] = 90;
//		score[2] = 80;
//		score[3] = 70;
//		score[4] = 60;
//		
//		int[] num = {100,90,80,70,60,50,40,30,20,10};
//		
//		int[] input;
//		input = new int[] {100,90,80,70,60};
		
		
		
	}

}
