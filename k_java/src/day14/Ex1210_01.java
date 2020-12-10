package day14;

import java.util.Scanner;

public class Ex1210_01 {

	public static void main(String[] args) {
		// [ 프로그램 ]
		// 1.구구단
		// 2.숫자맞추기
		// ------------
		// 원하는 번호를 선택하세요.>>
		Scanner scan = new Scanner(System.in);
		Ex1210_01 e = new Ex1210_01();
		//무한반복
		loop1:while(true) {
			System.out.println("[프로그램]");
			System.out.println("1.구구단");
			System.out.println("2.숫자맞추기");
			System.out.println("------------");
			System.out.println("원하는 번호를 선택하세요.>>");
			int choice = scan.nextInt();
			//프로그램 선택
			switch(choice) {
			case 1:
				// 1번 -> 메소드 : 2개받아서 2,5 -> 2~5단까지 출력
				break;
			case 2:	
				// main에서 2개의 범위를 입력받아 메소드로 전달
				System.out.println("[숫자맞추기]");
				System.out.println("범위를 입력하세요.>>");
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				//메소드호출-매개변수2개
				int result = e.numMatch(Math.min(num1, num2), Math.max(num1, num2));
				System.out.println("당첨번호 : "+result);
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			}//switch
		}//while
	}//main
	
	int numMatch(int x,int y) {
		Scanner scan = new Scanner(System.in);
		//x -y -> 3 - 105 -> Math.random()*y-(x-1))+x;
		int result = (int)(Math.random()*y-(x-1))+x; //랜덤결과 숫자
		//무한반복
		int count=0;
		while(true) {
			if(count>=10) {
				System.out.println("모든 횟수를 사용했습니다. 프로그램을 종료합니다.");
				break;
			}
			System.out.printf("원하는 숫자를 입력하세요.(도전횟수:%d)>> %n",count+1);
			int num = scan.nextInt();
			if(result>num) {
				System.out.println("더 큰수를 입력하세요.!");
			}else if(result<num) {
				System.out.println("더 작은수를 입력하세요.!");
			}else {
				System.out.println("당첨되었습니다.!");
				break;
			}
			count++;
		}
		return result;
	}

	
	
	
	
}//class
