package day30;

import java.util.HashMap;
import java.util.Scanner;

public class Ex0105_04 {

	public static void main(String[] args) {
		// ���ѹݺ� �α����� ��������.(0.����)
		
		Scanner scan  = new Scanner(System.in);
		HashMap map = new HashMap();
		map.put("teacher1", "1234");
		map.put("user_id1", "123");
		map.put("zzz1", "12345");
		
		while(true) {
			System.out.println("ID�� �Է��ϼ���.(0.����)>>");
			String id = scan.nextLine();
			if(id.equals("0")) {
				break;
			}
			System.out.println("�н����带 �Է��ϼ���.(0.����)>>");
			String pw = scan.nextLine();
			if(pw.equals("0")) {
				break;
			}
			
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("�α��� ����!");
					break;
				}else {
					System.out.println("�н����� ����ġ!");
				}
			}else {
				System.out.println("���̵� �������� ����!");
			}
		}//while
	}

}
