package day29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Ex0104_03 {

	public static void main(String[] args) {
		ArrayList<Student> list  = new ArrayList<Student>();
		Student s1 = new Student("s002","홍길동");
		Student s2 = new Student("s001","이순신");
		Student s3 = new Student("s003","이순신");
		list.add(s1);
		list.add(s2);
		list.add(s3);
//		list.add("333");
//		list.add("222");
//		list.add("111");
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				return s1.stu_id.compareTo(s2.stu_id);
			}
		});
		
		Iterator it = list.iterator();
		while(it.hasNext()) { //현재읽어올 데이터가 있는지 확인
			Student s = (Student)it.next(); //(Student) list.get(i)
			System.out.println(s.stu_id+",,"+s.name);  //get=it.next()
		}
		
		
//		list.add("444");
//		Iterator it2 = list.iterator(); // 1회성 이기에 다시 출력시 재선언
//		while(it2.hasNext()) { //현재읽어올 데이터가 있는지 확인
//			System.out.println(it2.next());  //get=it.next()
//		}
		

	}

}
