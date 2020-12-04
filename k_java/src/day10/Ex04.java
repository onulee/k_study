package day10;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1-45까지 배열 생성
		int[] lotto = new int[45];
		// 1-45까지 숫자입력
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;
		}
		// 배열섞기
		int temp=0;
		int k=0;
		for(int i=0;i<200;i++) {
			k=(int)(Math.random()*45); // 랜덤배열번호 생성
			temp = lotto[0];
			lotto[0]=lotto[k];
			lotto[k]=temp;
		}
				
		//숫자 넣기
		int[] input = new int[6];
		for(int i=0;i<6;i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요.(1-45)>>");
			input[i] = scan.nextInt();
		}
		//입력숫자 출력
		System.out.print("입력숫자 : ");
		for(int i=0;i<6;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		
		//6개 랜덤번호 출력
		System.out.print("로또당첨번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		//입력한 숫자와 로또당첨번호와 일치하는 개수 출력
		int count=0; //일치하는 개수
		int[] bingo = new int[6]; // 당첨번호 저장배열
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(input[i]==lotto[j]) {
					bingo[count]=input[i]; //당첨번호 저장
					count++;
				}
			}
		}//for
		// 당첨번호,당첨개수 출력
		System.out.println("로또번호 일치개수 : "+count);
		System.out.print("로또일치번호 : ");
		for(int i=0;i<count;i++) {
			System.out.print(bingo[i]+" ");
		}
		System.out.println();
	}//main
}//class
