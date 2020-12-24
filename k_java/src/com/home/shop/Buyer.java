package com.home.shop;

import java.util.ArrayList;
import java.util.Scanner;
public class Buyer {
	
	static Scanner scan = new Scanner(System.in);
	String id;
	String pw;
	String name;
	String nickname;
	int money;
	int bonusPoint;
//	Product[] cart = new Product[10]; //11
	ArrayList list = new ArrayList(); //�迭��ü-10�� 11�� 20��
	// list.add(��ü);
	// list.get(4);
	
	Buyer() { } //�⺻������
	Buyer(String id,String pw,String name,String nickname,int money) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nickname = nickname;
		this.money = money;
	}
	
	void charge() {
		System.out.println("�ݾ��� �����Ͻðڽ��ϱ�?(1.yes,2.no)");
		int choice = scan.nextInt();
		if(choice==1) {
			System.out.println("�󸶸� �����Ͻðڽ��ϱ�? �ݾ��� �Է��ϼ���.>>");
			int coin = scan.nextInt();
			// ī������ý��� ���� pg�� www.lg.co.kr?num=100102345/id=korea/name="ȫ�浿"/money=5000
			// �Ϸ��� => result=fail/id=korea/money=5000
			System.out.println("ī�� ���� ������"); 
			money = money + coin;
			
		}
	}
	
	
	void buy(Product p) {
		if(p.price>money) { // ���űݾ� 150 > �ܾ� 50
			System.out.println("�ܰ� �����մϴ�. �����ϼ���.!");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
//		cart[p_count++] = p;
		System.out.printf("%s ��(��) ����, ���űݾ� :%d \n",p.name,p.price);
		list.add(p);  //Object o
	}
	
	void summary() {
		int total_price=0;
		for(int i=0;i<list.size();i++) {  //Cart[i] -> list
			Product p2 = (Product) list.get(i);
			System.out.println("���Ź�ǰ : "+p2.name+", ���űݾ� : "+ p2.price);
			//���Ű���, b1.cart[i].price
			total_price = total_price + p2.price;
		}
		System.out.println("�� ���űݾ� : "+ total_price);
	}

}
