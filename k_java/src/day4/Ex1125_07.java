package day4;
import java.util.Scanner;

public class Ex1125_07 {

	public static void main(String[] args) {
		
		// 성적프로그램
		// 학생정보 입력 -> 학번 학과 이름 국어 영어 수학
		// 4개 학과 컴퓨터학과 c0001
		// 국문학과 k0001
		// 영문학과 e0001 e0002
		// 수학과 m0001
		// 이외 학과가 들어오면 다시 입력하세요.
		
		int num = 10;
		boolean isEven;
		isEven = (num%2==0)?true:false;
		
		
		Scanner scan = new Scanner(System.in);
		int game_score = scan.nextInt(); 
		
		int lastScore1 = ++game_score;
		System.out.println(lastScore1);
		
		// 입력을 1개 받아 ++, --를 해서 출력을 해보세요.
		
		
		
		

	}

}
