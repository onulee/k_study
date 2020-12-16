package day18;

import java.util.Scanner;

public class Ex1216_06 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Student s1=null; // 3명의 학생을 받는 형태로 변경해보세요.
		Ex1216_06 e = new Ex1216_06();
		s1 = e.input(s1); //입력
		e.output(s1); //출력
	}//main
	
	//입력
	Student input(Student s1) {
		System.out.println("[ 성적처리 프로그램 ]");
		System.out.println("이름을 입력하세요.>>");
	    String name = scan.nextLine();
	    System.out.println("국어점수를 입력하세요.>>");
	    int kor = scan.nextInt();
	    System.out.println("영어점수를 입력하세요.>>");
	    int eng = scan.nextInt();
	    System.out.println("수학점수를 입력하세요.>>");
	    int math = scan.nextInt();
	    s1 = new Student(name,kor,eng,math);
		return s1;
	}
	//출력
	void output(Student s1) {
		System.out.print(s1.num+"\t");
	    System.out.print(s1.name+"\t");
	    System.out.print(s1.kor+"\t");
	    System.out.print(s1.eng+"\t");
	    System.out.print(s1.math+"\t");
	    System.out.print(s1.total+"\t");
	    System.out.printf("%.2f \t",s1.avg);
	    System.out.print(s1.rank+"\t");
	}
	
	
	
	

}//class
