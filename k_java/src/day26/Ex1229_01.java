package day26;

public class Ex1229_01 {

	public static void main(String[] args) {
		Tank t1 = new Tank();
		Marine m1 = new Marine();
		Scv s1 = new Scv();
		
		//�̻��� 1�� ����.
		t1.hitpoint = t1.hitpoint - 10;
		//�̻��� 1�� ����.
		t1.hitpoint = t1.hitpoint - 10;
		//�̻��� 1�� ����.
		t1.hitpoint = t1.hitpoint - 10;
		//�̻��� 1�� ����.
		t1.hitpoint = t1.hitpoint - 10;
		System.out.println("���� ��ũ t1 ������ : "+t1.hitpoint);
		s1.repair(t1);  //���� ����
		System.out.println("��ũ t1 ������ : "+t1.hitpoint);
		m1.hitpoint=10;
		System.out.println("���� :"+m1.hitpoint);
		s1.repair(m1);
		System.out.println("���� :"+m1.hitpoint);

	}

}
