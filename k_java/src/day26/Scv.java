package day26;

public class Scv extends GroundUnit implements Repairable {

	Scv() {
		super(60);
		hitpoint = MAX_HP;
	}
	
	void repair(Unit r) {  //hitpoint
		long beforeTime = System.currentTimeMillis();
		if(r instanceof Unit) {
			Unit u = (Unit) r;
			while(u.hitpoint!=u.MAX_HP) { //최대치 일때까지 1씩 증가
				u.hitpoint++;  // 60 != 60
			}
		}
		long afterTime = System.currentTimeMillis();
		System.out.println("시간차이 : " +(afterTime-beforeTime));
	}

}
