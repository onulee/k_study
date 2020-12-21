package card;

import java.util.Scanner;

public class Ex1221_02 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Deck d = new Deck();

		loop1:while (true) {
			System.out.println("[ ī�� ���� ]");
			System.out.println("1.ī�弯��");
			System.out.println("2.ī�������");
			System.out.println("3.ī��6�����");
			System.out.println("4.ī��1�����");
			System.out.println("0.����");
			System.out.println("---------------------");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
			int choice = scan.nextInt();

			switch (choice) {

			case 1:
				d.shuffle();
				break;
			case 2:
				Card[] c = d.allPick();
				System.out.println("[ ī��52�������� ]");
				for(int i=0;i<d.CARD_NUM;i++) {
					System.out.println(c[i]); //0-51 
				}
				break;
			case 3:
				System.out.println("[ ī��6����� ]");
				for(int i=0;i<6;i++) {
					System.out.println(d.pick(i)); //0,1,2,3,4,5
				}

				break;
			case 4:
				System.out.println("[ ī��1����� ]");
				System.out.println(d.pick(0)); //0
				break;
			case 0:
				System.out.println("[ ���α׷����� ]");
				break loop1;
			}//switch

		}//while

	}//main

}//class
