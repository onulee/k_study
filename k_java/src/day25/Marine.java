package day25;

public class Marine extends Unit {

	@Override
	void move(int x, int y) {
		System.out.printf("Marine : [%d,%d] ��ǥ�� �̵�! \n",x,y);
	}
	void stimPack() {
		System.out.println("���ݷ� 5 ���!");
	}
	

}
