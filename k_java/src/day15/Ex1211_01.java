package day15;

public class Ex1211_01 {

	public static void main(String[] args) {
		
		long result = factorial(5);
		System.out.println(result);
		
		
		// 5*4*3*2*1 결과값을 출력하시오.
//		int result=1;
//		for(int i=5;i>0;i--) {
//			result = result * i;
//			// result *= i;
//		}
//		System.out.println(result);
	}
	
	static long factorial(int n) {
		long result=0;
		if(n==1) {
			result = 1;
		}else {
			result = n * factorial(n-1);
		}
		return result;
	}

}
