package day4;
import java.util.Scanner;

public class Ex1125_03 {

	public static void main(String[] args) {
		
		if(10.0d==10.0f) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if((float)0.1d==0.1f) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		double d = (double)0.1f;
		System.out.println(d);
		
		// Math.round -> 반올림
		// Math.ceil -> 올림
		// Math.floor -> 버림
		
		// 숫자를 입력받아 -> 3자리에서 반올림, 올림, 버림을 출력하시오.
		
//	    Scanner scan = new Scanner(System.in);
//	    System.out.println("숫자를 입력하세요.>>");
//	    double in = scan.nextDouble();
//	    
//		System.out.println(Math.round(in*100)/100.0);
//		System.out.println(Math.ceil(in*100)/100.0);
//		System.out.println(Math.floor(in*100)/100.0);
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("실수를 입력하세요.>>");
//		double pi = scan.nextDouble();
//		double result = Math.floor(pi*100)/100.0;
//		System.out.println(result);
//		
//		System.out.println("실수를 입력하세요.>>");
//		double d = scan.nextDouble();
//		double result2 = Math.floor(d*10000)/10000.0;
//		System.out.println(result2);
		
		
		
		
		// 1개의 실수를 입력받아 3자리에서 반올림하시오.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("실수를 입력하세요.>>");
//		double input = scan.nextDouble();  // 내가 입력한 값
//		double result = Math.round(input*1000)/1000.0;
//		System.out.println(result);
		
		
		
		
//		double pi = 3.141592;   // 3141.592 -> 3142 -> 3.142
//		double result = Math.round(pi*1000)/1000.0;
//		System.out.println(result);
		
		
//		double pi = 3.141592;
//		double result = (int)(pi*1000)/1000.0;
//		System.out.println(result);
//		
//		// 15.234567 -> 2자리 버림.   36547.12458763 -> 5자리 버림
//		// 1개의 실수를 입력받아, 3자리이하 버림을 해서 출력하시오.
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("실수를 입력하세요.>>");
//		double input = scan.nextDouble();
//		double result2 = (int)(input*1000)/1000.0;
//		System.out.println(result2);
		

	}

}
