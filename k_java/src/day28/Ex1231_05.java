package day28;

import java.util.Scanner;

public class Ex1231_05 {

	public static void main(String[] args) {
		// --------------------------------------------
		// ���ǹ�ȣ�� �Է¹޾�
		// ���ǹ�ȣ �������� 1��,2��,3��...9�� -> 9��
		// 0000000 - 9999999 ������ ���� �ߺ� ���� ( 8877878 )
		// ��÷��ȣ : 8�� 8827878
		//                   8 1�� 1000��
		//                  78 2�� 10000��
		//                 878 3�� 100000��
		//                7878 4�� 1000000��
		//               27878 5�� 10000000��
		//              827878 6�� 100000000��
		//             8827878 7�� 1000000000��
		//            88827878 8�� 10000000000��
		// �Է¹�ȣ : 1�� 
		//          1524771
		// ---------------------
		// ��÷��ȣ : 0 0
		// ��÷�� ��ȣ���� : 2��
		// ��÷��ȣ : 88827878
		// �Է¹�ȣ : 99927878
		Scanner scan = new Scanner(System.in);
		String lucky1 = ""+ ((int)(Math.random()*9)+1); //1~9
		// 0000000, 0100000
		String lucky2 = String.format("%07d", (int)(Math.random()*1000000)); 
		String lucky_num =  lucky1 + lucky2;
		System.out.println("��÷��ȣ : "+lucky_num);
		System.out.println("���� �Է��ϼ���.(1-9)>>");
		String input1 = scan.nextLine();
		System.out.println("��ȣ�� �Է��ϼ���.(��:1234567 7�ڸ�����)>>");
		String input2 = scan.nextLine(); 
		//01~9
		String input_num = input1 + input2;
		for(int i=0;i<lucky_num.length();i++) {
			if(lucky_num.substring(i).equals(input_num.substring(i))) {
				System.out.println("��÷�Ǿ����ϴ�.!");
				System.out.println(i+1+"�� ��÷��ȣ : "+ lucky_num.substring(i));
				break;
			}
			
		}
		
		    
		
		
		

	}

}
