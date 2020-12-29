package day26;

public class Dropship extends AirUnit implements Repairable {

	Dropship() {
		super(100);
		hitpoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Dropship »ý¼º";
	}

}
