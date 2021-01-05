package day30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex0105_03 {

	public static void main(String[] args) {
		// Map 순서X, KEY X, value O
		
		Scanner scan = new Scanner(System.in);
		HashMap map = new HashMap();
		Student s1 = new Student("S001","홍길동");
		map.put("kor_pro", "1234");
		map.put("admin", "a123");
		map.put("user", "u123");
		map.put("aaa", "12345");
		map.put("admin", "aaaa");
		map.put("1", s1);
		System.out.println("ID를 입력하세요.>>");
		String id = scan.nextLine().trim();
		System.out.println("password를 입력하세요.(0.종료)>>");
		String pw = scan.nextLine().trim();
		map.put(id, pw);
		
//		while(true) {
//			System.out.println("ID를 입력하세요.>>");
//			String id = scan.nextLine().trim();
//			System.out.println("password를 입력하세요.(0.종료)>>");
//			String pw = scan.nextLine().trim();
//			
//			if(pw.equals("0")) {
//				System.out.println("프로그램을 종료합니다.!");
//				break;
//			}
//			
//			if(map.containsKey(id)) {
//				if(map.get(id).equals(pw)){
//					System.out.println("로그인이 되었습니다.!");
//					break;
//				}else {
//					System.out.println("패스워드가 일치하지 않습니다. 다시 입력해주세요!");
//				}
//			}else {
//				System.out.println("아이디가 일치하지 않습니다.! 다시 입력해주세요.!");
//			}
//		}
		
		
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
