package day7;

import java.util.Scanner;

public class Ex1201_08 {

	public static void main(String[] args) {
		// [ 숫자맞추기 ]
		// 무한반복으로 숫자맞추기를 하는데 ( 1-100 까지 )
		// 입력받아 입력숫자가 크면 작은숫자입력하세요. 작으면 큰숫자를 입력하세요.
		// 횟수 10번까지 가능 이후 종료
		// 입력한 숫자를 배열을 지정해서 저장
		// 마지막에 배열을 출력해보세요.
		// 정답출력하시오.
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		int r_num = (int)(Math.random()*100)+1;
		int count=1;
		while(true) {
			if(count<=10) {
				System.out.println("숫자를 입력하세요.>>");
				int input = scan.nextInt();
				arr[count-1]=input;
				if(r_num>input) {
					System.out.println("더 큰수를 입력하세요!");
				}else if(r_num<input) {
					System.out.println("더 작은수를 입력하세요!");
				}else {
					System.out.println("정답입니다.");
				}
				count++;
			}else {
				break;
			}
		}
		
		
		
		
		
		System.out.println("정답 숫자 : "+r_num);
		
		

	}

}
