package day14;

import java.util.Scanner;

public class Ex1210_06 {

	public static void main(String[] args) {
		// 메소드 생성 String id->지역변수
		// 메소드2 생성 -> password,name,address,phone,gender,hobby 참조변수로 입력
		Scanner scan = new Scanner(System.in);
		Member m = new Member(); //객체선언
		String id=""; //초기화
		System.out.println("[ 회원가입 ]");
		System.out.println("회원가입하려면 1.회원가입 0.종료>>");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			change2(m); //admin
			m.id = change(id); //member_admin
			System.out.println("회원 아이디 : "+m.id); //admin
			break;
		case 0:
			break;
		}//switch
	}
	//메소드1
	static String change(String id) {
		Scanner scan = new Scanner(System.in);
		System.out.println("id를 입력하세요.>>");
		id = scan.nextLine();
		return id;
	}
	//메소드2 
	static void change2(Member m) {
		Scanner scan = new Scanner(System.in);
		System.out.println("change2메소드 id : "+m.id);
		System.out.println("id를 입력하세요.>>");
		m.id = scan.nextLine();
		
	}
	

}
