package day29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ex0104_07 {

	public static void main(String[] args) {
		// Drink - code-�ڵ�����,d_name,price
		// coke - 1100;
		// Tejava - 900;
		// Pepsi - 1000;
		// Miranda - 800;
		// Oranc - 900;
		ArrayList<Drink> list = new ArrayList<Drink>();
		Scanner scan = new Scanner(System.in);
		
//		while(true) {
//			System.out.println("�̸��� �Է��ϼ���.(0.����ȭ��)>>");
//			String d_name = scan.nextLine();
//			if(d_name.equals("0")) {
//				break;
//			}
//			System.out.println("������ �Է��ϼ���.>>");
//			int price = scan.nextInt();
//			scan.nextLine();
//			list.add(new Drink(d_name,price));
			
//		}
		list.add(new Drink("��ī�ݶ�",1100));
		list.add(new Drink("���ڿ�",900));
		list.add(new Drink("���",1000));
		list.add(new Drink("�̶���",800));
		list.add(new Drink("������",900));
		//String ����
//		Collections.sort(list,new Comparator<Drink>() {
//			@Override
//			public int compare(Drink d1, Drink d2) {
//				return ((d2.code).compareTo(d1.code)); //1�϶��� list
//				// d002 > d001 1
//				// d001 == d001 0
//				// d001 > d002 -1
//			}
//		}); 
		
		Collections.sort(list,new Comparator<Drink>() {
			@Override
			public int compare(Drink d1, Drink d2) {
				if(d1.price>d2.price) {
					return 1;
				}else if(d1.price<d2.price) {
					return -1;
				}
				return 0;
				// return d1.price-d2.price;  //����,0,���
			}
		});
		
		for(Drink d:list) {
			System.out.println(d);
		}
		
		// 1. ĵ���� �Է� - �л������Է�ó�� ����� ��. 
		// 2. ĵ���� ���
		// 3. �ڵ�� �������� ���
		// 4. �ڵ�� �������� ���
		// 5. �̸����� �������� ���
		// 6. �̸����� �������� ���
		// 7. �������� �������� ���
		// 8. �������� �������� ���
		//--------------------------------
		// ���ϴ� ��ȣ�� �Է��ϼ���.>>
		
		
		
		
		

	}

}
