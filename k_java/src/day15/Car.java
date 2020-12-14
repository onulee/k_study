package day15;

public class Car {
	Car(){
		this("white","auto",4); // this-다른 생성자를 선언할때 사용
	}  //기본생성자
	Car(String color,String gearType,int door){ //매개변수가 있는 생성자
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	Car(Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	
	String color;    //인스턴스 변수
	String gearType;
	int door;
}
