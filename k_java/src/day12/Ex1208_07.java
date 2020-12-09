package day12;

public class Ex1208_07 {

	public static void main(String[] args) {
		// Time클래스를 객체선언 후 시분초를 입력후 출력하시오. 4:44:40
		// int hour,int minute,int second
		// 4시44분40초 출력하시오.
		// 5:50:55
		// 12:03:30
		// 11:10:00 객체배열
		
		// Member클래스 - 아이디/패스워드/이름/전화번호/주소/성별/취미
		// Ex1208_08.java 객체선언해서 3명 회원을 입력받아 출력하시오.
		
		
		
		
		
		Time t = new Time();
		t.hour = 4;
		t.minute = 44;
		t.second = 40;
		
		System.out.println(t.hour+"시"+t.minute+"분"+t.second+"초");

	}

}
