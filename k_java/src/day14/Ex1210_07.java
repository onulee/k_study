package day14;

import java.util.Scanner;

public class Ex1210_07 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 객체 Drink - 제품번호,음료명,판매금액,원가,용량,수량
		// 음료3개를 생성해서 입력하여 출력하는 프로그램을 구현하시오.
		Drink[] drink = new Drink[2]; //객체배열
		loop1:while(true) {
			int choice = main_print(); //화면출력
			switch(choice) {
			
			case 1://펩시콜라
				System.out.printf("%s %d원이 구매되었습니다. %n",drink[0].drink_name,drink[0].sale_price);
				break;
			case 6:
				System.out.println("[제품등록]");
				pro_input(drink); //제품등록-메소드호출
				break;
			case 7:
				pro_print(drink);
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.!");
				break loop1;
			}//switch
		}//while
		
		// 1 펩시콜라 1000 300 500 10
		// 2 미란다 800 200 500 20
		// 3 오란씨 900 250 500 10
		// 4 데자와 1000 300 500 10
		// 5 솔의눈 1200 320 500 10

		// [ 자판기 프로그램 ]
		// 1.펩시콜라 2.미란다 3.오란씨 4.데자와 5.솔의눈 8.현금투입 9.관리자메뉴
		// ------------------------------------------------------
		// 구매하고 싶은 음료를 선택하세요.>> 1
		// 펩시콜라 1000원이 구매되었습니다.
		//
		// 관리자메뉴 - 1.제품등록 2.판매량 3.수익 4.재고관리 -
		// 총판매량, 각각의 판매량, 총판매금액, 각각의 판매금액, 수익

	}//main
	
	// 제품출력
	static void pro_print(Drink[] drink) {
		System.out.println("[ 제품정보 ]");
		for (int i = 0; i < drink.length; i++) {
			System.out.printf("%d %s %d %d %d %d %n", drink[i].p_num, drink[i].drink_name, drink[i].sale_price,
					drink[i].cost, drink[i].size, drink[i].quantity);
		}
	}
	
	//자판기프로그램 화면출력
	static int main_print() {
		System.out.println("[ 자판기 프로그램 ]");
		System.out.println("1.펩시콜라 2.미란다   3.오란씨    4.데자와    5.솔의눈 ");
		System.out.println("6.제품등록 7.제품출력 8.현금투입   9.관리자메뉴 0.종료 ");
		System.out.println("------------------------------------------------------");
		System.out.println("구매하고 싶은 음료를 선택하세요.>>");
		int choice = scan.nextInt();
		return choice;
	}
	
	//제품입력 메소드
	static void pro_input(Drink[] drink) { //객체배열
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
		}//for
	}//pro_input
	
	
	
	
	
	
	
	

}//class
