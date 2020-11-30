package day6;

import java.util.Scanner;

public class Ex1130_05 {

	public static void main(String[] args) {
		
		// 1. 숫자를 2개 입력받아, 
		// 2.구구단을 출력
		// 첫번째 숫자는 5를 입력받으면 2부터 5단까지 출력
		// 두번째 숫자는 3이면 ->  5*1=5 5*2=10 5*3=15
		
		Scanner scan = new Scanner(System.in);
		System.out.println("2단에서 출력할 단숫자를 입력하세요.>>");
		int input1 = scan.nextInt();
		System.out.println("단에서 출력하고 싶은 숫자를 입력하세요.>>");
		int input2 = scan.nextInt();
		
		for(int i=2;i<=input1;i++) {  //단출력
			System.out.println("[ "+i+"단 ]");
			for(int j=1;j<=input2;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		
		
		
		
		// 숫자를 입력받아
		// 구구단을 출력하는데
		// 5를 입력하면 -> 5단만 출력될수 있도록 해보세요.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("시작할 단을 입력하세요.>>");
//		int start=0,end=0; //시작
//		int input1 = scan.nextInt();  // 5
//		System.out.println("출력하고 싶은 단을 입력하세요.>>");
//		int input2 = scan.nextInt();  // 3
//		//3,4,5
//		start = Math.max(input1, input2);
//		end = Math.min(input1, input2);
//		
//		if(input1<=input2) {
//			start = input1;
//			end = input2;
//		}else {
//			start = input2;
//			end = input1;
//		}
//		
//		for(int i=start;i<=end;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//		}
		
		
		// 1~100까지 숫자를 맞추는 게임
		// 2. 입력숫자 입력을 받음
		// 3. 랜덤숫자와 입력숫자가 맞는지 비교
		//    - 입력숫자가 크면 작은숫자 입력하세요. 작으면 큰 숫자를 입력하세요. 맞으면 프로그램 종료   
		// 4. 맞을때까지 무한반복
		// 4-1. 5번만 반복, 이후 프로그램 종료
		// 5. 입력한 숫자 출력, 랜덤숫자 출력
		
//		Scanner scan = new Scanner(System.in);
//		// 1. 1~100까지 랜덤 숫자를 만듬
//		int r_num = (int)(Math.random()*100)+1;
//		String result="";
//		int count=0;
//		// 무한반복
//		while(true) {
//			if(count<5) {
//				// 프로그램 실행
//				System.out.println("숫자를 입력하세요.>>");
//				int input = scan.nextInt();
//				
//			    result = result +" "+input;
//				if(r_num>input) {
//					System.out.println("더 큰수를 입력하세요.!");
//				}else if(r_num<input) {
//					System.out.println("더 작은수를 입력하세요.!");
//				}else {
//					System.out.println("정답입니다.");
//					break;
//				}
//			}else {
//				// 프로그램 종료
//				System.out.println("프로그램을 종료합니다.!");
//				break;
//			}
//		}
//		System.out.println("입력숫자 : "+result);
//		System.out.println("랜덤숫자 : "+r_num);
			
			
			
			
		
		
		
		
		
		
		
		
		

	}

}
