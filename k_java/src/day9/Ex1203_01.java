package day9;

import java.util.Scanner;

public class Ex1203_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 9,5 배열 생성
		String[][] score = new String[9][5];
		// 1차원배열생성(1-45까지 숫자)
		String[] arr = new String[45];
		for (int i = 0; i < 45; i++) {
			arr[i] = "" + (i + 1); // 문자열입력
			// ""+0+1
		}
		// 1차원배열 섞기
		String temp = "";
		int k = 0;
		for (int i = 0; i < 200; i++) {
			k = (int) (Math.random() * 45);
			temp = arr[0];
			arr[0] = arr[k];
			arr[k] = temp;
		}
		// 2. 랜덤숫자 입력 (중복불가) 1-45까지 숫자입력
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				score[i][j] = arr[5 * i + j]; // 0-44 -> 45개
				// score[i][j] =""+5*i+j+1;
				// score[i][j] =""+(int)(Math.random()*50)+1;
			}
		}
		
		// 좌표입력,출력 무한반복
		while(true) {
			// 좌표 출력시 상단 표시
			System.out.println("\t\t" + "[ 좌표확인 프로그램 ]");
			for (int i = 0; i < 5; i++) {
				System.out.print("\t" + "[" + i + "]");
			}
			System.out.println();
			System.out.println("--------------------------------------------");
			// 출력
			for (int i = 0; i < 9; i++) {
				System.out.print("[" + i + "]|" + "\t");
				for (int j = 0; j < 5; j++) {
					System.out.print(score[i][j] + "\t");
				}
				System.out.println();
			}

			// 3. 좌표입력
			System.out.println("X좌표를 입력하세요.(X좌표:0-9,종료:-1)>>");
			int x = scan.nextInt();
			// 종료 체크
			if(x==-1) {
				System.out.println("프로그램을 종료합니다!");
				break;
			}
			// 0-9사이 의 정수 입력체크
			if(x<=-2 && x>=10) {
				System.out.println(x+" 값은 0-9까지의 정수가 아닙니다. 다시입력하세요!");
				continue;
			}
			System.out.println("Y좌표를 입력하세요.(Y좌표:0-4)>>");
			int y = scan.nextInt();
			// 0-4사이의 정수 입력체크
			if(x<0 && x>4) {
				System.out.println(y+" 값은 0-4까지의 정수가 아닙니다. 다시입력하세요!");
				continue;
			}

			// 숫자를 x로 변경하는 구문
			loop1: for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 5; j++) {
					if (x == i && y == j) {
						// x표시 된 것 체크하는 구문
						if(score[i][j].equals("X")) {
							System.out.println("입력하신 좌표입니다. 다시 입력해주세요.!");
							break loop1;
						}
						score[i][j] = "X";
						break loop1;
					}
				}
			}//for
			
		}//while

	}//main

}//class
