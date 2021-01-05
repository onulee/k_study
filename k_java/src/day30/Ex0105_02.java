package day30;

import java.util.HashSet;
import java.util.Iterator;

public class Ex0105_02 {

	public static void main(String[] args) {
		Student s1 = new Student("S001","홍길동");
		Student s2 = new Student("S002","이순신");
		Student s3 = new Student("S001","홍길동");
		Student s4 = new Student("S003","김구");
		//set - 순서X, 중복X
		HashSet<Student> set = new HashSet<Student>();
		
		set.add(s1); //Object
		set.add(s2);
		set.add(s3);
		
		//Ilterator set출력을 해보세요.
		Iterator<Student> it = set.iterator(); //Object
		while(it.hasNext()) {
			Student s = it.next(); // Object
			System.out.println("학번 : "+s.getStu_id());
			System.out.println("이름 : "+s.getName());
		}
		
		set.add(s4);
		it = set.iterator();
		while(it.hasNext()) {
			Student s = it.next(); // Object
			System.out.println("학번 : "+s.getStu_id());
			System.out.println("이름 : "+s.getName());
		}
		
		
		
//		System.out.println(set); //equals,hashcode
//		
//		System.out.println(new String("홍길동").hashCode());
//		System.out.println(new String("홍길동").hashCode());
//		System.out.println("------------------------------------");
//		
//		System.out.println((s1.getStu_id()+s1.getName()).hashCode());
//		System.out.println((s2.getStu_id()+s2.getName()).hashCode());
//		System.out.println((s3.getStu_id()+s3.getName()).hashCode());
//		System.out.println((new String("S002이순신")).hashCode());
//		

	}

}
