package day22;

public class Ex1222_06 {

	public static void main(String[] args) {
		
		Car c1 = null; //null
		Car c2;        //null
		
		FireEngine f1 = new FireEngine();
		Ambulance a1 = new Ambulance();
		Car c3 = new Ambulance();
		Ambulance a2;
		FireEngine f2;
		if( c3 instanceof Ambulance) {
			System.out.println("¸Â½À´Ï´Ù.");
		}else {
			System.out.println("Ambulance °´Ã¼°¡ ¾Æ´Õ´Ï´Ù.");
		}
		
		
//		Car c1 = new Car();  // color,door,drive(),stop();
//		Car c2 = new FireEngine(); // color,door,drive(),stop(),water()
//		Car c3 = new Ambulance(); // color,door,drive(),stop(),siren()
//		
//		FireEngine f1;
//		f1 = (FireEngine) c2;
//		f1.water();
//		
//		Ambulance a1;
//		a1 = (Ambulance) c3;
//		a1.siren();
				
		
//		f1 = (FireEngine) c3; // ¿ø·¡°´Ã¼ new Ambulance();
//		f1.water();
		
//		f1 = (FireEngine) c1; // ¿ø·¡°´Ã¼ new Car();
//		f1.water();

	}

}
