package day28;

import java.util.Scanner;

public class Ex1231_05 {

	public static void main(String[] args) {
		// --------------------------------------------
		// 복권번호를 입력받아
		// 복권번호 랜덤숫자 1조,2조,3조...9조 -> 9개
		// 0000000 - 9999999 번까지 숫자 중복 가능 ( 8877878 )
		// 당첨번호 : 8조 8827878
		//                   8 1개 1000원
		//                  78 2개 10000원
		//                 878 3개 100000원
		//                7878 4개 1000000원
		//               27878 5개 10000000원
		//              827878 6개 100000000원
		//             8827878 7개 1000000000원
		//            88827878 8개 10000000000원
		// 입력번호 : 1조 
		//          1524771
		// ---------------------
		// 당첨번호 : 0 0
		// 당첨된 번호개수 : 2개
		// 당첨번호 : 88827878
		// 입력번호 : 99927878
		Scanner scan = new Scanner(System.in);
		String lucky1 = ""+ ((int)(Math.random()*9)+1); //1~9
		// 0000000, 0100000
		String lucky2 = String.format("%07d", (int)(Math.random()*1000000)); 
		String lucky_num =  lucky1 + lucky2;
		System.out.println("당첨번호 : "+lucky_num);
		System.out.println("조를 입력하세요.(1-9)>>");
		String input1 = scan.nextLine();
		System.out.println("번호를 입력하세요.(예:1234567 7자리숫자)>>");
		String input2 = scan.nextLine(); 
		//01~9
		String input_num = input1 + input2;
		for(int i=0;i<lucky_num.length();i++) {
			if(lucky_num.substring(i).equals(input_num.substring(i))) {
				System.out.println("당첨되었습니다.!");
				System.out.println(i+1+"등 당첨번호 : "+ lucky_num.substring(i));
				break;
			}
			
		}
		
		    
		
		
		

	}

}
