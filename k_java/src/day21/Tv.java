package day21;

public class Tv {
	
	boolean power; //����
	int channel;   //ä��
	
	void power() {
		power = !power;  //�Ŀ�on/off
	}
	
	void channelUp() {  //ä������
		++channel;
	}
	
	void channelDown() {  //ä�ΰ���
		--channel;
	}

}
