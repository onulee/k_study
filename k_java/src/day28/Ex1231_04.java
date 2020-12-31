package day28;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex1231_04 {

	public static void main(String[] args) {
		// ���� : �� - charAt(7)    1,3-> ����  2,4 -> ����
		Scanner scan = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��ϼ���.(��:880101-1234567)>>");
		String input = scan.nextLine();
		String[] member_id = input.split("-");
		System.out.printf("�ֹι�ȣ ���ڸ� : %s \n",member_id[0]);
		System.out.printf("�ֹι�ȣ ���ڸ� : %s \n",member_id[1]);
		//��¥��ü����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		Date d = new Date();
		int old=0;
		if(input.charAt(7)=='1' || input.charAt(7)=='2') { // 7° �ڸ� : 1,2  3,4
			//���� ���� = 2020-1988+1
			old  = Integer.parseInt(sdf.format(d)) 
					-Integer.parseInt("19"+input.substring(0,2))+1;
		}else {
			//���� ���� = 2020-2009+1
			old  = Integer.parseInt(sdf.format(d)) 
					-Integer.parseInt("20"+input.substring(0,2))+1;
		}
		System.out.printf("����� ���� : %d \n",old);
		
		switch(input.charAt(7)) {
		case '1': case'3':
			System.out.println("���� : ����");
		    break;
		case '2': case '4':
			System.out.println("���� : ����");
			break;
		}
		
		
		// --------------------------------------------
		// ���ǹ�ȣ�� �Է¹޾� 
		// ���ǹ�ȣ ��������  1��,2��,3��...9�� -> 9�� 
		// 0000000 - 9999999 ������ ���� �ߺ� ���� ( 8877878 )
		// ��÷��ȣ : 8�� 8827878
		// �Է¹�ȣ : 1�� 1524771
		//---------------------
		// ��÷��ȣ :      0   0
		// ��÷�� ��ȣ���� : 2��
		

	}

}
