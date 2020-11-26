package day4;
import java.util.Scanner;

public class Ex1126_02 {

	public static void main(String[] args) {
		// 1. 숫자를 입력받아 0~100의 숫자가 입력되면
		// 정상입니다. 다시입력하세요.
//		Scanner scan = new Scanner(System.in);
//		int input = scan.nextInt();
//		if(input>=0 && input<=100) {
//			System.out.println("정상입니다.");
//		}else {
//			System.out.println("다시입력하세요.");
//		}
		// 2. 문자 M을 입력받으면 남자입니다. 여자입니다.
//		Scanner scan = new Scanner(System.in);
//		char input = scan.next().charAt(0);
//		if(input=='m' || input=='M') {
//			System.out.println("남자입니다.");
//		}else {
//			System.out.println("여자입니다.");
//		}
		
		// 3. car 문자열을 입력받아 맞으면 차, 아니면 다시입력하세요.
//		Scanner scan = new Scanner(System.in);
//		String input = scan.next();
//		if(input.equalsIgnoreCase("car")) {
//			System.out.println("차입니다.");
//		}else {
//			System.out.println("다시입력해주세요.");
//		}
		// 4. 문자를 입력받아 a~z까지이면 영문소문자, 영문소문자가 아닙니다.
//		Scanner scan = new Scanner(System.in);
//		char input = scan.next().charAt(0);
//		if(input>='a' && input<='z') {
//			System.out.println("영문소문자입니다.");
//		}else {
//			System.out.println("영문소문자가 아닙니다.");
//		}
		
		// 5. 숫자를 입력받아 90점이상이면 A학점입니다. A학점이 아닙니다.
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		if(input>=90) {
			System.out.println("A학점입니다.");
		}else {
			System.out.println("A학점이 아닙니다.");
		}
		
		
		
		
	}
}
