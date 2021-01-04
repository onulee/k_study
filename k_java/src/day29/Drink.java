package day29;

public class Drink {
	
	// Drink °´Ã¼ - String code,String d_name
//	static int count=0;
//	{
//		count++; //D001
//		this.code = "D"+String.format("%03d", count);
//	}
	Drink(String code,String d_name,int price){
		this.code = code;
		this.d_name = d_name;
		this.price = price;
	}
	
	Drink(){ }
	Drink(String d_name,int price){
		this.d_name = d_name;
		this.price = price;
	}
	
	String code;
	String d_name;
	int price;
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Drink) {
			return code==((Drink)obj).code;
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (code+d_name+price).hashCode();
	}
	
	
	@Override
	public String toString() {
		return code+","+d_name+","+price;
	}
	
	

}
