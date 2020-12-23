package day23;

import java.util.Scanner;

public class Ex_shop {
	static Scanner scan = new Scanner(System.in);
	static Buyer b1;

	public static void main(String[] args) {
		loop1: while (true) {
			System.out.println("[ 온라인쇼핑몰 ]");
			System.out.println("1.회원등록");
			System.out.println("2.TV구매");
			System.out.println("3.COMPUTER구매");
			System.out.println("4.AUDIO구매");
			System.out.println("5.구매물품 보기");
			System.out.println("0.종료");
			System.out.println("----------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			scan.nextLine();

			switch (choice) {

			case 1:
				System.out.println("이름을 입력하세요.>>");
				String name = scan.nextLine();
				System.out.println("보충할 금액을 입력하세요.>>");
				int coin = scan.nextInt();
				b1 = new Buyer(name, coin, 0); // 고객1명 생성
				// 무한반복
				// 나중에 로그인
				break;
			case 2:
				
				b1.buy(new Tv());
				System.out.println("TV 구매하였습니다.");
				break;
			case 3:
				b1.buy(new Computer());
				System.out.println("Computer 구매하였습니다.");
				break;

			case 4:
				b1.buy(new Audio());
				System.out.println("Audio 구매하였습니다.");
				break;

			case 5:
				b1.cart_output();
				break;

			case 0:
				System.out.println("프로그램을 종료합니다.!");
				break loop1;
			}

		} // while
	}// main

}
