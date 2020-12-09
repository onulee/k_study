package day12;

public class Tv {
	String color;
	boolean power; //on/off
	int channel;
	
	void power() {
		power=!power;  // off->on, on->off
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
