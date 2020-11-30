package day6;

public class Ex1130_03 {

	public static void main(String[] args) {
        
		// 10,10개를 
		for(int i=1;i<=10;i++) {
			for(int j=10;j>0;j--) {  // 4,3,2,1
				if(j>i) {  // 5>1,5>2,5>3,5>4,5>5
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		// 10개, 10줄을 출력하시오.
//		for(int i=1;i<=10;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

	}

}
