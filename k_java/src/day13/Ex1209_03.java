package day13;

import java.util.Scanner;

public class Ex1209_03 {

	public static void main(String[] args) {
		// vending machine 기기
		// 객체 Drink - 제품번호,음료명,판매금액,원가,용량,수량
		// 음료3개를 생성해서 입력하여 출력하는 프로그램을 구현하시오.
		// 제품등록 - 현재 프로그램진행
		Scanner scan = new Scanner(System.in);
		Drink[] drink = new Drink[5];
		for (int i = 0; i < drink.length; i++) {
			drink[i] = new Drink(); // 배열선언후 각각 객체선언을 해줌.

			System.out.println("제품번호를 입력하세요.>>");
			drink[i].p_num = scan.nextInt(); // 숫자
			scan.nextLine();
			System.out.println("음료명을 입력하세요.>>");
			drink[i].drink_name = scan.nextLine();
			System.out.println("판매금액을 입력하세요.>>");
			drink[i].sale_price = scan.nextInt();
			System.out.println("원가를 입력하세요.>>");
			drink[i].cost = scan.nextInt();
			System.out.println("용량을 입력하세요.>>");
			drink[i].size = scan.nextInt();
			System.out.println("수량을 입력하세요.>>");
			drink[i].quantity = scan.nextInt();
		}

		// 화면출력 - 3명의 회원정보 출력
		System.out.println("[ 제품정보 ]");
		for (int i = 0; i < drink.length; i++) {
			System.out.printf("%d %s %d %d %d %d %n", drink[i].p_num,
					drink[i].drink_name,drink[i].sale_price,drink[i].cost,drink[i].size
					,drink[i].quantity);
		}

		// 1 펩시콜라 1000 300 500 10
		// 2 미란다 800 200 500 20
		// 3 오란씨 900 250 500 10
		// 4 데자와 1000 300 500 10
		// 5 솔의눈 1200 320 500 10

		// [ 자판기 프로그램 ]
		// 1.펩시콜라 2.미란다 3.오란씨 4.데자와 5.솔의눈 8.현금투입 9.관리자메뉴
		// 관리자메뉴 - 1.제품등록 2.판매량 3.수익 4.재고관리

	}

}
