package day22;

public class Card {
	final int NUMBER;  //카드숫자
	final String KIND; //카드모양
	static int width = 100;  //클래스변수
	static int height = 250; //클래스변수
	
	Card(){
		this(1,"SPADE");
	}
	
	Card(int number,String kind){
		this.NUMBER = number;
		this.KIND = kind;
	}
	
	
	public String toString() { //오버라이딩 - 상속
		return " "+KIND+","+NUMBER;
	}

}
