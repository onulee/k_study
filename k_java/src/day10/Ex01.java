package day10;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 456.1257
		// 1.round->반올림 2.ceil->올림 3.floor->버림

		// [ 실수처리 프로그램 ]
		// 1.반올림
		// 2. 올림
		// 3. 버림
		// 하고 싶은 번호를 입력하세요>> 3
		// 버림을 선택하셨습니다. 숫자를 입력하세요.>> 456.1257
		// 2자리에서 버림 결과값 : 456.1

		String[] name = {"0","반올림","올림","버림"};
		System.out.println("[ 실수처리 프로그램 ]");
		System.out.println("1. 반올림");
		System.out.println("2. 올림");
		System.out.println("3. 버림");
		System.out.println("하고 싶은 번호를 입력하세요>>");
		int choice = scan.nextInt();
		double input=0;
		double result=0;
		System.out.println(name[choice]+"을 선택하셨습니다. 숫자를 입력하세요.>>");
		input = scan.nextDouble();
		switch (choice) {
		case 1:
			result = (Math.round(input * 10)) / 10.0;
			break;
		case 2:
			result = (Math.ceil(input * 10)) / 10.0;
			break;

		case 3:
			result = (Math.floor(input * 10)) / 10.0;
			break;
		}
		
		System.out.println(result);
		

	}

}
