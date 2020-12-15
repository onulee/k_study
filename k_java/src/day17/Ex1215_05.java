package day17;

import java.util.Scanner;

public class Ex1215_05 {

	public static void main(String[] args) {
		// [ 음료생산 프로그램 ] - 음료20개 생산
		// s001 1.펩시콜라-p001 2.미란다-m001 3.오란씨-o001 4.데자와-d001
		// 펩시콜라
		int s_count=0;
		int p_count=0;
		Scanner scan = new Scanner(System.in);
		Drink[] d = new Drink[100]; // d[0] d[1] d[2]....d[19]
		
		//입력
		for(int i=0;i<10;i++) {
			System.out.println("[ 생산음료 프로그램 ]");
			System.out.println("1.펩시콜라 2.미란다 3.오란씨 4.데자와");
			System.out.println("-----------------------------");
			System.out.println((i+1)+"번째 생산음료 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			String drink_name="";
			switch(choice) {
			case 1:
				drink_name = "펩시콜라"; //펩시콜라
				break;
			case 2:
				
				break;
			}
			d[i] = new Drink(drink_name);
		}
		
		
		//출력
		for(int i=0;i<10;i++) {
			System.out.print(d[i].serialNo+"\t");
			System.out.print(d[i].p_num+"\t");
			System.out.print(d[i].drink_name+"\t");
			System.out.print(d[i].sale_price+"\t");
			System.out.print(d[i].cost+"\t");
			System.out.println();
		}
		
		

		// 1.펩시콜라 2.미란다 3.오란씨 4.데자와 5.솔의눈
		// 펩시 5개생산, 미란다 1개, 오란씨 7개, 데자와 5개,솔의눈 -2개
		// 1 펩시콜라 1000 300
		// 2 미란다 800 200
		// 3 오란씨 900 250
		// 4 데자와 1000 300

		// 모두 생산하고 출력하시오.

		// 최종 총 판매금액 출력하시오.

	}

}
