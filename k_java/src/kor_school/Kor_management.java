package kor_school;

import java.util.ArrayList;
import java.util.Scanner;

public class Kor_management {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// �л����� �й�,�̸�,��ȭ��ȣ,�г�,�а�,�ּ�,��������
		// �л����� �й�-,����,����,����,�հ�,���,���
		ArrayList<Student> stu_list = new ArrayList<Student>(); // Object-�ְ�����
		ArrayList<Stu_score> score_list = new ArrayList<Stu_score>();
		Excute ex = new Excute();
		Score_excute se = new Score_excute();

		//���ѹݺ�
		loop1:while(true) {
			int choice = ex.main_menu(); //main_menu ��¸޼ҵ�

			switch (choice) {
			case 1:
				//�л����� �Է¸޼ҵ� (stu_list)
				ex.input_student(stu_list); 
				break;
			case 2:
				//�л����� ��¸޼ҵ�(stu_list)
				ex.outputAll_student(stu_list); 
				break;
			case 3:
				//�л����� �˻��޼ҵ�
				ex.search_student(stu_list);
				break;
			case 4:
				//�л����� �Է¸޼ҵ�
				se.input_score(score_list, stu_list);
				break;
			case 5:
				//�л����� ��¸޼ҵ�
				se.outputAll_score(score_list,stu_list);
				break;
			case 6:
				//���ó�� �޼ҵ�
				se.rank_process(score_list,stu_list);
				break;
			case 7:
				//�л��������� �޼ҵ�
				se.modify_score(score_list,stu_list);
				break;
			case 8:
				//�л��������� �޼ҵ�
				se.delete_score(score_list,stu_list);

				break;
			
			case 0:

				break;

			}//switch
		}//while
	}//main

}//class
