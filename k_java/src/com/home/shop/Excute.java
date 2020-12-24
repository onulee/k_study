package com.home.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Excute {
	static Scanner scan = new Scanner(System.in);
	ArrayList userlist = new ArrayList(); //회원배열객체
	
	Buyer login() {
		Buyer login_user=null;
		System.out.println("ID/pass를 입력하세요.>>");
		String id = scan.nextLine();
		String pw = scan.nextLine();
		
		int check=0;
		for(int i=0;i<userlist.size();i++) { //5명 1,2,3,4,(5번째)
			Buyer b = (Buyer) userlist.get(i);
			if(id.equals(b.id) && pw.equals(b.pw)) {
				System.out.println("[ 로그인성공 ]");
				login_user = b; //id와 pw일치하는 Buyer -> login_user
				check=1;
			}
		}
		if(check==0) {
			System.out.println("ID 또는 PW가 틀립니다. 다시 입력하세요!!");
		}
		
		return login_user;
	}
	
	void signUp() {
		System.out.println("ID를 입력하세요.>>");
		String id = scan.nextLine();
		System.out.println("PASSWORD를 입력하세요.>>");
		String pw = scan.nextLine();
		System.out.println("이름을 입력하세요.>>");
		String name = scan.nextLine();
		System.out.println("닉네임을 입력하세요.>>");
		String nickname = scan.nextLine();
		System.out.println("충전금액을 입력하세요.(1.지금충전,2.이후충전)>>");
		int choice= scan.nextInt();
		scan.nextLine();
		int money=0;
		if(choice==1) {
			// 결제진행 모드
			// 결제금액을 할당해야 함.
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
