package day8;

public class Ex1202_04 {

	public static void main(String[] args) {
		// 1. [10,5] 2차원 배열 생성
		//    배열에 1-50까지 순서대로 숫자를 입력하고 출력!
		// 2. 랜덤으로 숫자를 넣고 출력!(중복가능)
		int[][] score = new int[10][5];
		int[] arr = new int[50];
		for(int i=0;i<50;i++) {
			arr[i] = i+1;
		}
		int temp=0;
		int a_j=0;
		for(int i=0;i<200;i++) {
			a_j = (int)(Math.random()*50); // 0-49
			temp = arr[0];
			arr[0] = arr[a_j];
			arr[a_j] = temp;
		}
		
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
//				score[i][j] = (score[i].length*i)+j+1; //1,2,3,...45
//				score[i][j] = (int)(Math.random()*50)+1; //랜덤숫자 중복가능
				score[i][j] = arr[score[i].length*i+j]; //랜덤숫자 중복불가
				// arr[0],arr[1],arr[2],arr[3]....arr[49]
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		// 3. 1차원 배열을 만들어서 1-50까지 순차적으로 값을 입력하고
		//    랜덤으로 섞어서 입력된 배열 숫자를 2차원배열에 넣고 출력!
		//    (중복불가능)
		
		// 4. 30을 입력받으면 [5,4] 위치점이 출력하시오.
		// 5. [3,4] -> 좌표값 0으로 입력되어서 모든 숫자 출력하시오.

	}

}
