package day21;

public class Tv {
	
	boolean power; //전원
	int channel;   //채널
	
	void power() {
		power = !power;  //파워on/off
	}
	
	void channelUp() {  //채널증가
		++channel;
	}
	
	void channelDown() {  //채널감소
		--channel;
	}

}
