package day6;

public class Ex1130_01 {
	
	public static void main(String[] args) {
		
		// 구구단 2~9단 출력하시오.
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=5;j++) {
				System.out.print(j+" * "+i+" = "+j*i+"\t");
			}
			System.out.println();
		}
		
		for(int i=1;i<=9;i++) {
			for(int j=6;j<=9;j++) {
				System.out.print(j+" * "+i+" = "+j*i+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		// 1~500을 더하는데
		// 200을 넘지 않는 때의 최대 값은 얼마인지? 
		// 어디까지 더할때 그렇게 되는지를 출력하시오.

//		int sum=0;
//		int i=0;
//		for(i=1;i<=500;i++) {
//			sum = sum + i;
//			System.out.println(i);
//			System.out.println(sum);
//			if(sum>=200) {
//				break;
//			}
//		}
//		System.out.println("i의 값 : "+(i-1));
//		System.out.println("sum결과값 : "+(sum-i));
		
	}

	
}
