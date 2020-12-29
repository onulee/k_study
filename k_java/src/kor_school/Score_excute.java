package kor_school;

import java.util.ArrayList;
import java.util.Scanner;

public class Score_excute {
	static Scanner scan = new Scanner(System.in);
	static String[] score_title = { "�й�", "�̸�", "����", "����", "����", "�հ�", "���", "���" };
	
	// �л����� �Է¸޼ҵ� (score_list)
	void input_score(ArrayList score_list,ArrayList stu_list) {
		Excute e = new Excute();
		
		// �л����� �й�,����,����,����,�հ�,���,���
		// ���ѹݺ�
		while (true) {
			e.search_student(stu_list); //�л������˻�
			//S001
			System.out.println("�й��� �Է��ϼ���.(0.����ȭ���̵�)>>");
			String stu_num = scan.nextLine().toUpperCase(); //s001
			if (stu_num.equals("0")) {
				System.out.println("����ȭ������ �̵� ������");
				break;
			}
			String name = search_name(stu_num,stu_list); //�̸��˻�
			System.out.println("���������� �Է��ϼ���.>>");
			int kor = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.>>");
			int eng = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.>>>>");
			int math = scan.nextInt();
			scan.nextLine(); // nextInt() EnterŰ ����
			
			Stu_score s = new Stu_score(stu_num,kor,eng,math);
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
	
	//�̸��˻�
	String search_name(String stu_num,ArrayList stu_list) {
		String match_name="";
		for(int i=0;i<stu_list.size();i++) {
			Student s = (Student) stu_list.get(i);
			if(stu_num.equals(s.stu_num)) {
				match_name = s.name;
				break;
			}
		}
		return match_name;
	}
	
	void outputAll_score(ArrayList score_list,ArrayList stu_list) {
		for(int i=0;i<score_title.length;i++) {
			System.out.printf("%-4s \t",score_title[i]);
		}
		System.out.println();
		//stu_list ��ü���
		for(int i=0;i<score_list.size();i++) {
			Stu_score s = (Stu_score) score_list.get(i);
			System.out.printf("%-4s \t",s.stu_num);
			String name = search_name(s.stu_num,stu_list);  //�̸��˻�
			System.out.printf("%-4s \t",name);
			System.out.printf("%-4d \t",s.kor);
			System.out.printf("%-4d \t",s.eng);
			System.out.printf("%-4d \t",s.math);
			System.out.printf("%-4d \t",s.total);
			System.out.printf("%-6.2f \t",s.avg);
			System.out.printf("%-4d \t",s.rank);
			System.out.println();
		}
	}//outputAll_score
	
	
	
	

}//class
