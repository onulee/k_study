package day14;

import java.util.Scanner;

public class Ex1210_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student s1 = new Student();
		
		int stu_num=0;
		
		//무한반복
		loop1:while(true) {
			System.out.println("[ 학생정보 프로그램 ]");
			System.out.println("1. 실행");
			System.out.println("2. 종료");
			System.out.println("--------------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				s1.stu_num = change(stu_num); // 학생번호 입력받아 리턴
				change2(s1); // 참조변수 주소를 넘겨서 나머지 정보를 받겠습니다.
				System.out.print(s1.stu_num+" ");
				System.out.print(s1.name+" ");
				System.out.print(s1.kor+" ");
				System.out.print(s1.eng+" ");
				System.out.print(s1.math+" ");
				System.out.print(s1.total+" ");
				System.out.print(s1.avg+" ");
				System.out.print(s1.rank+" ");
				System.out.println();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.!");
				break loop1;
			}//switch
		}//while
	}//main
	
	static int change(int stu_num) {
		Scanner scan = new Scanner(System.in);
		System.out.println("번호를 입력하세요.>>");
		stu_num = scan.nextInt();
		return stu_num;
	}
	static void change2(Student s1) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요.>>");
		s1.name = scan.nextLine();
		System.out.println("국어점수를 입력하세요.>>");
		s1.kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.>>");
		s1.eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.>>");
		s1.math = scan.nextInt();
		s1.total=s1.kor+s1.eng+s1.math;
		s1.avg=s1.total/3.0;
	}

}
