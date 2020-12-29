package day26;

public class Tank extends GroundUnit implements Repairable {

	Tank() {
		super(150);
		hitpoint = MAX_HP; //150
	}
	
	@Override
	public String toString() {
		return "Tank »ý¼º";
	}

}
