package day23;

public class Buyer {
	String userName;
	int money;
	int bonusPoint;
	int cart_num;
	
	Product cart[] = new Product[40];
	// Product p->10��
	
	Buyer(){ }
	Buyer(String userName,int money,int bousPoint){
		this.userName = userName;
		this.money = money;
		this.bonusPoint = bousPoint;
	}
	void total_price() {
		System.out.println("���纸���ݾ� : "+this.money);
	}
	
	
	void buy(Product p) {
		money = money - p.price; // ����ݾ׿��� Com������ ��.
		bonusPoint = bonusPoint + p.bonusPoint;
		cart[cart_num++]=p;
		System.out.println(p.p_name+"��(��) �����Ͽ����ϴ�.");
	}
	
	void cart_output() {
		System.out.println("[ ����ǰ�� ]");
		for(int i=0;i<cart_num;i++) {
			System.out.println((i+1)+"��° ����ǰ�� : "+cart[i].p_name);
			// 1��° ����ǰ�� : TV
			// 2��° ����ǰ�� : COMPUTER
		}
	}
	
	

}
