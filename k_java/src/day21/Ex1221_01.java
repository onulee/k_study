package day21;

public class Ex1221_01 {

	public static void main(String[] args) {
		Deck d = new Deck(); //Card 52�� ����-����,���� ��� ���� 
		for(int i=0;i<d.CARD_NUM;i++) {
			Card c = d.pick(i);   //���������� ���
			System.out.println(c.kind+","+c.number);
		}
		//ī�弯��
		d.shuffle();
		System.out.println("ȫ�浿 : ");
		for(int i=0;i<6;i++) {
			Card c = d.pick(i);   //ȫ�浿 ���
			System.out.println(c.kind+","+c.number);
		}
		System.out.println("��ǻ�� : ");
		for(int i=6;i<12;i++) {
			Card c = d.pick(i);   //ȫ�浿 ���
			System.out.println(c.kind+","+c.number);
		}
	}

}
