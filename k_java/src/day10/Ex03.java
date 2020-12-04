package day10;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 랜덤숫자 1-100
		// 10번까지만 실행 -> 입력한 값을 출력
		Scanner scan = new Scanner(System.in);
		int random_num = (int)(Math.random()*100)+1;
		int[] arr = new int[10]; //입력저장배열
		//무한 반복
		int count=1;
		while(true) {
			// 10번 비교
			if(count>10) {
				System.out.println("10번을 넘어서 프로그램을 종료합니다.");
				break;
			}
			// 숫자입력
			System.out.println("숫자를 입력하세요.(1-100사이)>>");
			int input = scan.nextInt();
			arr[count-1]=input; // 배열에 입력한 숫자 저장
			// 랜덤숫자와 입력숫자 비교
			if(random_num>input) {
				System.out.println("더 큰숫자를 입력하시오!!");
			}else if(random_num<input) {
				System.out.println("더 작은 숫자를 입력하시오!!");
			}else {
				System.out.println("정답입니다!!");
				break;
			}
			count++; //1씩 증가
		}
		// 입력한 배열 출력
		for(int i=0;i<count;i++) {
			System.out.printf("입력한 숫자 : %d %n ",arr[i]);
		}
		// 결과값 출력
		System.out.println("정답 숫자 : "+random_num);

	}

}
