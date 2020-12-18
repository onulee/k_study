package Student;

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
	int sinfo_input(Stu_info[] stu_info, int stu_count) {
		// �л����� ���ѹݺ�
		while (true) {
			System.out.println("[ �л������Է� ]");
			// �̸��� �Է��ϼ���.>>
			System.out.println((stu_count + 1) + "��° �̸��� �Է��ϼ���.(0.����ȭ�� �̵�)>>");
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
			stu_info[stu_count] = new Stu_info(name, tel, grade, major, address, professor);
			System.out.println("[ �л����� ]");
			System.out.println("------------------------");
			System.out.println("�й� : " + stu_info[stu_count].num);
			System.out.println("�̸� : " + stu_info[stu_count].name);
			System.out.println("��ȭ��ȣ : " + stu_info[stu_count].tel);
			System.out.println("�г� : " + stu_info[stu_count].grade);
			System.out.println("�а� : " + stu_info[stu_count].major);
			System.out.println("�ּ� : " + stu_info[stu_count].address);
			System.out.println("�������� : " + stu_info[stu_count].professor);
			System.out.println("------------------------");
			stu_count++; // �л��� ����
		} // while
		return stu_count;
	}// sinfo_input

	// �л���ü������� �޼ҵ� - �л�������ü�迭, �л��� -> return �л���
	void sinfo_allOutput(Stu_info[] stu_info, int stu_count) {
		System.out.println("[ �л�������� ]");
		// ���Ÿ��Ʋ �޼ҵ� - �й�,�̸�,��ȭ��ȣ,�г�,�а�,�ּ�,��������
		String[] title = { "�й�", "�̸�", "��ȭ��ȣ", "�г�", "�а�", "�ּ�", "��������" };
		for (int i = 0; i < title.length; i++) {
			System.out.printf("%s\t", title[i]);
		}
		System.out.println();
		// �л��������
		for (int i = 0; i < stu_count; i++) {
			System.out.printf("%s\t%s\t%s\t%d\t%s\t%s\t%s\t \n", stu_info[i].num, stu_info[i].name, stu_info[i].tel,
					stu_info[i].grade, stu_info[i].major, stu_info[i].address, stu_info[i].professor);
		} // for
	}// sinfo_output

	// �л�1��������� �޼ҵ� - �л�������ü�迭, �л��� -> return �л���
	void sinfo_oneOutput(Stu_info[] stu_info, int one_count) {
		// �л��������
		for (int i = one_count; i < one_count + 1; i++) {
			System.out.printf("%s\t%s\t%s\t%d\t%s\t%s\t%s\t \n", stu_info[i].num, stu_info[i].name, stu_info[i].tel,
					stu_info[i].grade, stu_info[i].major, stu_info[i].address, stu_info[i].professor);
		} // for
	}// sinfo_output

	// �л��˻� �޼ҵ� - �л�����,�л����� ���
	void sinfo_search(Stu_info[] stu_info, int stu_count) {
		while(true) {
			System.out.println("[ �л��˻� ]");
			System.out.println("��ȣ �Ǵ� �̸��� �Է��ϼ���.(0.����ȭ�� �̵�)>>");
			String search = scan.nextLine();
			if(search.equals("0")) {
				System.out.println("������ ����ȭ������ �̵�!");
				break;
			}
			int check=0; //�˻��� ���� ���
			for(int i=0;i<stu_count;i++) {
				if(stu_info[i].num.contains(search) || stu_info[i].name.contains(search)) {
					//�л��������
					sinfo_oneOutput(stu_info,i);
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
