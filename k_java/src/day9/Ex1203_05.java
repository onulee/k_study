package day9;

public class Ex1203_05 {

	public static void main(String[] args) {
		// %d-정수, %f-실수, %c-문자, %s-문자열, 
		// %n-enter키, %t-tab키
		// %b-2진수, %o-8진수, %x-16진수, %e-지수표현
		
		int a=100;
		double b=3;
		System.out.printf("%5d/%.0f=%08.2f %n",a,b,(a/b));
		//a-b=(a-b), a*b, a/b
		
		// 제가 태어난 날은 10월입니다.
		System.out.printf("제가 태어난 날은 %d월입니다.%n",a);
		// 5월은 봄입니다.
		System.out.printf("%f월은 봄입니다.%n",b);
		System.out.printf("%d월%f일은 제 생일입니다.%n",a,b);
		
		
		

	}

}
