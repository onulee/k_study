package day27;

public class Ex1230_03 {

	public static void main(String[] args) {
		int i=0;
		while(i<3) {
			System.out.println("1");
			System.out.println("2");
			try {
				System.out.println("3");
				System.out.println(10/0); //�����⸦ 0 10/0
				System.out.println("4");
			}catch(IndexOutOfBoundsException e1) {
				System.out.println("ù��° catch��");
			}catch (Exception e) {
				System.out.println("����° catch��");
				System.out.println("���� �������� �ʽ��ϴ�. �ٽ� �õ��� �ּ���.");
				e.printStackTrace();
			}
			System.out.println("6");
			System.out.println("7");
			i++;
		}
		
		
		

	}

}
