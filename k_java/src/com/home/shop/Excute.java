package com.home.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Excute {
	static Scanner scan = new Scanner(System.in);
	ArrayList userlist = new ArrayList(); //ȸ���迭��ü
	
	Buyer login() {
		Buyer login_user=null;
		System.out.println("ID/pass�� �Է��ϼ���.>>");
		String id = scan.nextLine();
		String pw = scan.nextLine();
		
		int check=0;
		for(int i=0;i<userlist.size();i++) { //5�� 1,2,3,4,(5��°)
			Buyer b = (Buyer) userlist.get(i);
			if(id.equals(b.id) && pw.equals(b.pw)) {
				System.out.println("[ �α��μ��� ]");
				login_user = b; //id�� pw��ġ�ϴ� Buyer -> login_user
				check=1;
			}
		}
		if(check==0) {
			System.out.println("ID �Ǵ� PW�� Ʋ���ϴ�. �ٽ� �Է��ϼ���!!");
		}
		
		return login_user;
	}
	
	void signUp() {
		System.out.println("ID�� �Է��ϼ���.>>");
		String id = scan.nextLine();
		System.out.println("PASSWORD�� �Է��ϼ���.>>");
		String pw = scan.nextLine();
		System.out.println("�̸��� �Է��ϼ���.>>");
		String name = scan.nextLine();
		System.out.println("�г����� �Է��ϼ���.>>");
		String nickname = scan.nextLine();
		System.out.println("�����ݾ��� �Է��ϼ���.(1.��������,2.��������)>>");
		int choice= scan.nextInt();
		scan.nextLine();
		int money=0;
		if(choice==1) {
			// �������� ���
			// �����ݾ��� �Ҵ��ؾ� ��.
			money=1000;
		}else {
			// skip
		}
		userlist.add(new Buyer(id, pw, name, nickname, money));
	}
	
	void memberList() {
		for(int i=0;i<userlist.size();i++) {
			Buyer b = (Buyer)userlist.get(i);
			System.out.println(b.id+","+b.name+","+b.money);
		}
	}

}
