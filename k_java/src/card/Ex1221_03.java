package card;

import java.util.Scanner;

public class Ex1221_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] ball = new int[45];  //����ϴ� �ζǹ�ȣ
		int[] ball2 = new int[45]; //�ζǹ�ȣ�� �������� üũ�ϴ� �迭
		
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1; //1-45
		}
		
		while(true) {
			System.out.println("1.������");
			System.out.println("2.1�� �̱�");
			System.out.println("3.3�� �̱�");
			System.out.println("4.6�� �̱�");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				int temp=0;
				int ran_num=0;
				for(int i=0;i<200;i++) {
					ran_num = (int)(Math.random()*45);
					temp = ball[0];
					ball[0]=ball[ran_num];
					ball[ran_num] = temp;
					
					//��
					temp = ball2[0];
					ball2[0]=ball2[ran_num];
					ball2[ran_num] = temp;
				}
				break;
			case 2:
				while(true) {
					System.out.println("������ ��ȣ�� �Է��ϼ���.(����ȭ���̵�: -1)(0-44)>>");
					int check = scan.nextInt();
					if(check==-1) {
						System.out.println("[ ����ȭ�� �̵� ]");
						break;
					}
					
					// �ζǹ�ȣ �������� üũ - ball2�迭
					if(ball2[check]==0) { //0�̸� �Ȼ��� ��
						System.out.println("��� �ζǹ�ȣ : "+ball[check]);
						ball2[check]=1;
					}else { // 1�̸� ���� ��
						System.out.println("������ �ζǹ�ȣ�� ����� �Ǿ����ϴ�. �ٽ� �Է��ϼ���.!");
					}
				}
				break;
			case 3:
				//6�� �̱�
				System.out.println("[ 6�� �̱� ]");
				int count=0;
				for(int i=0;i<6;i++) {
					// �ζǹ�ȣ �������� üũ - ball2�迭
					if(count<45) {
						if(ball2[count]==0) { //0�̸� �Ȼ��� ��
							System.out.println("��� �ζǹ�ȣ : "+ball[count]);
							ball2[count]=1;
						}else { // 1�̸� ���� ��
							i--;
						}
						count++;
					}else {
						System.out.println("���̻� ���� ��ȣ�� �����ϴ�.!");
						break;
					}
				}
				
				
				break;
				
			
			}
			
		}
		
		
		
		

	}

}
