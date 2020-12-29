package kor_school;

import java.util.ArrayList;
import java.util.Scanner;

public class Excute {
	static Scanner scan = new Scanner(System.in);
	static String[] title = {"학번","이름","전화번호","학년","학과","주소","담당교수"};
	
	int main_menu(){
		System.out.println("[ 학생성적처리프로그램 ]");
		System.out.println("1. 학생정보입력");
		System.out.println("2. 학생정보출력");
		System.out.println("3. 학생검색");
		System.out.println("4. 학생성적입력");
		System.out.println("5. 학생성적출력");
		System.out.println("6. 등수처리");
		System.out.println("7. 학생성적수정");
		System.out.println("8. 학생성적삭제");
		System.out.println("0. 종료");
		System.out.println("-----------------------------");
		System.out.println("원하는 번호를 입력하세요.(0.종료)>>");
		int choice = scan.nextInt();
		scan.nextLine(); //nextInt() Enter키 제거
		return choice;
	} //main_menu()
	
	// 학생정보 입력메소드 (stu_list)
	void input_student(ArrayList stu_list) {
		//학생정보 학번,이름,전화번호,학년,학과,주소,전공교수
		//무한반복
		while(true) {
			System.out.println("학생이름을 입력하세요.(0.이전화면이동)>>");
			String name = scan.nextLine();
			if(name.equals("0")) {
				System.out.println("이전화면으로 이동 ▶▶▶");
				break;
			}
			System.out.println("전화번호를 입력하세요.>>");
			String tel = scan.nextLine();
			System.out.println("학년을 입력하세요.>>");
			int grade = scan.nextInt();
			scan.nextLine(); //nextInt() Enter키 제거
			System.out.println("학과를 입력하세요.>>");
			String major = scan.nextLine();
			System.out.println("주소를 입력하세요.>>");
			String address = scan.nextLine();
			System.out.println("전공교수를 입력하세요.>>");
			String professor = scan.nextLine();
			Student s = new Student(name,tel,grade,major,address,professor);
			stu_list.add(s); // ArrayList 1개 저장
			System.out.println("[ 학생입력 정보 ]");
			System.out.println("1.학번 : "+s.stu_num);
			System.out.println("2.이름 : "+name);
			System.out.println("3.전화번호 : "+tel);
			System.out.println("4.학년 : "+grade);
			System.out.println("5.학과 : "+major);
			System.out.println("6.주소 : "+address);
			System.out.println("7.담당교수 : "+professor);
		}//while
	} //input_student()
	
	void outputAll_student(ArrayList stu_list) {
		for(int i=0;i<title.length;i++) {
			if(i==2) {
				System.out.printf("%-13s \t",title[i]);
			}else {
				System.out.printf("%-4s \t",title[i]);
			}
		}
		System.out.println();
		//stu_list 전체출력
		for(int i=0;i<stu_list.size();i++) {
			Student s = (Student) stu_list.get(i);
			System.out.printf("%-4s \t",s.stu_num);
			System.out.printf("%-4s \t",s.name);
			System.out.printf("%-13s \t",s.tel);
			System.out.printf("%-4d \t",s.grade);
			System.out.printf("%-4s \t",s.major);
			System.out.printf("%-4s \t",s.address);
			System.out.printf("%-4s \t",s.professor);
			System.out.println();
		}
	}//outputAll_student
	
	void outputOne_student(Student s) {
		for (int i = 0; i < title.length; i++) {
			if (i == 2) {
				System.out.printf("%-13s \t", title[i]);
			} else {
				System.out.printf("%-4s \t", title[i]);
			}
		}
		System.out.println();
		// stu_list 1개 출력
		System.out.printf("%-4s \t", s.stu_num);
		System.out.printf("%-4s \t", s.name);
		System.out.printf("%-13s \t", s.tel);
		System.out.printf("%-4d \t", s.grade);
		System.out.printf("%-4s \t", s.major);
		System.out.printf("%-4s \t", s.address);
		System.out.printf("%-4s \t", s.professor);
		System.out.println();
	}// outputOne_student
	
	//학생검색
	void search_student(ArrayList stu_list) {
		//무한반복
		while(true) {
			System.out.println("학생이름 또는 학생번호를 입력하세요.(0.이전화면이동)>>");
			String search = scan.nextLine().trim().toUpperCase();
			if(search.equals("0")) {
				System.out.println("이전화면으로 이동 ▶▶▶");
				break;
			}
			System.out.println("[ 학생정보 검색 ]");
			int check=0;
			for(int i=0;i<stu_list.size();i++) {
				Student s = (Student) stu_list.get(i);
				if(s.stu_num.contains(search) || s.name.contains(search)) {
					outputOne_student(s); //1명출력
					check++;
				}
			}
			if(check==0) {
				System.out.println("학생정보를 찾지 못했습니다. 다시 입력하세요.!");
			}
		}//while
	} //search_student

}
