package day16;

public class Car {
	Car(){
		this("¹«¸í","white","auto",4);
	}
	Car(String customer,String color,String gearType,int door){
		this.customer = customer;
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	String customer;
	String color;
	String gearType;
	int door;

}
