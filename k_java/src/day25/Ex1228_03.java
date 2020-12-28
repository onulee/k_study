package day25;

import java.util.ArrayList;

public class Ex1228_03 {

	public static void main(String[] args) {
		// �迭����
		ArrayList u_list = new ArrayList(); //Unit
		ArrayList group = new ArrayList();  // group�̵�
				
		unit_make(0,9,new Marine(),u_list);
		unit_make(0,5,new Tank(),u_list);
		unit_make(0,7,new Dropship(),u_list);
		
		
		// group�� �ֱ� - Marine 6��
		int count=0;
		for(int i=0;i<u_list.size();i++) { //Marine 6��
			if(count<6) {
				if((Unit)u_list.get(i) instanceof Marine) {
					group.add((Unit)u_list.get(i));
					System.out.println((Unit)u_list.get(i)+" : "+(i+1));
					count++;
				}
			}else {
				break; //7���̸� ����
			}
		}
		
		// group�� �ֱ� - Tank 4��
		count=0;
		for(int i=0;i<u_list.size();i++) { //Tank 4��
			if(count<4) {
				if((Unit)u_list.get(i) instanceof Tank) {
					group.add((Unit)u_list.get(i));
					System.out.println((Unit)u_list.get(i)+" : "+(i+1));
					count++;
				}
			}else {
				break; //7���̸� ����
			}
		}
		
		//group �̵�
		for(int i=0;i<group.size();i++) {
			Unit u = (Unit) group.get(i); //������ Marine,Tank->Unit
			u.move(100, 200);
		}
		
		
		// �迭 10,11�� -> arraylist ����Ұ�
		// ���ο� ��ü �������� ����, ���� ��ü�� �̵���ų��. new ��ü ����ϸ� �ȵ�.
		// Marine1 3��,Tank1 3�� -> x,y 300,500 �̵�
		// Marine1 6��,Dropship1 7��, Tank 2�� -> x,y 50,50 �̵�

	}//main
	
	static void unit_make(int start,int end,Unit u,ArrayList u_list) {
		for(int i=start;i<end;i++) {        
			u_list.add(u); //Unit ����
			System.out.println(u+" : "+(i+1));
		}
		
	}
	

}//class
