package day15;

public class Ex1211_05 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car("white","auto",4);
		Car c4 = new Car("black","auto",4);
		Car c3_backup = new Car(c3);
		System.out.println(c3_backup.color);
		c3.color="pink";
		c3.door=8;
		c3.color = "white";
		c3 = c3_backup;
		System.out.println(c3.color+c3.door);
		

	}

}
