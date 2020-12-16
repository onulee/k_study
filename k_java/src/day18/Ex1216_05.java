package day18;

import java.util.Scanner;

public class Ex1216_05 {

	public static void main(String[] args) {
		int[] input = new int[10];
		int answer=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("[ 말랑말랑 두뇌교실 - 더하기 편 ]");
		
		long startTime = System.currentTimeMillis(); //0
		//정답입력
		for(int i=0;i<input.length;i++) {
			System.out.println(Nds2.num[i][0]+"+"+Nds2.num[i][1]+"+"+Nds2.num[i][2]+"=");
			input[i]=scan.nextInt();
			if(input[i]==Nds2.num[i][3]) {
				System.out.println("정답입니다.!");
				answer++;
			}else {
				System.out.println("오답입니다.!");
			}
		}
		long endTime = System.currentTimeMillis(); //2000 2  1분-60000
		
		//정답출력
		System.out.print("[ 정답 ] : ");
		for(int i=0;i<input.length;i++) {
			System.out.print(Nds2.num[i][3]+" ");
		}
		System.out.println();
		System.out.print("[ 입력 ] : ");
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		System.out.println("[ 정답개수 ] : "+answer);
		// 4000 - 1000 = 3000/1000 3초
		System.out.println("[ 문제해결시간 ] :"+((endTime-startTime)/1000.0));
		

	}

}
