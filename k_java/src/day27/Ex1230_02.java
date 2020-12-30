package day27;

import java.util.Scanner;

public class Ex1230_02 {

	public static void main(String[] args) {
		//int 5개짜리 배열을 만들어 보세요.
		// 1.배열에 숫자 넣기
		// 배열에 숫자를 넣습니다.
		// 넣고 싶은 숫자를 입력하세요.>>
		// 예) 5 를 입력하면 순차적으로 int배열에 저장이 됨.
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int i=0;
		while(true) {
			System.out.println("원하는 숫자를 입력하세요.>>");
			num[i] = scan.nextInt();
			System.out.println("숫자가 입력되었습니다.!");
			for(int j=0;j<num.length;j++) {
				System.out.println(j+1+"번째 배열 : "+num[j] );
			}
			i++;
		}
		

	}

}
