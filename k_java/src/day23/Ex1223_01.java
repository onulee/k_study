package day23;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex1223_01 {

	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf3 = new SimpleDateFormat("MM/dd/yyyy");
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		String today = sdf1.format(d);
		String today2 = sdf2.format(c.getTime());
		System.out.println(today);
		System.out.println(today2);

	}

}
