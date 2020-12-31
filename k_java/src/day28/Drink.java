package day28;

public class Drink {
	
	// d_name,price,bonusPoint
	String d_name;
	int price;
	int bonusPoint;
	
	Drink(){}
	Drink(String d_name,int price,int bonusPoint){
		this.d_name = d_name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
	
	@Override
	public String toString() { // 
		return d_name+","+price+","+bonusPoint; //µ¥ÀÚ¿Í,900,90
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Drink) {
			if(d_name.equals(((Drink)obj).d_name)) {
				return true;
			}else {
				return false;
			}
	    }//if
		return false;
	}

}//class
