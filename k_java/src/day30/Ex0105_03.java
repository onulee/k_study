package day30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex0105_03 {

	public static void main(String[] args) {
		// Map ����X, KEY X, value O
		
		Scanner scan = new Scanner(System.in);
		HashMap map = new HashMap();
		Student s1 = new Student("S001","ȫ�浿");
		map.put("kor_pro", "1234");
		map.put("admin", "a123");
		map.put("user", "u123");
		map.put("aaa", "12345");
		map.put("admin", "aaaa");
		map.put("1", s1);
		System.out.println("ID�� �Է��ϼ���.>>");
		String id = scan.nextLine().trim();
		System.out.println("password�� �Է��ϼ���.(0.����)>>");
		String pw = scan.nextLine().trim();
		map.put(id, pw);
		
//		while(true) {
//			System.out.println("ID�� �Է��ϼ���.>>");
//			String id = scan.nextLine().trim();
//			System.out.println("password�� �Է��ϼ���.(0.����)>>");
//			String pw = scan.nextLine().trim();
//			
//			if(pw.equals("0")) {
//				System.out.println("���α׷��� �����մϴ�.!");
//				break;
//			}
//			
//			if(map.containsKey(id)) {
//				if(map.get(id).equals(pw)){
//					System.out.println("�α����� �Ǿ����ϴ�.!");
//					break;
//				}else {
//					System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���!");
//				}
//			}else {
//				System.out.println("���̵� ��ġ���� �ʽ��ϴ�.! �ٽ� �Է����ּ���.!");
//			}
//		}
		
		
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
