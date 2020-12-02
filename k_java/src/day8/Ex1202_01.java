package day8;

import java.util.Scanner;

public class Ex1202_01 {

	public static void main(String[] args) {
		
		//6. 6개 입력
		Scanner scan = new Scanner(System.in);
		int[] input_arr = new int[6];
		int temp_arr=0;
		in_loop1: for(int i=0;i<6;i++) {
			System.out.println("숫자를 입력하세요.>>");
			temp_arr = scan.nextInt();
			//8. 1-45까지 숫자인지 비교
			if(!(temp_arr>=1 && temp_arr<=45)) {
			   i--;
			   continue;
			}
			//9. 중복비교
			for(int j=0;j<6;j++) {
				if(temp_arr==input_arr[j]) {
					i--;
					continue in_loop1;
				}
			}
			// input_arr배열에 저장
			input_arr[i] = temp_arr;
		}
		
		// 1.45개 배열생성
		int[] ball = new int[45];
		
		// 2.45개 배열 1~45 숫자 넣기
		for(int i=0;i<45;i++) {
			ball[i] = i+1;
		}
		
		// 3.45개 배열 섞기
		int temp=0; // 배열값의 임시저장변수
		int j=0; // 랜덤숫자 저장변수
		for(int i=0;i<200;i++) {
			j = (int)(Math.random()*45); //0-44
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		
		// 7. 6개입력받은 숫자 출력
		for(int i=0;i<6;i++) {
			System.out.print(input_arr[i]+" ");
		}
		
		// 4.6개 배열을 출력
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+" ");
		}
		
		
		
		
		// 6개 배열을 추가적으로 만들고
		// 배열에 숫자를 입력받아 같이 출력하시오.
		
		// 입력받을때 1~45까지만 입력되도록 하시오.
		// 중복해서 같은 숫자가 입력되면 다시 입력받으시오.
		// 로또번호와 일치하는 개수가 몇개인지 출력하시오.
		

	}

}
