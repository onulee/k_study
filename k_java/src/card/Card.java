package card;

public class Card {
	final String kind;
	final String number; //jqk
	
	Card(){
		this("SPADE","1");
	}
	
	Card(String kind,String number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return kind+","+number;
	}
	

}
