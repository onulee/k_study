package day18;

import java.util.Scanner;

public class Ex1216_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int answer=0;
		int[] input = new int[10];
		System.out.println("[ 10개의 숫자 맞추기 게임 ]");
		System.out.println("1-10까지의 랜덤숫자 10개 있습니다.");
		System.out.println("10번을 입력하여 몇개가 맞는지 확인하세요.!");

		for (int i = 0; i < input.length; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력하세요.>>");
			input[i] = scan.nextInt();
		}
		
		//비교
		for(int i=0;i<input.length;i++) {
			if(input[i]==Number.arr[i]) {
				answer++;
			}
		}

		// 입력한 숫자 출력
		System.out.print("[ 입력한 숫자 ] : ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
		// 랜덤 숫자 출력
		System.out.print("[  랜덤 숫자 ] : ");
		for (int i = 0; i < Number.arr.length; i++) {
			System.out.print(Number.arr[i] + " ");
		}
		System.out.println();
		System.out.print("[ 정답개수 ] : "+answer +"\n");

	}

}
