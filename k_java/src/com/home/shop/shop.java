package com.home.shop;
import java.util.ArrayList;
import java.util.Scanner;
public class shop {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Excute e = new Excute();
		Buyer login_user=null; //현재 로그인한 user
		// 무한 반복
		loop1:while (true) {
			System.out.println("[ 온라인쇼핑몰 ]");
			System.out.println("1.회원 로그인");
			System.out.println("2.TV구매");
			System.out.println("3.COMPUTER구매");
			System.out.println("4.AUDIO구매");
			System.out.println("5.구매물품 보기");
			System.out.println("6.금액충전");
			System.out.println("7.회원등록"); // 이름,금액 입력받아서 객체
			System.out.println("8.전체 회원정보"); // 이름,금액 입력받아서 객체
			System.out.println("9.로그아웃"); // 
			System.out.println("0.종료");
			System.out.println("----------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();

			switch (choice) {

			case 1:
				login_user = e.login();
				if(login_user!=null) {
					System.out.printf("%s(%s)님 로그인 하셨습니다. \n",login_user.id,login_user.name);
				}
				
				break;
			case 2:
				if(login_user!=null) { //null이 아닐때
					login_user.buy(new Tv());
				}else {
					System.out.println("로그인을 하셔야 구매가능합니다!");
				}
				break;
			case 3:
				if(login_user!=null) { //null이 아닐때
					login_user.buy(new Computer());
				}else {
					System.out.println("로그인을 하셔야 구매가능합니다!");
				}
				break;
			case 4:
				if(login_user!=null) { //null이 아닐때
					login_user.buy(new Audio());
				}else {
					System.out.println("로그인을 하셔야 구매가능합니다!");
				}
				break;
			case 5: // 구매물품 보기
				if(login_user!=null) { //null이 아닐때
					login_user.summary();
				}else {
					System.out.println("로그인을 하셔야 구매가능합니다!");
				}
				break;
			case 6: // 금액충전
				if(login_user!=null) { //null이 아닐때
					login_user.charge();
				}else {
					System.out.println("로그인을 하셔야 구매가능합니다!");
				}
				break;
			case 7:	// 회원등록
				e.signUp();
				break;
			case 8:	// 전체 회원정보
				e.memberList();
				break;
			case 9:	// 로그아웃
				System.out.printf("%s(%s)님 로그아웃 되었습니다. \n",login_user.id,login_user.name);
				login_user=null;
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.!");
				break loop1;
			}

		}

	}

}
