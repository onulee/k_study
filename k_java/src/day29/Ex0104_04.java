package day29;

import java.util.ArrayList;

public class Ex0104_04 {

	public static void main(String[] args) {
		String[] num = {"111","222","333","444","555","666","777","888","999"};
		num[1]="";
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		ArrayList list = new ArrayList();
		list.add("111"); //0
		list.add("222"); //1
		list.add("333"); //2
		list.add("444");
		list.add("555");
		list.add("666");
		list.add("777");
		list.add("888");
		list.add("999"); //8
		System.out.println(list);
		System.out.println("-------------------------");
		
		// ���������� ���� - ��� ������ �ȵ�.
//		for(int i=0;i<list.size();i++) {
//			list.remove(i);
//		}
		// �������� ������ �ؾ� ��� ���� ����
		for(int i=list.size()-1;i>=0;i--) {
			list.remove(i);
		}
		
		System.out.println(list);

	}

}
