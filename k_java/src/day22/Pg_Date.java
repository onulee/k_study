package day22;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pg_Date {

	public static void main(String[] args) {
		//Date��ü
		// yyyy�� MM�� dd��, yyyy-MM-dd, yy/MM/dd
		// ������ �����Ѵ�. yyyy ��,MM-��,dd-��,HH-�ð�,mm-��,ss-��
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat format2 = new SimpleDateFormat("yy��MM��dd��");
		SimpleDateFormat format3 = new SimpleDateFormat("yyyy�� MM�� dd�� HH��mm��ss��");
	
		Date time = new Date();
		
		String time1 = format1.format(time);
		System.out.println(time1);
		
		String time2 = format2.format(time);
		System.out.println(time2);
		
		String time3 = format3.format(time);
		System.out.println(time3);

	}

}
