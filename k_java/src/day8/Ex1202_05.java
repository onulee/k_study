package day8;

import java.util.Scanner;

public class Ex1202_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//변수선언
		int[] arr = new int[45];
		String[][] score = new String[9][5];
		int temp=0;  //배열섞기에서 배열값 임시저장 변수
		int k=0;     // 랜덤숫자 변수
		// 1차원배열 1-45까지 저장
		for(int i=0;i<45;i++) {
			arr[i] = i+1;
		}
		// 배열 섞기
		for(int i=0;i<200;i++) {
			k = (int)(Math.random()*45); // 0-44
			temp = arr[0];
			arr[0] = arr[k];
			arr[k] = temp;
		}
		// 무한반복
		while(true) {
			// 프로그램 실행 알림
			System.out.println("좌표값 알림 프로그램을 실행하시겠습니까?(1:yes,0:no)");
			int result = scan.nextInt();
			if(result==0) {
				System.out.println("프로그램을 종료합니다!");
				break;
			}
			
			// 상단출력용
			for(int i=0;i<5;i++) {
				System.out.print("\t"+"["+i+"]");
			}
			System.out.println();
			System.out.println("--------------------------------------------");
			
			// 2차원배열 입력 및 출력
			for(int i=0;i<9;i++) {
				System.out.print("["+i+"]"+"\t");  //출력용
				for(int j=0;j<5;j++) {
					score[i][j] = ""+arr[(5*i)+j]; // temp_s[0-44]
//					score[i][j] = (int)(Math.random()*45+1);//중복가능
//					score[i][j] = (5*i)+j+1; //1-45
					System.out.print(score[i][j]+"\t");
				}
				System.out.println();
			}
			// 좌표값 입력
			System.out.println("좌표값을 알고 싶은 숫자를 입력하세요.(* 1-45까지 입력)>>");
			String input = scan.next();
			int check=0;
			check_loop1:for(int i=0;i<9;i++) {
				for(int j=0;j<5;j++) {
					if(input.equals(score[i][j])) {
						System.out.println("좌표값 : "+"["+i+","+j+"]");
						check = 1;
						break check_loop1;
						// 좌표값 : [1,2]
					}
				}
			}
			if(check==0) {
				System.out.println("원하는 숫자가 좌표에 없습니다.");
			}
			
		}//while
		
		
		
		
		// 4. 20을 입력받으면 [1,2] 위치점이 출력하시오.
		// 5. x좌표입력 1 y좌표입력 2 
		//    -> 좌표값 x으로 입력되어서 모든 숫자 출력하시오.
		//     0   1   2   3    4
		//-------------------------
		// 0 |  1   2   6   21   22
		// 1 |  45  30  x   15   14

	}

}
