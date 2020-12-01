package day6;

import java.util.Scanner;

public class Ex1130_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char choice = ' ';

		loop1: while (true) {
			System.out.println("---------------------");
			System.out.println("   total ���α׷� ����");
			System.out.println("---------------------");
			System.out.println(" 1.����ó�� ��� Ȯ�� ���α׷�");
			System.out.println(" 2.������ ���α׷� ");
			System.out.println(" 3.���ڸ��߱� ���α׷�");
			System.out.println("---------------------");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.(����:x)>>");
			choice = scan.next().charAt(0);
			switch (choice) {
			case '1':
				while (true) {
					System.out.println("[ ����ó�� ��� Ȯ�� ]");
					System.out.println("������ �Է��ϼ���.(����ȭ��:-1)>>");
					int score = scan.nextInt();
					String grade = "";
					if (score >= 90) {
						grade = "A";
						if (score >= 98) {
							grade += "+"; // grade = grade+"+";
						} else if (score <= 93) {
							grade += "-";
						}
					} else if (score >= 80) {
						grade = "B";
						if (score >= 88) {
							grade += "+"; // grade = grade+"+";
						} else if (score <= 83) {
							grade += "-";
						}
					} else if (score >= 70) {
						grade = "C";
						if (score >= 78) {
							grade += "+"; // grade = grade+"+";
						} else if (score <= 73) {
							grade += "-";
						}
					} else if (score >= 60) {
						grade = "D";
						if (score >= 68) {
							grade += "+"; // grade = grade+"+";
						} else if (score <= 63) {
							grade += "-";
						}
					} else if (score >= 0) {
						grade = "F";
					} else { // 0<score
						System.out.println("����ȭ������ �̵�>>");
						break;
					}
					System.out.println("����� ���� : " + grade);
				} // while
				break;
			case '2':
				System.out.println("[ ������ ���α׷� ]");
				
				while(true) {
					System.out.println("������ ���� �Է��ϼ���.(����ȭ��:-1)>>");
					int input1 = scan.nextInt();
					if(input1==-1) {  //-1 �Է½� ����ȭ������ �̵�
						System.out.println("����ȭ������ �̵��մϴ�.!");
						break;
					}
					System.out.println("������ ���� �Է��ϼ���.>>");
					int input2 = scan.nextInt();
					
					int end = Math.max(input1, input2);  //�μ� �� ū��
					int start = Math.min(input1, input2); // �μ� �� ������
					
					for(int i=start;i<=end;i++) {
						for(int j=1;j<=9;j++) {
							System.out.println(i+" * "+j+" = "+i*j);
						}
						System.out.println();
					}
				}//while
				break;
			case '3':
				System.out.println("[ ���ڸ��߱� ���α׷� ]");
				System.out.println("* 1-100���� ���ڸ� ���ߴ� �����Դϴ�!");
			    
				num_loop1: while(true) { // ���ڸ��߱� ���α׷� ���ѹݺ�
			    	int r_num = (int)(Math.random()*100)+1; //��������
			    	
			    	while(true) { // �������α׷��� ���ѹݺ�
			    		System.out.println("���ϴ� ���ڸ� �Է��ϼ���.(����ȭ��:-1)>>");
			    		int input_num=scan.nextInt();
			    		if(input_num==-1) {
			    			System.out.println("����ȭ������ �̵��մϴ�!");
			    			break num_loop1;
			    		}
						if(r_num>input_num) {
							System.out.println("�� ū ���ڸ� �Է��ϼ���!");
						}else if(r_num<input_num) {
							System.out.println("�� ���� ���ڸ� �Է��ϼ���!");
						}else {
							System.out.println("�����Դϴ�.");
							break;
						}
					}//while
					System.out.println("���� ���� : "+r_num);
					
					
					
			    }//while:num_loop1
				break;
			case 'x':
			case 'X':
				System.out.println("���α׷��� �����մϴ�.");
				break loop1;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.>>");
				break;
			}

		}

	}

}