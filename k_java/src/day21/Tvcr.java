package day21;

public class Tvcr extends Tv{

	Vcr v = new Vcr();
	int counter = v.counter;
	String brand = v.brand;
	
	void stop() {
		v.stop();
	}
	
}
