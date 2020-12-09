package day13;

import java.util.Scanner;

public class Ex1209_02 {

	public static void main(String[] args) {
		
		// Ex1208_08.java 객체선언해서 3명 회원을 입력받아 출력하시오.
		Scanner scan = new Scanner(System.in);
		Member[] m = new Member[3]; // 객체배열을 생성
		
		for(int i=0;i<m.length;i++) {  //3명의 학생성적을 받기위해
			// 이전 복사
			m[i] = new Member(); // 배열선언후 각각 객체선언을 해줌.
			
			System.out.println("ID를 입력하세요>>");
			m[i].id=scan.nextLine();
			System.out.println("패스워드를 입력하세요.(숫자만가능)>>");
			m[i].pw=scan.nextInt();
			scan.nextLine();// nextInt() enter키 값 삭제
			System.out.println("이름을 입력하세요.>>");
			m[i].name=scan.nextLine();
			System.out.println("연락처를 입력하세요.>>");
			m[i].phone=scan.nextLine();
			System.out.println("주소를 입력하세요.>>");
			m[i].address=scan.nextLine();
			System.out.println("성별을 입력하세요.(M:남자,F:여자)>>");
			m[i].gender=scan.nextLine();
			System.out.println("취미를 입력하세요.>>");
			m[i].hobby=scan.nextLine();
		}
		
		//화면출력 - 3명의 회원정보 출력
		for(int i=0;i<m.length;i++) {
			System.out.println("[ 회원정보 ]");
			System.out.printf("%s %d %s %s %s %s %s %n",m[i].id,m[i].pw,m[i].name,m[i].phone,m[i].address,m[i].gender,m[i].hobby);
		}
		

	}

}
