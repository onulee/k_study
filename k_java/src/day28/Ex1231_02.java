package day28;

import java.util.ArrayList;

public class Ex1231_02 {

	public static void main(String[] args) {
		// Drink d1 ��ü -> ���ڿ�, 900, 90
		// Drink d2 ��ü -> ������, 800, 80
		// Drink d3 ��ü -> ���ڿ�, 900, 90
		ArrayList list = new ArrayList();
		list.add(new Drink("���ڿ�",900,90));
		list.add(new Drink("������",800,80));
		list.add(new Drink("���ڿ�",900,90));
		
		// toString��ü�� ����Ͽ� ����� �غ�����.
		// equals��ü�� ����Ͽ� �̸��� ������ true, �̸��� �ٸ��� false ����
        // d1�� d2 �̸����� ��, �� - �ٸ�, d1�� d3�� - �̸����� ��, ����		
		System.out.println((Drink)list.get(0)); //->toString()
		System.out.println((Drink)list.get(1));
		System.out.println((Drink)list.get(2));
		Drink d1 = (Drink)list.get(0);
		Drink d2 = (Drink)list.get(1);
		Drink d3 = (Drink)list.get(2);
		if(d1.equals(d3)) {
			System.out.println("�̸��� ����");
		}else {
			System.out.println("�̸��� �ٸ�");
		}
		
		
		
		
		
		
	}
}
