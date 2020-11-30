package day6;

import java.util.Scanner;

public class Ex1130_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 1. 랜덤으로 1~100까지 숫자를 생성 변수에 저장
		// 2. 숫자를 입력받아 맞는지 비교
		// * 무한반복 for(;;) / while(true)
		// 3. 입력숫자가 크면 작은 숫자를 입력하세요. 작으면 큰 숫자를 입력하세요.
		// 5번까지 입력이 가능 -> 프로그램 종료
		// 5번 입력했는데 -> 마지막 -> 입력한 값이 출력이 되도록 해보세요.
		
		int r_num = (int)(Math.random()*100)+1;
		int count=1;
	    String result="";
	    int num1=0,num2=0,num3=0,num4=0,num5=0;
		
		while(true) {
			if(count<=5) {
				// 프로그램
				System.out.println("[ "+count+"번째 입력 ]");
				count++;
				System.out.println("숫자를 입력하세요.>>");
				int input = scan.nextInt();
				result = result +" "+ input;
				// ""+10 = "10"
				// "10" + 20= "10 20"
				
				
				if(r_num >input) {
					System.out.println("더큰 숫자를 입력하세요!");
				}else if(r_num < input) {
					System.out.println("더 작은 숫자를 입력하세요.!");
				}else {
					System.out.println("정답입니다.!");
					break;
				}
				
			}else {
				//프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}//while
		
		// 입력한 값 : 
		System.out.println("입력한 값 : " + result);
		System.out.println("정답 랜덤 숫자 : "+r_num);
		
		
		
		// 4. 맞으면 프로그램을 종료하세요.
		
//		loop1:for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				if(j==5) {
//					break loop1;
//				}
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//		}

	}

}
