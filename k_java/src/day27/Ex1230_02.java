package day27;

import java.util.Scanner;

public class Ex1230_02 {

	public static void main(String[] args) {
		//int 5��¥�� �迭�� ����� ������.
		// 1.�迭�� ���� �ֱ�
		// �迭�� ���ڸ� �ֽ��ϴ�.
		// �ְ� ���� ���ڸ� �Է��ϼ���.>>
		// ��) 5 �� �Է��ϸ� ���������� int�迭�� ������ ��.
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int i=0;
		while(true) {
			System.out.println("���ϴ� ���ڸ� �Է��ϼ���.>>");
			num[i] = scan.nextInt();
			System.out.println("���ڰ� �ԷµǾ����ϴ�.!");
			for(int j=0;j<num.length;j++) {
				System.out.println(j+1+"��° �迭 : "+num[j] );
			}
			i++;
		}
		

	}

}
