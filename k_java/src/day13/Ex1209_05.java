package day13;

import java.util.Scanner;

public class Ex1209_05 {

	public static void main(String[] args) {
		Ex1209_05 e = new Ex1209_05();  //Ex1209_05 객체선언
		Scanner scan = new Scanner(System.in);
		int choice=0;
		while(true) {
			choice = e.print();  // 화면출력 메소드 - choice변수 리턴
			switch(choice) {
			case 1:
				e.add();  //더하기 메소드호출
				break;
			case 2:
				//e.subtract() - 빼기
				break;
			case 3:
				//e.multiply() - 곱하기
				break;
			case 4:
				//e.division() - 나누기
				break;
			case 5:
				//max() - 최대값 
				break;
			case 0:
				//종료
				break;	
			}//switch
		}//while
	}//main
	
	int print() {
		Scanner scan = new Scanner(System.in);
		System.out.println("[ 프로그램 ]");
		System.out.println("1.더하기 ");
		System.out.println("2.빼기 ");
		System.out.println("3.곱하기 ");
		System.out.println("4.나누기 ");
		System.out.println("5.최대값구하기 ");
		System.out.println("0.종료 ");
		System.out.println("----------------- ");
		System.out.println("원하는 번호를 입력하세요.>> ");
		int choice=scan.nextInt();
		return choice;
	}
	
	
	void add() {
		Scanner scan = new Scanner(System.in);
		int num1=0,num2=0,result=0;
		System.out.println("[더하기 프로그램]");
		System.out.println("더하기 할 1번째 숫자를 입력하세요.>>");
		num1 = scan.nextInt();
		System.out.println("더하기 할 2번째 숫자를 입력하세요.>>");
		num2 = scan.nextInt();
		result = num1+num2;
		System.out.printf("%d + %d = %d %n",num1,num2,result);
	}
	

}
