package day18;

import java.util.Scanner;

public class Ex1216_04 {

	public static void main(String[] args) {
		// 영어문제를 출제해서 정답을 맞추는 게임
		// 10문제 - car의 뜻은?
		// 차

		Scanner scan = new Scanner(System.in);
		String[] input = new String[10];
		int answer=0;
		System.out.println("[영어단어 맞추기 프로그램]");
		long startTime = System.currentTimeMillis();
		
		//10번 반복
		for(int i=0;i<input.length;i++) {
			System.out.println(English.eng[i][0]+" 의 뜻은 무엇일까요?");
			input[i] = scan.nextLine().trim().replace(" ", ""); //여백제거 함수
			if(input[i].equals(English.eng[i][1])) {
				System.out.println("정답입니다.!");
				answer++;
			}else {
				System.out.println("오답입니다.!");
			}
		}
		
		long endTime = System.currentTimeMillis();
		
		//출력
		System.out.print("[ 영어1 ] : ");
		for(int i=0;i<input.length;i++) {
			System.out.print(English.eng[i][0]+"\t");
		}
		System.out.println();
		System.out.print("[ 한글1 ] : ");
		for(int i=0;i<input.length;i++) {
			System.out.print(English.eng[i][1]+"\t");
		}
		System.out.println();
		System.out.print("[ 입력 ] : ");
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+"\t");
		}
		System.out.println();
		System.out.println("[ 정답개수 ] : "+answer);
		System.out.println("[ 문제풀이시간 ] : "+(endTime-startTime)/1000.0+" 초");
		
		
		
		
		// [ 정답1 ] : car dog boy
		// [ 정답3 ] : 차 개 소년 ...
		// [ 입력 ] : 차 개 소년 ...
		// [ 정답개수 ] : 4개
		// [ 문제풀이시간 ] : 12.904 초

	}

}
