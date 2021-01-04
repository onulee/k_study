package day29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ex0104_06 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Student s1 = new Student("S003","ȫ�浿",99);
		Student s2 = new Student("S001","�̼���",100);
		Student s3 = new Student("S005","������",90);
		Student s4 = new Student("S002","������",88);
		Student s5 = new Student("S004","�豸",85);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		for(Student s:list) {
			System.out.println(s);
		}
		// ������ �����ϴ� ���-int
		Collections.sort(list,new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				if(s1.kor<s2.kor) { // ���� ������ �� ũ�� �״��
					return -1;
				}else if(s1.kor>s2.kor) {  //���������� �� ũ�� ��ü
					return 1;
				}
				return 0; // ���� ������ �� ũ�� �״��
			}
		});
		
		//�й����� �����ϴ� ���-String
		Collections.sort(list,new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				//return s1.stu_id.compareTo(s2.stu_id); //��������
				return s2.stu_id.compareTo(s1.stu_id); //��������
				// s2�� ������ ������ ��ü(1), �׷��� ������ �״�ε�(0,-1)
			}
		});
		
		System.out.println("------------------------");
		for(Student s:list) {
			System.out.println(s);
		}
		
		
		
		
		

	}

}
