package day26;

public class Ex1229_01 {

	public static void main(String[] args) {
		Tank t1 = new Tank();
		Marine m1 = new Marine();
		Scv s1 = new Scv();
		
		//미사일 1방 맞음.
		t1.hitpoint = t1.hitpoint - 10;
		//미사일 1방 맞음.
		t1.hitpoint = t1.hitpoint - 10;
		//미사일 1방 맞음.
		t1.hitpoint = t1.hitpoint - 10;
		//미사일 1방 맞음.
		t1.hitpoint = t1.hitpoint - 10;
		System.out.println("현재 탱크 t1 에너지 : "+t1.hitpoint);
		s1.repair(t1);  //수리 진행
		System.out.println("탱크 t1 에너지 : "+t1.hitpoint);
		m1.hitpoint=10;
		System.out.println("마린 :"+m1.hitpoint);
		s1.repair(m1);
		System.out.println("마린 :"+m1.hitpoint);

	}

}
