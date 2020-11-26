package day4;
import java.util.Scanner;

public class Ex1125_08 {

	public static void main(String[] args) {
		
		// 구매금액을 입력받아, 1백만원 이상 VIP
		// 80만원 GOLD, 70만원 SILVER, 50이하 BRONZE
		Scanner scan = new Scanner(System.in);
		System.out.println("구매금액를 입력하세요.>>");
		int purchase_price = scan.nextInt();
		if(purchase_price>=1000000) {
			System.out.println("VIP");
		}else if(purchase_price>=800000) {
			System.out.println("GOLD");
		}else if(purchase_price>=700000) {
			System.out.println("SILVER");
		}else {
			System.out.println("BRONZE");
		}
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력하세요.>>");
//		int num = scan.nextInt();
//		if(num>=90) {
//			System.out.println("A");
//		}else if(num>=80) {
//			System.out.println("B");
//		}else if(num>=70) {
//			System.out.println("C");
//		}else if(num>=60) {
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}

	}

}
