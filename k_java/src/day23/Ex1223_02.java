package day23;

public class Ex1223_02 {

	public static void main(String[] args) {
		// x=200, �ڼ� ��ü ���
		Parent p = new Child(); //������-�θ��� ���������� �ڼ��� ��ü�� �ٷ�� ��
		System.out.println("p.x : "+p.x);
		p.method();

	}

}
