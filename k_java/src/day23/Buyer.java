package day23;

public class Buyer {
	String userName;
	int money;
	int bonusPoint;
	int cart_num;
	
	Product cart[] = new Product[40];
	// Product p->10개
	
	Buyer(){ }
	Buyer(String userName,int money,int bousPoint){
		this.userName = userName;
		this.money = money;
		this.bonusPoint = bousPoint;
	}
	void total_price() {
		System.out.println("현재보유금액 : "+this.money);
	}
	
	
	void buy(Product p) {
		money = money - p.price; // 현재금액에서 Com가격을 뺌.
		bonusPoint = bonusPoint + p.bonusPoint;
		cart[cart_num++]=p;
		System.out.println(p.p_name+"를(을) 구매하였습니다.");
	}
	
	void cart_output() {
		System.out.println("[ 구매품목 ]");
		for(int i=0;i<cart_num;i++) {
			System.out.println((i+1)+"번째 구매품목 : "+cart[i].p_name);
			// 1번째 구매품목 : TV
			// 2번째 구매품목 : COMPUTER
		}
	}
	
	

}
