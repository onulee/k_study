package day25;

public class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		System.out.printf("Dropship : [%d,%d] ��ǥ�� �̵�! \n",x,y);
	}
	void load() {  
	 System.out.println("����� ��ũ�� �¿�ϴ�.");
	}
	void unload() {
		System.out.println("����� ��ũ�� �����ϴ�.");
	}

}
