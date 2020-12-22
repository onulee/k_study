package day22;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pg_Date {

	public static void main(String[] args) {
		//Date객체
		// yyyy년 MM월 dd일, yyyy-MM-dd, yy/MM/dd
		// 포맷을 정의한다. yyyy 년,MM-월,dd-일,HH-시간,mm-분,ss-초
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat format2 = new SimpleDateFormat("yy년MM월dd일");
		SimpleDateFormat format3 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시mm분ss초");
	
		Date time = new Date();
		
		String time1 = format1.format(time);
		System.out.println(time1);
		
		String time2 = format2.format(time);
		System.out.println(time2);
		
		String time3 = format3.format(time);
		System.out.println(time3);

	}

}
