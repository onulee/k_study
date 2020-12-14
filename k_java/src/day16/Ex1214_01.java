package day16;

public class Ex1214_01 {

	public static void main(String[] args) {
		// 객체선언해서 흰색,오토,4개를 넣어서 출력을 해보세요.
		Car c = new Car();
		System.out.println(c.customer+","+c.color+","+c.gearType+","+c.door);
		Car sportCar = new Car("박보검","red","manual",5);
		System.out.println(sportCar.customer+","+sportCar.color+","+sportCar.gearType+","+sportCar.door);
	}

}
