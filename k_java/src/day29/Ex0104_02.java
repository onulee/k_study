package day29;

import java.util.ArrayList;

public class Ex0104_02 {

	public static void main(String[] args) {
		// Drink ��ü - String code,String d_name
		// d001 ������, d002 ���ڿ� - �ڵ���ȣ�������� �����
		// main�޼ҵ�  
		// ArrayList -
		// "333",drink��ü,"222",111,drink��ü
		// ����Ͻÿ�.
		ArrayList list = new ArrayList(); // Object
		list.add("333");
		Drink d1 = new Drink("������",900);
		list.add(d1);
		list.add("222");
		list.add(111);
		Drink d2 = new Drink("���ڿ�",900);
		list.add(d2);
		Student s1 = new Student("s1","ȫ�浿");
		list.add(s1);
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i) instanceof String) {
				String s = (String)list.get(i);
				System.out.println(s);
			}else if(list.get(i) instanceof Integer) {
				int s = (Integer)list.get(i);
				System.out.println(s);
			}else if(list.get(i) instanceof Drink) {
				Drink s = (Drink)list.get(i);
				System.out.println(s);
			}else if(list.get(i) instanceof Student) {
				Student s = (Student)list.get(i);
				System.out.println(s);
			}
		}
		
		

	}

}
