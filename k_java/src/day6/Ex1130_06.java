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
			System.out.println(" 1.성적처리 결과 확인 프로그램");
			System.out.println(" 2.구구단 프로그램 ");
			System.out.println(" 3.숫자맞추기 프로그램");
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
				System.out.println("[ 구구단 프로그램 ]");
				
				while(true) {
					System.out.println("시작할 단을 입력하세요.(이전화면:-1)>>");
					int input1 = scan.nextInt();
					if(input1==-1) {  //-1 입력시 이전화면으로 이동
						System.out.println("이전화면으로 이동합니다.!");
						break;
					}
					System.out.println("마지막 단을 입력하세요.>>");
					int input2 = scan.nextInt();
					
					int end = Math.max(input1, input2);  //두수 중 큰수
					int start = Math.min(input1, input2); // 두수 중 작은수
					
					for(int i=start;i<=end;i++) {
						for(int j=1;j<=9;j++) {
							System.out.println(i+" * "+j+" = "+i*j);
						}
						System.out.println();
					}
				}//while
				break;
			case '3':
				System.out.println("[ 숫자맞추기 프로그램 ]");
				System.out.println("* 1-100까지 숫자를 맞추는 게임입니다!");
			    
				num_loop1: while(true) { // 숫자맞추기 프로그램 무한반복
			    	int r_num = (int)(Math.random()*100)+1; //랜덤숫자
			    	
			    	while(true) { // 숫자프로그램만 무한반복
			    		System.out.println("원하는 숫자를 입력하세요.(이전화면:-1)>>");
			    		int input_num=scan.nextInt();
			    		if(input_num==-1) {
			    			System.out.println("이전화면으로 이동합니다!");
			    			break num_loop1;
			    		}
						if(r_num>input_num) {
							System.out.println("더 큰 숫자를 입력하세요!");
						}else if(r_num<input_num) {
							System.out.println("더 작은 숫자를 입력하세요!");
						}else {
							System.out.println("정답입니다.");
							break;
						}
					}//while
					System.out.println("정답 숫자 : "+r_num);
					
					
					
			    }//while:num_loop1
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
