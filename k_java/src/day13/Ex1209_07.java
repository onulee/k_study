package day13;

import java.util.Scanner;

public class Ex1209_07 {

	public static void main(String[] args) {
		// [ 프로그램 ]
		// 1.구구단
		// 2.숫자맞추기
		//------------
		// 원하는 번호를 선택하세요.>>
		// 1번 -> 메소드 : 2개받아서 2,5 -> 2~5단까지 출력
		// main 2번 범위 직접입력: 100 매개변수로 전달
		// -> 메소드 1-100까지 숫자 맞추기-10번까지 -> return 결과값
		// main-> 결과값을 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("범위 숫자를 입력하세요.>>");
		int num = scan.nextInt(); // 1000, 10000, 10
		int random = (int)(Math.random()*num)+1; //1-100

	}

}
