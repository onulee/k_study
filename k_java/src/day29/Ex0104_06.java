package day29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ex0104_06 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Student s1 = new Student("S003","홍길동",99);
		Student s2 = new Student("S001","이순신",100);
		Student s3 = new Student("S005","유관순",90);
		Student s4 = new Student("S002","김유신",88);
		Student s5 = new Student("S004","김구",85);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		for(Student s:list) {
			System.out.println(s);
		}
		// 점수로 정렬하는 방법-int
		Collections.sort(list,new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				if(s1.kor<s2.kor) { // 뒤의 점수가 더 크면 그대로
					return -1;
				}else if(s1.kor>s2.kor) {  //앞의점수가 더 크면 교체
					return 1;
				}
				return 0; // 뒤의 점수가 더 크면 그대로
			}
		});
		
		//학번으로 정렬하는 방법-String
		Collections.sort(list,new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				//return s1.stu_id.compareTo(s2.stu_id); //순차정렬
				return s2.stu_id.compareTo(s1.stu_id); //역순정렬
				// s2가 순번이 낮으면 교체(1), 그렇지 않으면 그대로둠(0,-1)
			}
		});
		
		System.out.println("------------------------");
		for(Student s:list) {
			System.out.println(s);
		}
		
		
		
		
		

	}

}
