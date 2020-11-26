package day4;
import java.util.Scanner;

public class Ex1125_05 {

	public static void main(String[] args) {
		
		// int 입력받아 0보다크면 양수, 0 - 영, 0보다작으면 음수
//		Scanner scan = new Scanner(System.in);
//		int score = scan.nextInt();
//		String result = (score>0)?"양수":(score==0)?"0":"음수";
		
		// 60점초과 "합격", 60점 재시험,60점 미만 불합격
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String result = (score>60)?"합격":(score==0)?"재시험":"불합격";
		
		// int 입력받아 90이상이면 'A':'B'
//		Scanner scan = new Scanner(System.in);
//		int score = scan.nextInt();
//		char ch = (score>=90)?'A':(score>=80)?'B':'C';
//		System.out.println(ch);
		
		
		
		
		
		// int 숫자입력을 받아 3의배수인지 확인해서 "3의배수":"아님";
//		Scanner scan = new Scanner(System.in);
//		int input = scan.nextInt();
////		String result = (input%3==0)?"3의배수":"아님";
//		String result ="";
//		if(input%3==0) {
//			result = "3의 배수";
//		}else {
//			result = "아님";
//		}
//		System.out.println(result);
		
		
		
//		Scanner scan = new Scanner(System.in);
//		int x = scan.nextInt();
//		
//		// 60점 이상이면 "합격":"불합격"
//		String str = (x>=60)?"합격":"불합격";
//		System.out.println(str);
		
		
		// 90점 이상이면 'A':'B'
//        char result = (x>=90)?'A':'B';
//		System.out.println(result);
		
		
//		String str = (x>=0)?"양수":"음수";
//		if(x>=0) {
//			System.out.println("양수");
//		}else {
//			System.out.println("음수");
//		}

	}

}
