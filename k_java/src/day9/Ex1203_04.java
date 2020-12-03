package day9;

import java.util.Scanner;

public class Ex1203_04 {

	public static void main(String[] args) {
		// 배열[5,5]
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[][] score = new int[1][5]; //5,5
		double[] avg = new double[5];
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		
		// 데이터 입력
		for(int i=0;i<score.length;i++) {
			System.out.println("번호를 입력하세요.>>");
			score[i][0] = scan.nextInt();
			System.out.println("이름을 입력하세요.>>");
			name[i] = scan.next();
			System.out.println("국어점수를 입력하세요.>>");
			score[i][1] = scan.nextInt();
			System.out.println("영어점수를 입력하세요.>>");
			score[i][2] = scan.nextInt();
			System.out.println("수학점수를 입력하세요.>>");
			score[i][3] = scan.nextInt();
			score[i][4] = score[i][1]+score[i][2]+score[i][3];
			avg[i] = score[i][4]/3.0;
		}
		
		//상단 출력
		for(int i=0;i<title.length;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("------------------------------------");
	    //score 출력
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
				if(j==0) { //이름출력
					System.out.print(name[i]+"\t");
				}
			}
			//평균값 출력
			System.out.printf("%.2f\t",avg[i]);
			System.out.println();
		}
		
		
		
		
	}//main

}//class
