package day4;
import java.util.Scanner;

public class Ex1126_07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int r_num = (int)(Math.random()*10)+1;
		
		int input1 = scan.nextInt();
		int input2 = scan.nextInt();
		int input3 = scan.nextInt();
		
		if(r_num>input1) {
			System.out.println("더 큰수를 입력하세요.");
		}else if(r_num==input1) {
			System.out.println("정답");
		}else {
			System.out.println("더 작은수를 입력하세요.");
		}
		
		if(r_num>input2) {
			System.out.println("더 큰수를 입력하세요.");
		}else if(r_num==input2) {
			System.out.println("정답");
		}else {
			System.out.println("더 작은수를 입력하세요.");
		}
		
		if(r_num>input3) {
			System.out.println("더 큰수를 입력하세요.");
		}else if(r_num==input3) {
			System.out.println("정답");
		}else {
			System.out.println("더 작은수를 입력하세요.");
		}
		
		// 1~10까지 랜덤으로 1개의 숫자 변수에 저장
		// 입력한 숫자가 랜덤 숫자보다 크면 작은수를 입력하셔야 합니다.
		// 입력한 숫자가 작으면 큰수를 입력하셔야 합니다.
		// 입력한 숫자가 같으면 정답
		// 랜덤 숫자 : 
		// 입력한 숫자 : 
		
		// 3개를 입력받아서 확인을 해보세요. 
		
		
		

	}

}
