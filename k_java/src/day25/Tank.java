package day25;

public class Tank extends Unit {

	@Override
	void move(int x, int y) {
		System.out.printf("Tank : [%d,%d] ��ǥ�� �̵�! \n",x,y);
	}
	void changeMode() { 
		System.out.println("��Ÿ� 1m ����!");
	};

}
