package day29;

import java.util.ArrayList;

public class Ex0104_01 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("111"); //Student-stu_id,name,kor,eng....
		list.add("222");
		list.add("333");
		list.add("222");
		list.add(333);
		System.out.println(list);
		
		
		list.add(1,"777");
		System.out.println("[ 1번방 추가 ]");
		System.out.println(list);

		
		System.out.println("[ list Student객체 추가 ]");
		Student s1 = new Student("s001","홍길동");
		Student s2 = new Student("s002","이순신");
		Student s3 = new Student("s003","홍길동");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i) instanceof String) {
				String s = (String)list.get(i);  //String, Integer
				System.out.println(s);
				continue;
			}else if(list.get(i) instanceof Integer) {
				int num = (int)list.get(i);
				System.out.println(num);
				continue;
			}else if(list.get(i) instanceof Student) {
				Student s = (Student)list.get(i);
				System.out.println(s);
				continue;
			}
			
		}
		
		
		
		
	}

}
