package com.home.shop;

import java.util.Scanner;

public class Ex1224_01 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 1.Drink - d_name,price,bonusPoint
		// Buyer - money,bonusPoint, buy()
		// 2. Tejava - 900,90 String flavor="밀크티";
		// 3. Pepsi - 1000,10 int size=250;
		// 4. Miranda - 800,80 String color="orange";
		// 5. Oranc - 900,90 int calory=0;

		// 이름 : 홍길동 금액 100000
		// 데자와 2개, 펩시 3개,미란다 1개, 오란씨 1개
		// 보유금액, 보너스포인트, 구매물품 출력을 하세요.
		// 무한반복
		while (true) {
			System.out.println("[ 온라인자판기 ]");
			System.out.println("1.회원등록"); // 이름,금액 입력받아서 객체
			System.out.println("2.Tejava구매");
			System.out.println("3.Pepsi구매");
			System.out.println("4.Miranda구매");
			System.out.println("5.Oranc구매");
			System.out.println("6.구매물품 보기");
			System.out.println("0.종료");
			System.out.println("----------------------");
			System.out.println("원하는 번호를 입력하세요.>>");

		}

	}

}
