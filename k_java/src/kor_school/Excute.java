package kor_school;

import java.util.ArrayList;
import java.util.Scanner;

public class Excute {
	static Scanner scan = new Scanner(System.in);
	static String[] title = {"�й�","�̸�","��ȭ��ȣ","�г�","�а�","�ּ�","��米��"};
	
	int main_menu(){
		System.out.println("[ �л�����ó�����α׷� ]");
		System.out.println("1. �л������Է�");
		System.out.println("2. �л��������");
		System.out.println("3. �л��˻�");
		System.out.println("4. �л������Է�");
		System.out.println("5. �л��������");
		System.out.println("6. ���ó��");
		System.out.println("7. �л���������");
		System.out.println("8. �л���������");
		System.out.println("0. ����");
		System.out.println("-----------------------------");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.(0.����)>>");
		int choice = scan.nextInt();
		scan.nextLine(); //nextInt() EnterŰ ����
		return choice;
	} //main_menu()
	
	// �л����� �Է¸޼ҵ� (stu_list)
	void input_student(ArrayList stu_list) {
		//�л����� �й�,�̸�,��ȭ��ȣ,�г�,�а�,�ּ�,��������
		//���ѹݺ�
		while(true) {
			System.out.println("�л��̸��� �Է��ϼ���.(0.����ȭ���̵�)>>");
			String name = scan.nextLine();
			if(name.equals("0")) {
				System.out.println("����ȭ������ �̵� ������");
				break;
			}
			System.out.println("��ȭ��ȣ�� �Է��ϼ���.>>");
			String tel = scan.nextLine();
			System.out.println("�г��� �Է��ϼ���.>>");
			int grade = scan.nextInt();
			scan.nextLine(); //nextInt() EnterŰ ����
			System.out.println("�а��� �Է��ϼ���.>>");
			String major = scan.nextLine();
			System.out.println("�ּҸ� �Է��ϼ���.>>");
			String address = scan.nextLine();
			System.out.println("���������� �Է��ϼ���.>>");
			String professor = scan.nextLine();
			Student s = new Student(name,tel,grade,major,address,professor);
			stu_list.add(s); // ArrayList 1�� ����
			System.out.println("[ �л��Է� ���� ]");
			System.out.println("1.�й� : "+s.stu_num);
			System.out.println("2.�̸� : "+name);
			System.out.println("3.��ȭ��ȣ : "+tel);
			System.out.println("4.�г� : "+grade);
			System.out.println("5.�а� : "+major);
			System.out.println("6.�ּ� : "+address);
			System.out.println("7.��米�� : "+professor);
		}//while
	} //input_student()
	
	void outputAll_student(ArrayList stu_list) {
		for(int i=0;i<title.length;i++) {
			if(i==2) {
				System.out.printf("%-13s \t",title[i]);
			}else {
				System.out.printf("%-4s \t",title[i]);
			}
		}
		System.out.println();
		//stu_list ��ü���
		for(int i=0;i<stu_list.size();i++) {
			Student s = (Student) stu_list.get(i);
			System.out.printf("%-4s \t",s.stu_num);
			System.out.printf("%-4s \t",s.name);
			System.out.printf("%-13s \t",s.tel);
			System.out.printf("%-4d \t",s.grade);
			System.out.printf("%-4s \t",s.major);
			System.out.printf("%-4s \t",s.address);
			System.out.printf("%-4s \t",s.professor);
			System.out.println();
		}
	}//outputAll_student
	
	void outputOne_student(Student s) {
		for (int i = 0; i < title.length; i++) {
			if (i == 2) {
				System.out.printf("%-13s \t", title[i]);
			} else {
				System.out.printf("%-4s \t", title[i]);
			}
		}
		System.out.println();
		// stu_list 1�� ���
		System.out.printf("%-4s \t", s.stu_num);
		System.out.printf("%-4s \t", s.name);
		System.out.printf("%-13s \t", s.tel);
		System.out.printf("%-4d \t", s.grade);
		System.out.printf("%-4s \t", s.major);
		System.out.printf("%-4s \t", s.address);
		System.out.printf("%-4s \t", s.professor);
		System.out.println();
	}// outputOne_student
	
	//�л��˻�
	void search_student(ArrayList stu_list) {
		//���ѹݺ�
		while(true) {
			System.out.println("�л��̸� �Ǵ� �л���ȣ�� �Է��ϼ���.(0.����ȭ���̵�)>>");
			String search = scan.nextLine().trim().toUpperCase();
			if(search.equals("0")) {
				System.out.println("����ȭ������ �̵� ������");
				break;
			}
			System.out.println("[ �л����� �˻� ]");
			int check=0;
			for(int i=0;i<stu_list.size();i++) {
				Student s = (Student) stu_list.get(i);
				if(s.stu_num.contains(search) || s.name.contains(search)) {
					outputOne_student(s); //1�����
					check++;
				}
			}
			if(check==0) {
				System.out.println("�л������� ã�� ���߽��ϴ�. �ٽ� �Է��ϼ���.!");
			}
		}//while
	} //search_student

}
