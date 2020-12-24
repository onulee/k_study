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
	ArrayList list = new ArrayList(); //배열객체-10개 11개 20개
	// list.add(객체);
	// list.get(4);
	
	Buyer() { } //기본생성자
	Buyer(String id,String pw,String name,String nickname,int money) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nickname = nickname;
		this.money = money;
	}
	
	void charge() {
		System.out.println("금액을 충전하시겠습니까?(1.yes,2.no)");
		int choice = scan.nextInt();
		if(choice==1) {
			System.out.println("얼마를 충전하시겠습니까? 금액을 입력하세요.>>");
			int coin = scan.nextInt();
			// 카드결제시스템 전송 pg사 www.lg.co.kr?num=100102345/id=korea/name="홍길동"/money=5000
			// 완료후 => result=fail/id=korea/money=5000
			System.out.println("카드 결제 승인중"); 
			money = money + coin;
			
		}
	}
	
	
	void buy(Product p) {
		if(p.price>money) { // 구매금액 150 > 잔액 50
			System.out.println("잔고가 부족합니다. 충전하세요.!");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
//		cart[p_count++] = p;
		System.out.printf("%s 를(을) 구매, 구매금액 :%d \n",p.name,p.price);
		list.add(p);  //Object o
	}
	
	void summary() {
		int total_price=0;
		for(int i=0;i<list.size();i++) {  //Cart[i] -> list
			Product p2 = (Product) list.get(i);
			System.out.println("구매물품 : "+p2.name+", 구매금액 : "+ p2.price);
			//구매가격, b1.cart[i].price
			total_price = total_price + p2.price;
		}
		System.out.println("총 구매금액 : "+ total_price);
	}

}
