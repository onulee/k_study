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
			while(u.hitpoint!=u.MAX_HP) { //�ִ�ġ �϶����� 1�� ����
				u.hitpoint++;  // 60 != 60
			}
		}
		long afterTime = System.currentTimeMillis();
		System.out.println("�ð����� : " +(afterTime-beforeTime));
	}

}
