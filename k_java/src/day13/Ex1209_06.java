package day13;

import java.util.Scanner;

public class Ex1209_06 {

	public static void main(String[] args) {
		// 두수 입력받아, +,-,*,/ 결과값을 출력
		Ex1209_06 e = new Ex1209_06();
		Scanner scan = new Scanner(System.in);
		int num1=0,num2=0,result=0,choice=0;
		System.out.println("[사칙연산 프로그램]");
		System.out.println("두수를 입력하세요.>>");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("1.+ 2.- 3.* 4./");
		System.out.println("---------------------");
		System.out.println("원하는 번호를 선택하세요.>>");
		choice=scan.nextInt();
		// calculate()메소드 호출 - 매개변수3개 
		result = e.calculate(num1,num2,choice);
		System.out.println("결과값 : "+result);
	}//main

	int calculate(int num1,int num2,int choice) {
		int result=0;
		//사칙연산 선택
		switch(choice) {
		case 1:
			result = num1+num2;
			break;
		case 2:
			result = num1-num2;
			break;
		case 3:
			result = num1*num2;
			break;
		case 4:
			result = num1/num2;
			break;
		}
		return result; 
	}
	
	
	
	
	
}//class
