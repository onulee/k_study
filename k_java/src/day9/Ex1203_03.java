package day9;

import java.util.Scanner;

public class Ex1203_03 {

	public static void main(String[] args) {
		// 번호, 국어, 영어, 수학, 합계 - 3명
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[3][5];
		String[] title = {"번호","국어","영어","수학","합계"};
		
//		int[][] score = {
//			{1,100,100,100,300},{2,90,90,90,270},
//			{3,80,80,80,240}
//		};
		
		// 3명 점수 입력
		for(int i=0;i<score.length;i++) {
			System.out.println("["+(i+1)+"번째 입력 ]");
			score[i][0] = i+1;
			System.out.println("국어점수를 입력해주세요.>>");
			score[i][1] = scan.nextInt();
			System.out.println("영어점수를 입력해주세요.>>");
			score[i][2] = scan.nextInt();
			System.out.println("수학점수를 입력해주세요.>>");
			score[i][3] = scan.nextInt();
			score[i][4] = score[i][1]+score[i][2]+score[i][3];
		}
		
		// 상단출력
		for(int i=0;i<title.length;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("-------------------------------------");
		// 배열출력
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
