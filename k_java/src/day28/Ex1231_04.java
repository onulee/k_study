package day28;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex1231_04 {

	public static void main(String[] args) {
		// 성별 : 남 - charAt(7)    1,3-> 남자  2,4 -> 여자
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요.(예:880101-1234567)>>");
		String input = scan.nextLine();
		String[] member_id = input.split("-");
		System.out.printf("주민번호 앞자리 : %s \n",member_id[0]);
		System.out.printf("주민번호 뒷자리 : %s \n",member_id[1]);
		//날짜객체선언
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		Date d = new Date();
		int old=0;
		if(input.charAt(7)=='1' || input.charAt(7)=='2') { // 7째 자리 : 1,2  3,4
			//현재 나이 = 2020-1988+1
			old  = Integer.parseInt(sdf.format(d)) 
					-Integer.parseInt("19"+input.substring(0,2))+1;
		}else {
			//현재 나이 = 2020-2009+1
			old  = Integer.parseInt(sdf.format(d)) 
					-Integer.parseInt("20"+input.substring(0,2))+1;
		}
		System.out.printf("당신의 나이 : %d \n",old);
		
		switch(input.charAt(7)) {
		case '1': case'3':
			System.out.println("성별 : 남자");
		    break;
		case '2': case '4':
			System.out.println("성별 : 여자");
			break;
		}
		
		
		// --------------------------------------------
		// 복권번호를 입력받아 
		// 복권번호 랜덤숫자  1조,2조,3조...9조 -> 9개 
		// 0000000 - 9999999 번까지 숫자 중복 가능 ( 8877878 )
		// 당첨번호 : 8조 8827878
		// 입력번호 : 1조 1524771
		//---------------------
		// 당첨번호 :      0   0
		// 당첨된 번호개수 : 2개
		

	}

}
