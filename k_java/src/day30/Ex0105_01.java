package day30;

public class Ex0105_01 {

	public static void main(String[] args) {
		String str1 = new String("ȫ�浿");
		String str2 = new String("�̼���");
		String str3 = new String("ȫ�浿");
		
		if(str1==str3) { //�������� �ּҸ� ���� ���ؼ� �ٸ�.
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
		
		if(str1.equals(str3)) { //���������� ����Ű�� �ּ��� ���� ���� ���ؼ� �ٸ�.
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		

	}

}
