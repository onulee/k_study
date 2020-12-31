package day28;

import java.util.ArrayList;

public class Ex1231_02 {

	public static void main(String[] args) {
		// Drink d1 객체 -> 데자와, 900, 90
		// Drink d2 객체 -> 오란씨, 800, 80
		// Drink d3 객체 -> 데자와, 900, 90
		ArrayList list = new ArrayList();
		list.add(new Drink("데자와",900,90));
		list.add(new Drink("오란씨",800,80));
		list.add(new Drink("데자와",900,90));
		
		// toString객체를 사용하여 출력을 해보세요.
		// equals객체를 사용하여 이름이 같으면 true, 이름이 다르면 false 리턴
        // d1과 d2 이름으로 비교, 비교 - 다름, d1과 d3비교 - 이름으로 비교, 같음		
		System.out.println((Drink)list.get(0)); //->toString()
		System.out.println((Drink)list.get(1));
		System.out.println((Drink)list.get(2));
		Drink d1 = (Drink)list.get(0);
		Drink d2 = (Drink)list.get(1);
		Drink d3 = (Drink)list.get(2);
		if(d1.equals(d3)) {
			System.out.println("이름이 같음");
		}else {
			System.out.println("이름이 다름");
		}
		
		
		
		
		
		
	}
}
