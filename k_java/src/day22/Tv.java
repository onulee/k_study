package day22;

public class Tv {
	boolean power;
	int channel;
	void power() { 
		power = !power; 
	    System.out.println(power);	
	}
	void channelUp() {
		channel++;
		System.out.println(channel);
	}
	void channelDown() {
		channel--;
		System.out.println(channel);
	}
	

}
