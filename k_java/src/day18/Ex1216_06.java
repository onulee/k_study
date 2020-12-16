package day18;

import java.util.Scanner;

public class Ex1216_06 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Student[] s = new Student[3];
		Ex1216_06 e = new Ex1216_06();
		e.input(s); //입력
		e.output(s); //출력
	}//main
	
	//입력
	void input(Student[] s) {
		System.out.println("[ 성적처리 프로그램 ]");
		System.out.println("이름을 입력하세요.>>");
	    String name = scan.nextLine();
	    System.out.println("국어점수를 입력하세요.>>");
	    int kor = scan.nextInt();
	    System.out.println("영어점수를 입력하세요.>>");
	    int eng = scan.nextInt();
	    System.out.println("수학점수를 입력하세요.>>");
	    int math = scan.nextInt();
	    s[0] = new Student(name,kor,eng,math);
	}
	//출력
	void output(Student[] s) {
		System.out.print(s[0].num+"\t");
	    System.out.print(s[0].name+"\t");
	    System.out.print(s[0].kor+"\t");
	    System.out.print(s[0].eng+"\t");
	    System.out.print(s[0].math+"\t");
	    System.out.print(s[0].total+"\t");
	    System.out.printf("%.2f \t",s[0].avg);
	    System.out.print(s[0].rank+"\t");
	}
	
	
	
	

}//class
