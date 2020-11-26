package day4;
import java.util.Scanner;

public class Ex1126_03 {

	public static void main(String[] args) {
		
		// 숫자를 입력받아 8살이상이면 학교를 다닙니다. 다니지 않습니다.
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		if(input>=8) {
			System.out.println("학교를 다닙니다.");
		}else {
			System.out.println("학교를 다니지 않습니다.");
		}
		
		
		
		// 문자열 1개를 입력받아
        // admin이면 일치합니다. 다르면 일치하지 않습니다. 
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("ID를 입력하세요.>>");
//		String id = scan.next();
//		System.out.println("password를 입력하세요.>>");
//		String pw = scan.next();
//		
//		if(id.equals("admin")) {
//			if(pw.equals("1234")) {
//				System.out.println("ID, password가 일치합니다.");
//			}else {
//				System.out.println("ID는 일치하지만, password가 일치하지 않습니다. 로그인을 다시 해주세요.");
//			}
//		}else {
//			System.out.println("ID가 일치하지 않습니다. 로그인을 다시 해주세요.");
//		}
		
		
		
		
		// 숫자를 입력받아
		// 90점이상이면 "A", 80점이상이면 B, 70점이상이면 C,60점 이상이면 D
//		Scanner scan = new Scanner(System.in);
//		int input = scan.nextInt();
//		String grade="";
//		if(input>=90) {
//			grade="A";
//			if(input>=98) {
//				grade = grade + "+";  // "A"+"+"=A+
//			}else if(input < 94) {
//				grade = grade + "-";  // "A" + "-"=A-
//			}
//		}else if(input>=80) {
//			grade="B";
//		}else if(input>=70) {
//			grade="C";
//		}else if(input>=60){
//			grade="D";
//		}else {
//			grade="F";
//		}
//		System.out.println(grade);
		
		// 숫자를 입력받아
		// 60점초과이면 합격, 60점 재시험, 60점미만 불합격
		
//		Scanner scan = new Scanner(System.in);
//		int input = scan.nextInt();
//		if(input>=60) {
//			System.out.println("합격");
//		}else if(input==60) {
//			System.out.println("재시험");
//		}else {
//			System.out.println("불합격");
//		}
		
		
//		int a = 7;
//		if(a>0) {
//			System.out.println("양수입니다.");
//		}else if(a==0) {
//			System.out.println("0입니다.");
//		}else {
//			System.out.println("음수입니다.");
//		}

	}

}
