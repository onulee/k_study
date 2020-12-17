package day19;

import java.util.Scanner;

public class Ex1217_06 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Lotto b = new Lotto(); 
		loop1:while(true) {
			switch(print()) {
			case 1:
				System.out.println("[ 볼6개 추출 ]");
				b.pick6();
				break;
			case 2:
				System.out.println("[ 볼섞기 ]");
				b.shuffle();
				break;
			case 3:
				System.out.println("[ 전체 추출 ]");
				b.output();
				break;
			case 4:
				System.out.println("[ 볼 1개 추출 ]");
				b.pick();
				break;	
			case 0:
				System.out.println("[ 프로그램 종료 ]");
			    break loop1;
			}//switch
		}//while
		
	}//main
	
	static int print() {
		System.out.println("[ 로또 게임 ]");
		System.out.println("1. 볼6개 추출");
		System.out.println("2. 볼섞기");
		System.out.println("3. 전체 추출");
		System.out.println("4. 볼 1개 추출");
		System.out.println("0. 종료");
		System.out.println("-----------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
		int choice = scan.nextInt();
		return choice;
	}

}//class
