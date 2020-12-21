package card;

import java.util.Scanner;

public class Ex1221_02 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Deck d = new Deck();

		loop1:while (true) {
			System.out.println("[ 카드 게임 ]");
			System.out.println("1.카드섞기");
			System.out.println("2.카드모두출력");
			System.out.println("3.카드6개출력");
			System.out.println("4.카드1개출력");
			System.out.println("0.종료");
			System.out.println("---------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();

			switch (choice) {

			case 1:
				d.shuffle();
				break;
			case 2:
				Card[] c = d.allPick();
				System.out.println("[ 카드52개모두출력 ]");
				for(int i=0;i<d.CARD_NUM;i++) {
					System.out.println(c[i]); //0-51 
				}
				break;
			case 3:
				System.out.println("[ 카드6개출력 ]");
				for(int i=0;i<6;i++) {
					System.out.println(d.pick(i)); //0,1,2,3,4,5
				}

				break;
			case 4:
				System.out.println("[ 카드1개출력 ]");
				System.out.println(d.pick(0)); //0
				break;
			case 0:
				System.out.println("[ 프로그램종료 ]");
				break loop1;
			}//switch

		}//while

	}//main

}//class
