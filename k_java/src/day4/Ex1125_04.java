package day4;
import java.util.Scanner;

public class Ex1125_04 {

	public static void main(String[] args) {
		//char input = '가';
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
//		scan.nextInt();
//		scan.nextDouble();
//		scan.nextLine();
		if(0<=input && input <= 9) { 
			System.out.println("영문자입니다.");
		}else {
			System.out.println("영문자가 아닙니다. 영문자를 입력하세요.");
		}

	}

}
