package day23;

import java.util.Scanner;

public class Ex_shop {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Buyer b1 = new Buyer("ȫ�浿", 1000, 0); // ��1�� ����
		// ���ѹݺ�
		loop1: while (true) {
			System.out.println("[ �¶��μ��θ� ]");
			System.out.println("1.ȸ�����");
			System.out.println("2.TV����");
			System.out.println("3.COMPUTER����");
			System.out.println("4.AUDIO����");
			System.out.println("5.���Ź�ǰ ����");
			System.out.println("0.����");
			System.out.println("----------------------");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
			int choice = scan.nextInt();

			switch (choice) {

			case 1:
				// ���߿� �α���
				break;
			case 2:
				b1.buy(new Tv());
				System.out.println("TV �����Ͽ����ϴ�.");
				break;
			case 3:
				b1.buy(new Computer());
				System.out.println("Computer �����Ͽ����ϴ�.");
				break;

			case 4:
				b1.buy(new Audio());
				System.out.println("Audio �����Ͽ����ϴ�.");
				break;

			case 5:
				b1.cart_output();
				break;

			case 0:
				System.out.println("���α׷��� �����մϴ�.!");
				break loop1;
			}

		} // while
	}// main

}
