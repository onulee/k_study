package day4;


import java.util.Scanner;

public class Ex1125_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("3번 숫자를 입력하세요.>>");
		int i = scan.nextInt();
		int j = scan.nextInt();
		int k = scan.nextInt();
		System.out.println("당신이 입력한 숫자 : "+i+","+j+","+k);
		System.out.println("더한 값 : "+(i+j+k));
		
		

	}

}
