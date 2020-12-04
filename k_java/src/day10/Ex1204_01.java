package day10;

import java.util.Scanner;

public class Ex1204_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// [9,5] 2차원배열 -> 45개
		int[][] score = new int[9][5];
		// 중복없이 1-45를 랜덤으로 넣고 싶을때 사용하는 배열
		int[] arr = new int[45];
		// 1차원배열에 순차적으로 숫자넣기(1-45)
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1; //1,2,3,4,5....
		}
		//배열섞기 - temp:임시저장,k:랜덤번호 저장
		int temp=0;
		int k=0;
		// 200번 섞기
		for(int i=0;i<200;i++) {
			k=(int)(Math.random()*45); // 배열에 들어가는 번호(0-44)
			temp = arr[0];
			arr[0] = arr[k];
			arr[k] = temp;
		}
		//score배열에 데이터 값 넣기
		for(int i=0;i<9;i++) {
			for(int j=0;j<5;j++) {
				score[i][j] = arr[(5*i)+j]; //arr[0]부터 순차적 데이터 값 입력
				//score[i][j] = (int)(Math.random()*45)+1; //1,45,30,21,1,...
				//score[i][j] =(5*i)+j+1;  // 0+1,2,3,4,5 5+1,2,3,4,5
			}
		}
		// 상단출력
		for(int i=0;i<5;i++) {
			//System.out.print("\t"+"["+i+"]");
			System.out.printf("\t[%d]",i);
		}
		System.out.println();
		// score 2차원배열 출력
		for(int i=0;i<9;i++) {
			System.out.print("["+i+"]"+"\t");
			for(int j=0;j<5;j++) {
				//score[i][j] 값 출력
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		//x,y의 좌표값 입력
		System.out.println("x좌표값을 입력하세요.>>");
		int x = scan.nextInt();
		System.out.println("y좌표값을 입력하세요.>>");
		int y = scan.nextInt();
		// x,y의 좌표를 비교해서 그 값을 출력
		int check=0;
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				if(x==i && y==j) {
					System.out.printf("[%d,%d] 좌표값 : %d %n ",x,y,score[x][y]);
					check++;
				}
			}
		}//for
		if(check==0) {
			System.out.println("해당되는 좌표값이 없습니다.!!");
		}

	}

}
