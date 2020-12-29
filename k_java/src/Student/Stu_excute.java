package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_excute {
	static Scanner scan = new Scanner(System.in);

	// �л��������α׷� - ���ȭ�� �޼ҵ�
	int first_print() {
		System.out.println("[ �л��������α׷� ]");
		System.out.println("1. �л������Է�");
		System.out.println("2. �л��������");
		System.out.println("3. �л��˻�");
		System.out.println("4. �л������Է�");
		System.out.println("5. �л��������");
		System.out.println("6. ���ó��");
		System.out.println("7. �л���������");
		System.out.println("0. ����");
		System.out.println("---------------------");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
		int choice = scan.nextInt(); // switch���� ����
		scan.nextLine();
		return choice;
	}

	// �л������Է� �޼ҵ� - �л�������ü�迭, �л��� -> return �л���
	ArrayList sinfo_input(ArrayList stu_list) {
		// �л����� ���ѹݺ�
		while (true) {
			System.out.println("[ �л������Է� ]");
			// �̸��� �Է��ϼ���.>>
			System.out.println((stu_list.size()+1) + "��° �̸��� �Է��ϼ���.(0.����ȭ�� �̵�)>>");
			String name = scan.nextLine();
			if (name.equals("0")) {
				System.out.println("������ ����ȭ������ �̵�!");
				break;
			}
			System.out.println("��ȭ��ȣ�� �Է��ϼ���.>>");
			String tel = scan.nextLine();
			System.out.println("�г��� �Է��ϼ���.>>");
			int grade = scan.nextInt();
			scan.nextLine();
			System.out.println("�а��� �Է��ϼ���.>>");
			String major = scan.nextLine();
			System.out.println("�ּҸ� �Է��ϼ���.>>");
			String address = scan.nextLine();
			System.out.println("���������� �Է��ϼ���.>>");
			String professor = scan.nextLine();
			Student s = new Student(name, tel, grade, major, address, professor); 
			stu_list.add(s);
			System.out.println("[ �л����� ]");
			System.out.println("------------------------");
			System.out.println("�й� : " + s.num);
			System.out.println("�̸� : " + s.name);
			System.out.println("��ȭ��ȣ : " + s.tel);
			System.out.println("�г� : " + s.grade);
			System.out.println("�а� : " + s.major);
			System.out.println("�ּ� : " + s.address);
			System.out.println("�������� : " + s.professor);
			System.out.println("------------------------");
		} // while
		return stu_list;
	}// sinfo_input

	// �л���ü������� �޼ҵ� - �л�������ü�迭 
	void sinfo_allOutput(ArrayList stu_list) {
		System.out.println("[ �л�������� ]");
		// ���Ÿ��Ʋ �޼ҵ� - �й�,�̸�,��ȭ��ȣ,�г�,�а�,�ּ�,��������
		String[] title = { "�й�", "�̸�", "��ȭ��ȣ", "�г�", "�а�", "�ּ�", "��������" };
		for (int i = 0; i < title.length; i++) {
			System.out.printf("%s \t", title[i]);
		}
		System.out.println();
		// �л��������
		for (int i = 0; i < stu_list.size(); i++) {
			Student s = (Student) stu_list.get(i); //Object->Student
			System.out.printf("%s\t%s\t%s\t%d\t%s\t%s\t%s\t \n", s.num, s.name, s.tel,
					s.grade, s.major, s.address, s.professor);
		} // for
	}// sinfo_output

	// �л�1��������� �޼ҵ� - �л�������ü,1��
	void sinfo_oneOutput(Student s) {
		// �л��������
		System.out.printf("%s\t%s\t%s\t%d\t%s\t%s\t%s\t \n", s.num, s.name, s.tel, s.grade, s.major, s.address,
				s.professor);

	}// sinfo_output

	// �л��˻� �޼ҵ� - �л�����,�л����� ���
	void sinfo_search(ArrayList stu_list) {
		while(true) {
			System.out.println("[ �л��˻� ]");
			System.out.println("��ȣ �Ǵ� �̸��� �Է��ϼ���.(0.����ȭ�� �̵�)>>");
			String search = scan.nextLine();
			if(search.equals("0")) {
				System.out.println("������ ����ȭ������ �̵�!");
				break;
			}
			int check=0; //�˻��� ���� ���
			for(int i=0;i<stu_list.size();i++) {
				Student s = (Student)stu_list.get(i);
				if(s.num.contains(search) || s.name.contains(search)) {
					//�л��������
					sinfo_oneOutput(s);
					// �л������� ����ϴ� �޼ҵ� �߰��ؾ� ��.
					check=1;
				}
			}
			if(check==0) {
				System.out.println("ã�µ����Ͱ� �����ϴ�. �ٽ� �Է��ϼ���.!");
			}
		}//while
	}//sinfo_search
	
	
	
	
	
	

}// class
