package day9;

import java.util.Scanner;

public class Ex1203_06 {

	public static void main(String[] args) {
		// 3명의 학생의 점수를 입력받아
		// int 배열, String배열 2개만듬, double배열 생성
		// 번호,이름,국어,영어,수학,합계,평균 출력하시오.
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[3][5]; //학생:3 번호,국어,영어,수학,합계,:5
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		String[] name = new String[3]; //이름
		double[] avg = new double[3];  //평균
		
		
		// 데이터입력
		//1. 번호,이름,국어,영어,수학 -> 합계,평균,등수 자동으로 입력
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d번째 번호를 입력하세요.>>%n",i+1);
			score[i][0] = scan.nextInt(); // 1, enter
			scan.nextLine();
			System.out.println("이름을 입력하세요.>>");
			name[i] = scan.nextLine(); 
			System.out.println("국어점수를 입력하세요.>>");
			score[i][1] = scan.nextInt();
			System.out.println("영어점수를 입력하세요.>>");
			score[i][2] = scan.nextInt();
			System.out.println("수학점수를 입력하세요.>>");
			score[i][3] = scan.nextInt();
			score[i][4] = score[i][1]+score[i][2]+score[i][3];
			avg[i] =score[i][4]/3.0;
		}
		// 등수
		int[] rank = new int[3];       //등수
		for(int i=0;i<score.length;i++) {
			int level=1;
			for(int j=0;j<score.length;j++) {
				if(score[i][4]<score[j][4]) {
					level++;
				}
			}
			rank[i] = level;  // 2
		}
		// 상단출력 - 7개
		for(int i=0;i<title.length;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------");
		
		// 데이터 출력
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");//번호,국어,영어,수학,합계
				// 이름
				if(j==0) {
					System.out.print(name[i]+"\t");
				}
			}
			//평균출력
			System.out.printf("%.2f\t",avg[i]);
			//등수출력
			System.out.print(rank[i]+"\t");
			System.out.println();
		}

	}

}
