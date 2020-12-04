package day10;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 1-100까지 총합
		// 처음값 입력, 마지막값 입력 받아
		// 그 사이 정수 합을 구하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("시작 숫자를 입력하세요.>>");
		int a = scan.nextInt();
		System.out.println("마지막 숫자를 입력하세요.>>");
		int b = scan.nextInt();
		int sum=0;
		int i=0;
		for(i=Math.min(a, b);i<=Math.max(a, b);i++) {
				sum = sum + i; //sum += i
		}
		
		System.out.println("결과값 :"+sum);

	}

}
