package kor_school;

import java.util.ArrayList;
import java.util.Scanner;

public class Score_excute {
	static Scanner scan = new Scanner(System.in);
	static String[] score_title = { "�й�", "�̸�", "����", "����", "����", "�հ�", "���", "���" };
	Excute e = new Excute();

	// �л����� �Է¸޼ҵ� (score_list)
	void input_score(ArrayList score_list, ArrayList stu_list) {

		// �л����� �й�,����,����,����,�հ�,���,���
		// ���ѹݺ�
		while (true) {
			System.out.println("[ �л����� �Է� ]");
			e.search_student(stu_list); // �л������˻�
			// S001
			System.out.println("** �л������� ���ݺ��� �Է��մϴ�. **");
			System.out.println("�й��� �Է��ϼ���.(0.����ȭ���̵�)>>");
			String stu_num = scan.nextLine().toUpperCase(); // s001
			if (stu_num.equals("0")) {
				System.out.println("����ȭ������ �̵� ������");
				break;
			}
			String name = search_name(stu_num, stu_list); // �̸��˻�
			System.out.println("���������� �Է��ϼ���.>>");
			int kor = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.>>");
			int eng = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.>>>>");
			int math = scan.nextInt();
			scan.nextLine(); // nextInt() EnterŰ ����

			Stu_score s = new Stu_score(stu_num, kor, eng, math);
			score_list.add(s); // ArrayList 1�� ����
			System.out.println("[ �л��Է� ���� ]");
			System.out.println("1.�й� : " + s.stu_num);
			System.out.println("2.�̸� : " + name);
			System.out.println("3.�������� : " + s.kor);
			System.out.println("4.�������� : " + s.eng);
			System.out.println("5.�������� : " + s.math);
			System.out.println("6.�հ� : " + s.total);
			System.out.printf("7.��� : %.2f \n", s.avg);
		} // while
	} // input_score()

	// �̸��˻�
	String search_name(String stu_num, ArrayList stu_list) {
		String match_name = "";
		for (int i = 0; i < stu_list.size(); i++) {
			Student s = (Student) stu_list.get(i);
			if (stu_num.equals(s.stu_num)) {
				match_name = s.name;
				break;
			}
		}
		return match_name;
	}

	// ��� ���
	void outputAll_score(ArrayList score_list, ArrayList stu_list) {
		System.out.println("[ �л����� ��� ]");
		for (int i = 0; i < score_title.length; i++) {
			System.out.printf("%-4s \t", score_title[i]);
		}
		System.out.println();
		// stu_list ��ü���
		for (int i = 0; i < score_list.size(); i++) {
			Stu_score s = (Stu_score) score_list.get(i);
			System.out.printf("%-4s \t", s.stu_num);
			String name = search_name(s.stu_num, stu_list); // �̸��˻�
			System.out.printf("%-4s \t", name);
			System.out.printf("%-4d \t", s.kor);
			System.out.printf("%-4d \t", s.eng);
			System.out.printf("%-4d \t", s.math);
			System.out.printf("%-4d \t", s.total);
			System.out.printf("%-6.2f \t", s.avg);
			System.out.printf("%-4d \t", s.rank);
			System.out.println();
		}
	}// outputAll_score

	// ���ó��
	void rank_process(ArrayList score_list, ArrayList stu_list) {
		System.out.println("[ �л����� ���ó�� ]");
		for (int i = 0; i < score_list.size(); i++) {
			Stu_score s1 = (Stu_score) score_list.get(i);
			int rank_count = 1;
			for (int j = 0; j < score_list.size(); j++) {
				Stu_score s2 = (Stu_score) score_list.get(j);
				if (s1.total < s2.total) { // 299 < 300
					rank_count++;
				}
			}
			s1.rank = rank_count; // ����Է�
		}
		System.out.println("���ó���� �Ϸ�Ǿ����ϴ�.!");
		outputAll_score(score_list, stu_list);

	}

	//�л����� ���� �޼ҵ�
	void delete_score(ArrayList score_list, ArrayList stu_list) {
		while (true) {
			System.out.println("[ �л����� ���� ]");
			e.search_student(stu_list); // excute �л��˻��޼ҵ�
			System.out.println("�����ϰ��� �ϴ� �й��� �Է��ϼ���.(0.����ȭ���̵�)>>");
			String stu_num = scan.nextLine().toUpperCase(); // s001
			if (stu_num.equals("0")) {
				System.out.println("����ȭ������ �̵� ������");
				break;
			}
			int stu_count = 0; // �����Ϸ��� �ϴ� �л� �̹߽߰�
			for (int i = 0; i < score_list.size(); i++) {
				Stu_score s = (Stu_score) score_list.get(i);
				if (s.stu_num.equals(stu_num)) {
					stu_count++;
					System.out.println("�����Ϸ��� �л��� ã�ҽ��ϴ�. ���� �����Ͻðڽ��ϱ�?(1.Yes 2.No)");
					int check = scan.nextInt();
					if (check == 1) {
						score_list.remove(i);
						System.out.println("�й� : " + stu_num + " �л� �����Ͱ� ���� �Ǿ����ϴ�.!");
						break;
					} else {
						System.out.println("������ ��ҵǾ����ϴ�.!");
					}
				}
			} // for

			if (stu_count == 0) {
				System.out.println("�л��� ã�� ���߽��ϴ�. �ٽ� �Է��ϼ���!");
			}
		} // while
	}// delete_score
	
	void modify_score(ArrayList score_list,ArrayList stu_list) {
		System.out.println("[ �л����� ���� ]");
		e.search_student(stu_list); // excute �л��˻��޼ҵ�
		System.out.println("�����ϰ��� �ϴ� �й��� �Է��ϼ���.(0.����ȭ���̵�)>>");
		String stu_num = scan.nextLine().toUpperCase(); // s001
		if (stu_num.equals("0")) {
			System.out.println("����ȭ������ �̵� ������");
			// break;
		}
		int stu_count = 0; // �����Ϸ��� �ϴ� �л� �̹߽߰�
		for (int i = 0; i < score_list.size(); i++) {
			Stu_score s = (Stu_score) score_list.get(i);
			if (s.stu_num.equals(stu_num)) {
				stu_count++;
				System.out.println("�����Ϸ��� �л��� ã�ҽ��ϴ�. �����Ͻðڽ��ϱ�?(1.Yes 2.No)");
				int check = scan.nextInt();
				if (check == 1) {
					//����
					System.out.println("[ �������� ���� ]");
					System.out.println("1. ����");
					System.out.println("2. ����");
					System.out.println("3. ����");
					System.out.println("0. ����ȭ��");
					System.out.println("-----------------");
					System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
					int choice = scan.nextInt();
					switch(choice) {
					
					case 1:
						System.out.println("���� �������� : "+s.kor);
						System.out.println("�����Ϸ��� ���������� �Է��ϼ���.>>");
						s.kor = scan.nextInt();
						s.total = s.kor + s.eng + s.math;
						s.avg = s.total/3.0;
						System.out.println(s.kor+"������ �������� �����Ǿ����ϴ�.");
						break;
					case 2:
						System.out.println("���� �������� : "+s.eng);
						System.out.println("�����Ϸ��� ���������� �Է��ϼ���.>>");
						s.eng = scan.nextInt();
						s.total = s.kor + s.eng + s.math;
						s.avg = s.total/3.0;
						System.out.println(s.eng+"������ �������� �����Ǿ����ϴ�.");
						break;
					case 3:
						System.out.println("���� �������� : "+s.math);
						System.out.println("�����Ϸ��� ���������� �Է��ϼ���.>>");
						s.math = scan.nextInt();
						s.total = s.kor + s.eng + s.math;
						s.avg = s.total/3.0;
						System.out.println(s.math+"������ �������� �����Ǿ����ϴ�.");
						
						break;
					case 0:
						System.out.println("����ȭ������ �̵��մϴ�.!");
						break; 
					}//switch
					break;
				} else {
					System.out.println("������ ��ҵǾ����ϴ�.!");
				}//if
			}//if
		}//for
	} //modify_score

}// class
