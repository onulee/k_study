package day4;
import java.util.Scanner;

public class Ex1126_04 {

	public static void main(String[] args) {
		// 숫자를 입력받아
		// 13이하는 "450원입니다."
		// 14~19 사이는 720원입니다.
		// 20이상은 1250원입니다.
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력하세요.>>");
		int input = scan.nextInt();
		if(input>=20) {
			System.out.println("1250원");
		}else if(input>=14 && input <=19) {
			System.out.println("720원");
		}else {
			System.out.println("450원");
		}

	}

}
