package day29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ex0104_07 {

	public static void main(String[] args) {
		// Drink - code-자동증가,d_name,price
		// coke - 1100;
		// Tejava - 900;
		// Pepsi - 1000;
		// Miranda - 800;
		// Oranc - 900;
		ArrayList<Drink> list = new ArrayList<Drink>();
		Scanner scan = new Scanner(System.in);
		
//		while(true) {
//			System.out.println("이름을 입력하세요.(0.이전화면)>>");
//			String d_name = scan.nextLine();
//			if(d_name.equals("0")) {
//				break;
//			}
//			System.out.println("가격을 입력하세요.>>");
//			int price = scan.nextInt();
//			scan.nextLine();
//			list.add(new Drink(d_name,price));
			
//		}
		list.add(new Drink("코카콜라",1100));
		list.add(new Drink("데자와",900));
		list.add(new Drink("펩시",1000));
		list.add(new Drink("미란다",800));
		list.add(new Drink("오란씨",900));
		//String 정렬
//		Collections.sort(list,new Comparator<Drink>() {
//			@Override
//			public int compare(Drink d1, Drink d2) {
//				return ((d2.code).compareTo(d1.code)); //1일때만 list
//				// d002 > d001 1
//				// d001 == d001 0
//				// d001 > d002 -1
//			}
//		}); 
		
		Collections.sort(list,new Comparator<Drink>() {
			@Override
			public int compare(Drink d1, Drink d2) {
				if(d1.price>d2.price) {
					return 1;
				}else if(d1.price<d2.price) {
					return -1;
				}
				return 0;
				// return d1.price-d2.price;  //음수,0,양수
			}
		});
		
		for(Drink d:list) {
			System.out.println(d);
		}
		
		// 1. 캔음료 입력 - 학생성적입력처럼 만들면 됨. 
		// 2. 캔음료 출력
		// 3. 코드로 순차정렬 출력
		// 4. 코드로 역순정렬 출력
		// 5. 이름으로 순차정렬 출력
		// 6. 이름으로 역순정렬 출력
		// 7. 가격으로 순차정렬 출력
		// 8. 가격으로 역순정렬 출력
		//--------------------------------
		// 원하는 번호를 입력하세요.>>
		
		
		
		
		

	}

}
