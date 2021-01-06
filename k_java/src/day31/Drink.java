package day31;

public class Drink {
	private String d_name;
	private int price;
	
	Drink(){}
	Drink(String d_name,int price){
		this.d_name = d_name;
		this.price = price;
	}
	
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}
