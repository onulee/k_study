package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList stu_list = new ArrayList();  //�л����� list
		ArrayList stu_score = new ArrayList(); //�л����� list
		Stu_excute ex = new Stu_excute();  // �޼ҵ� �и� ��ü����

		// ���ѹݺ�
		loop1: while (true) {
			int choice = ex.first_print(); // �л��������α׷� - ���ȭ��
			// ���ù�ȣ
			switch (choice) {
			case 1:
				// �л������Է� �޼ҵ� - �л�������ü�迭 -> return �л�������ü�迭
				stu_list = ex.sinfo_input(stu_list);
				break;
			case 2:
				// �л�������� �޼ҵ� - �л�������ü�迭
				ex.sinfo_allOutput(stu_list);
				break;
			case 3:
				// �л��˻� �޼ҵ� - �л�����,�л����� ���

				
				break;
			case 4:
				// �л������Է�

				break;
			case 5:
				// �л��������

				break;
			case 6:
				// ���ó��

				break;
			case 7:
				// �л���������-12�� 14�� (��������)

				break;
			case 0:
				System.out.println("���α׷� �����մϴ�.!");
				break loop1;
			default:

				break;

			}// switch
		} // while

	}

}
