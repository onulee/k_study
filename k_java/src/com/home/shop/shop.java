package com.home.shop;
import java.util.ArrayList;
import java.util.Scanner;
public class shop {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Excute e = new Excute();
		Buyer login_user=null; //���� �α����� user
		// ���� �ݺ�
		loop1:while (true) {
			System.out.println("[ �¶��μ��θ� ]");
			System.out.println("1.ȸ�� �α���");
			System.out.println("2.TV����");
			System.out.println("3.COMPUTER����");
			System.out.println("4.AUDIO����");
			System.out.println("5.���Ź�ǰ ����");
			System.out.println("6.�ݾ�����");
			System.out.println("7.ȸ�����"); // �̸�,�ݾ� �Է¹޾Ƽ� ��ü
			System.out.println("8.��ü ȸ������"); // �̸�,�ݾ� �Է¹޾Ƽ� ��ü
			System.out.println("9.�α׾ƿ�"); // 
			System.out.println("0.����");
			System.out.println("----------------------");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
			int choice = scan.nextInt();

			switch (choice) {

			case 1:
				login_user = e.login();
				if(login_user!=null) {
					System.out.printf("%s(%s)�� �α��� �ϼ̽��ϴ�. \n",login_user.id,login_user.name);
				}
				
				break;
			case 2:
				if(login_user!=null) { //null�� �ƴҶ�
					login_user.buy(new Tv());
				}else {
					System.out.println("�α����� �ϼž� ���Ű����մϴ�!");
				}
				break;
			case 3:
				if(login_user!=null) { //null�� �ƴҶ�
					login_user.buy(new Computer());
				}else {
					System.out.println("�α����� �ϼž� ���Ű����մϴ�!");
				}
				break;
			case 4:
				if(login_user!=null) { //null�� �ƴҶ�
					login_user.buy(new Audio());
				}else {
					System.out.println("�α����� �ϼž� ���Ű����մϴ�!");
				}
				break;
			case 5: // ���Ź�ǰ ����
				if(login_user!=null) { //null�� �ƴҶ�
					login_user.summary();
				}else {
					System.out.println("�α����� �ϼž� ���Ű����մϴ�!");
				}
				break;
			case 6: // �ݾ�����
				if(login_user!=null) { //null�� �ƴҶ�
					login_user.charge();
				}else {
					System.out.println("�α����� �ϼž� ���Ű����մϴ�!");
				}
				break;
			case 7:	// ȸ�����
				e.signUp();
				break;
			case 8:	// ��ü ȸ������
				e.memberList();
				break;
			case 9:	// �α׾ƿ�
				System.out.printf("%s(%s)�� �α׾ƿ� �Ǿ����ϴ�. \n",login_user.id,login_user.name);
				login_user=null;
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.!");
				break loop1;
			}

		}

	}

}
