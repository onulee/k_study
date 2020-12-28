package day25;

public class Ex1228_02 {

	public static void main(String[] args) {
		Unit[] unit_group = new Unit[4];
		// Unit u1 = new Marine();
		unit_group[0] = new Marine();
		unit_group[1] = new Tank();
		unit_group[2] = new Marine();
		unit_group[3] = new Dropship();
		
		for(int i=0;i<unit_group.length;i++) {
			unit_group[i].move(100, 200);
		}
		
//		for(int i=0;i<unit_group.length;i++) {
//			if (unit_group[i] instanceof Marine) {
//				Marine m = (Marine) unit_group[i];
//				m.move(100, 200);
//			}
//			if (unit_group[i] instanceof Tank) {
//				Tank m = (Tank) unit_group[i];
//				m.move(100, 200);
//			}
//			if (unit_group[i] instanceof Dropship) {
//				Dropship m = (Dropship) unit_group[i];
//				m.move(100, 200);
//			}
////			unit_group[i].move(100, 200);
//		}
		
		

	}

}
