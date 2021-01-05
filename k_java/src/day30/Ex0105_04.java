package day30;

import java.util.HashMap;
import java.util.Scanner;

public class Ex0105_04 {

	public static void main(String[] args) {
		// 무한반복 로그인을 만들어보세요.(0.종료)
		
		Scanner scan  = new Scanner(System.in);
		HashMap map = new HashMap();
		map.put("teacher1", "1234");
		map.put("user_id1", "123");
		map.put("zzz1", "12345");
		
		while(true) {
			System.out.println("ID를 입력하세요.(0.종료)>>");
			String id = scan.nextLine();
			if(id.equals("0")) {
				break;
			}
			System.out.println("패스워드를 입력하세요.(0.종료)>>");
			String pw = scan.nextLine();
			if(pw.equals("0")) {
				break;
			}
			
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 성공!");
					break;
				}else {
					System.out.println("패스워드 불일치!");
				}
			}else {
				System.out.println("아이디 존재하지 않음!");
			}
		}//while
	}

}
