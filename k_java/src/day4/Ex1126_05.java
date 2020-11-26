package day4;
import java.util.Scanner;

public class Ex1126_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("1번째 숫자를 입력하세요.>>");
		int num1 = scan.nextInt();
		System.out.println("2번째 숫자를 입력하세요.>>");
		int num2 = scan.nextInt();
		System.out.println("+,-,*,/ 중 1개를 입력하세요.>>");
		char op = scan.next().charAt(0);
		
		int result=0;
		switch(op) {
		case '*':
			result = num1 * num2;
			//50
		case '+':
			result = num1 + num2;
			//15
		case '-':
			result = num1 - num2;
			//5
		case '/':
			result = num1 / num2;
			//2
			break;
		}
		System.out.println(result);
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		int input = scan.nextInt();
//		switch(input) {
//			case 1: case 7:
//			System.out.println("SK");
//		    break;
//		    
//			case 6:
//			case 8:
//			System.out.println("KTF");
//			break;
//			
//			case 9:
//			System.out.println("LG");	
//		    break;
//		    
//		    default:
//		    	System.out.println("잘못입력하셨습니다.");
//		    	break;
//		
//		}

	}

}
