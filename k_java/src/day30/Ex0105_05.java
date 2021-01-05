package day30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex0105_05 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		Student[] stu = new Student[5];
		stu[0] = new Student("S001","È«±æµ¿");
		stu[1] = new Student("S002","±èÀ¯½Å");
		stu[2] = new Student("S003","À¯°ü¼ø");
		stu[3] = new Student("S004","ÀÌ¼ø½Å");
		stu[4] = new Student("S005","±è±¸");
		
		map.put("S1", stu[0]);
		map.put("S2", stu[1]);
		map.put("S3", stu[2]);
		map.put("S4", stu[3]);
		map.put("S5", stu[4]);
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry e =  (Map.Entry)it.next(); // Map <- Object
			System.out.println("Map Å° : "+e.getKey());
			System.out.println("Map value student : "+((Student)e.getValue()).getStu_id());
		}

	}

}
