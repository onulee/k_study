package day22;

public class Card {
	final int NUMBER;  //ī�����
	final String KIND; //ī����
	static int width = 100;  //Ŭ��������
	static int height = 250; //Ŭ��������
	
	Card(){
		this(1,"SPADE");
	}
	
	Card(int number,String kind){
		this.NUMBER = number;
		this.KIND = kind;
	}
	
	
	public String toString() { //�������̵� - ���
		return " "+KIND+","+NUMBER;
	}

}
