package day13;

public class Ex1209_01 {

	public static void main(String[] args) {
		// 4시44분40초 출력하시오. 04:03:00
		// 5:50:55
		// 12:03:30
		// 11:10:00 객체배열
		
		Time[] t = new Time[4];
		t[0]=new Time();
		t[0].hour=4;
		t[0].minute=3;
		t[0].second=0;
		System.out.printf("%02d:%02d:%02d",t[0].hour,t[0].minute,t[0].second);
		
		
		
		
		
		
//		Time t1 = new Time();
//		t1.hour=4;
//		t1.minute=44;
//		t1.second=40;
//		Time t2 = new Time();
//		t2.hour=5;
//		t2.minute=50;
//		t2.second=55;
		
		
		

	}

}
