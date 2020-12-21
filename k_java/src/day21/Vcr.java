package day21;

public class Vcr {
	
	boolean power;  //파워 on/off
	int counter = 0;  //채널번호
	String brand="samsung";
	
	void power() {    // 파워 on/off메소드
		power = !power;
	}
	
	void play() { 
		System.out.println("플레이 진행");
	}
	void stop() {
		System.out.println("멈춤");
	}
	void rew() {
		System.out.println("뒤로 감기");
	}
	void ff() {
		System.out.println("앞으로 감기");
	}

}
