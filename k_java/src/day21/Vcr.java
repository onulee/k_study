package day21;

public class Vcr {
	
	boolean power;  //�Ŀ� on/off
	int counter = 0;  //ä�ι�ȣ
	String brand="samsung";
	
	void power() {    // �Ŀ� on/off�޼ҵ�
		power = !power;
	}
	
	void play() { 
		System.out.println("�÷��� ����");
	}
	void stop() {
		System.out.println("����");
	}
	void rew() {
		System.out.println("�ڷ� ����");
	}
	void ff() {
		System.out.println("������ ����");
	}

}
