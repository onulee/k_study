package day7;

import java.util.Scanner;

public class Ex1201_05 {

	public static void main(String[] args) {
		
		// 6개 숫자 입력(배열) : 10 20 30 40 42 45
		// 로또번호 6개 출력 : 1 3 5 8 6 21
		// 맞는숫자가 몇개인지 확인해보세요.
		
		Scanner scan = new Scanner(System.in);
		int[] lotto_in = new int[6];
		int input=0;
		//숫자입력
		loop1: for(int i=0;i<6;i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요.>>");
			input = scan.nextInt();
			
			//기존 입력한 숫자와 비교
			for(int j=0;j<lotto_in.length;j++) {
				if(lotto_in[j]==input) {
					System.out.println(input+"는(은) 입력하신 숫자입니다. 다시입력하세요!");
					i--;
					continue loop1;
				}
			}
			
			//1-45까지 숫자 범위 체크
			if(input>=1 && input<=45) {
				lotto_in[i] = input;
			}else {
				System.out.println(input+"는(은) 범위 밖의 숫자를 입력하셨습니다.");
				i--;
			}
		} //for
		
		//로또번호 생성
		int[] ball = new int[45];
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		
		//로또번호 섞기
		int temp = 0;
		int j=0;
		
		for(int i=0;i<200;i++) {
			j = (int)(Math.random()*45); //0-44
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		
		//로또번호
		System.out.println("[ 로또 당첨번호 ]");
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+" ");
		}
		//입력숫자
		System.out.println("[ 로또 입력 숫자 ]");
		for(int i=0;i<6;i++) {
			System.out.print(lotto_in[i]+" ");
			
		}
		
		
		
		
		
		
		
		
		
		
		// 1~~100까지의 숫자 배열을 만들어서
		// 랜덤으로 섞어서 6개만 출력해보세요.
		
		// 1. 1-100까지 배열선언
		// 2. 배열에 숫자넣기
		// 3. 배열 섞기
		//    - 변수선언, 랜덤생성, 위치섞기   
		// 4. 배열 출력
		
//		int[] ball = new int[100];
//		for(int i=0;i<ball.length;i++) {
//			ball[i] = i+1;
//		}
//		
//		int temp=0;
//		int j=0;
//		
//		for(int i=0;i<400;i++) {
//			j = (int)(Math.random()*100);
//			temp = ball[0];
//			ball[0] = ball[j];
//			ball[j] = temp;
//		}
//		
//		for(int i=0;i<6;i++) {
//			System.out.println(ball[i]);
//		}

	}

}
