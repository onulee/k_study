package day8;

public class Ex1202_03 {

	public static void main(String[] args) {
		//[9,5] 배열을 만들어서 1-45까지 숫자를 입력하고 출력하시오.
		int[] temp_s = new int[45];
		for(int i=0;i<45;i++) {
			temp_s[i] = i+1;
		}
		int temp=0;
		int temp_j=0;
		for(int i=0;i<200;i++) {
			temp_j = (int)(Math.random()*45); // 0-44
			temp = temp_s[0];
			temp_s[0] = temp_s[temp_j];
			temp_s[temp_j] = temp;
		}
		
		int[][] score = new int[9][5];
		for(int i=0;i<9;i++) {
			for(int j=0;j<5;j++) {
				score[i][j] = temp_s[(5*i)+j]; // temp_s[0-44]
//				score[i][j] = (int)(Math.random()*45+1);//중복가능
//				score[i][j] = (5*i)+j+1; //1-45
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		// 랜덤숫자를 넣어보세요.(중복불가능)
		
		
		
		
		
		//1개 입력받아 배열에 몇번째에 있는지 출력하시오.
		// 44 -> [8,3]

	}

}
