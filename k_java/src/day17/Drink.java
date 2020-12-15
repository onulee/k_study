package day17;

public class Drink {
	static int s_count;  //serialNo
	static int p_count; //p_num-펩시콜라
	static int m_count; //p_num-미란다
	static int o_count; //p_num-오란씨
	static int d_count; //p_num-데자와
	
	Drink(){ }
	
	Drink(String drink_name){
		s_count++;
		this.serialNo = "s" + String.format("%04d", s_count);
		
		// s001 1.펩시콜라-p001 2.미란다-m001 3.오란씨-o001 4.데자와-d001
		switch(drink_name) {
		case "펩시콜라":
			p_count++; //펩시콜라제품번호
			this.p_num = "p" + String.format("%04d", p_count);
			this.drink_name=drink_name;
			this.sale_price=1000;
			this.cost=300;
			break;
		case "미란다":
			m_count++; //펩시콜라제품번호
			this.p_num = "m" + String.format("%04d", m_count);
			this.drink_name=drink_name;
			this.sale_price=800;
			this.cost=200;
			break;
		case "오란씨":
			o_count++; //펩시콜라제품번호
			this.p_num = "o" + String.format("%04d", o_count);
			this.drink_name=drink_name;
			this.sale_price=900;
			this.cost=250;
			break;
		case "데자와":
			d_count++; //펩시콜라제품번호
			this.p_num = "d" + String.format("%04d", d_count);
			this.drink_name=drink_name;
			this.sale_price=900;
			this.cost=250;
			break;	
			
		}
	}
	
	
	String serialNo; // 어떤음료를 생산해도 1씩 증가 - s001
	String p_num; // 1.펩시콜라-p001 2.미란다-m001 3.오란씨-o001 4.데자와-d001 
	String drink_name;
	int sale_price;
	int cost;

}
