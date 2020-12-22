package day22;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PrintDate {

	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시mm분ss초");

		//Calendar cal1 = new Calendar();
		Calendar cal1 = Calendar.getInstance();
		String cal_time1 = sdf1.format(cal1.getTime());
		System.out.println(cal_time1);
		String cal_time2 = sdf2.format(cal1.getTime());
		System.out.println(cal_time2);
		
		
		//		Date time = new Date();
//		String t1 = sdf1.format(time);
//		System.out.println(t1);
//		System.out.println(time);
//		
//		Date time2 = new Date();
//		String t2 = sdf2.format(time2);
//		System.out.println(t2);
		

	}

}
