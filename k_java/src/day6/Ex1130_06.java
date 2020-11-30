package day6;

import java.util.Scanner;

public class Ex1130_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char choice = ' ';

		loop1: while (true) {
			System.out.println("---------------------");
			System.out.println("   total 프로그램 모음");
			System.out.println("---------------------");
			System.out.println(" 1.성적처리 결과 확인");
			System.out.println(" 2.구구단 ");
			System.out.println(" 3.숫자맞추기 ");
			System.out.println("---------------------");
			System.out.println("원하는 번호를 입력하세요.(종료:x)>>");
			choice = scan.next().charAt(0);
			switch (choice) {
			case '1':
				while (true) {
					System.out.println("[ 성적처리 결과 확인 ]");
					System.out.println("점수를 입력하세요.(이전화면:-1)>>");
					int score = scan.nextInt();
					String grade = "";
					if (score >= 90) {
						grade = "A";
						if (score >= 98) {
							grade += "+"; // grade = grade+"+";
						} else if (score <= 93) {
							grade += "-";
						}
					} else if (score >= 80) {
						grade = "B";
						if (score >= 88) {
							grade += "+"; // grade = grade+"+";
						} else if (score <= 83) {
							grade += "-";
						}
					} else if (score >= 70) {
						grade = "C";
						if (score >= 78) {
							grade += "+"; // grade = grade+"+";
						} else if (score <= 73) {
							grade += "-";
						}
					} else if (score >= 60) {
						grade = "D";
						if (score >= 68) {
							grade += "+"; // grade = grade+"+";
						} else if (score <= 63) {
							grade += "-";
						}
					} else if (score >= 0) {
						grade = "F";
					} else { // 0<score
						System.out.println("이전화면으로 이동>>");
						break;
					}
					System.out.println("당신의 학점 : " + grade);
				} // while
				break;
			case '2':
				System.out.println("구구단 프로그램 실행");
				// 첫시작 단과 마지막 단을 입력해서 출력하시오.
				// 무한반복, -1이전화면으로 이동

				break;
			case '3':
				System.out.println("숫자맞추기 프로그램 실행");
				break;
			case 'x':
			case 'X':
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			default:
				System.out.println("잘못입력하셨습니다. 다시 입력하세요.>>");
				break;
			}

		}

	}

}
