package day6;

public class Ex1130_02 {

	public static void main(String[] args) {
		// 1~500까지 더하는 프로그램에서
		// 300이 넘는 범위는 얼마까지 더해야 하는지? 그 값과 합계값을 출력하시오.
		// while
		
		int sum=0;
		int i=1;
		while(i<=500) {
			sum = sum + i;
			if(sum>=300) {
				break;
			}
			i++;
		}
		
		System.out.println("i의 값 : "+i);
		System.out.println("sum의 값 : "+ sum);
		
		
//		int sum = 0;
//		int i=0;
//		for(i=1;i<=500;i++) {
//			sum = sum + i;
//			if(sum>=300) {
//				break;
//			}
//			System.out.println("i : "+i);
//			System.out.println("sum : "+sum);
//		}
//		System.out.println("i의 값 : "+ i);
//		System.out.println("sum의 값 : "+sum);
		

	}

}
