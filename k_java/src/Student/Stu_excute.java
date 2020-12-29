package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_excute {
	static Scanner scan = new Scanner(System.in);

	// 학생관리프로그램 - 출력화면 메소드
	int first_print() {
		System.out.println("[ 학생관리프로그램 ]");
		System.out.println("1. 학생정보입력");
		System.out.println("2. 학생정보출력");
		System.out.println("3. 학생검색");
		System.out.println("4. 학생성적입력");
		System.out.println("5. 학생성적출력");
		System.out.println("6. 등수처리");
		System.out.println("7. 학생성적수정");
		System.out.println("0. 종료");
		System.out.println("---------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
		int choice = scan.nextInt(); // switch선택 변수
		scan.nextLine();
		return choice;
	}

	// 학생정보입력 메소드 - 학생정보객체배열, 학생수 -> return 학생수
	ArrayList sinfo_input(ArrayList stu_list) {
		// 학생정보 무한반복
		while (true) {
			System.out.println("[ 학생정보입력 ]");
			// 이름을 입력하세요.>>
			System.out.println((stu_list.size()+1) + "번째 이름을 입력하세요.(0.이전화면 이동)>>");
			String name = scan.nextLine();
			if (name.equals("0")) {
				System.out.println("▶▶▶ 이전화면으로 이동!");
				break;
			}
			System.out.println("전화번호를 입력하세요.>>");
			String tel = scan.nextLine();
			System.out.println("학년을 입력하세요.>>");
			int grade = scan.nextInt();
			scan.nextLine();
			System.out.println("학과를 입력하세요.>>");
			String major = scan.nextLine();
			System.out.println("주소를 입력하세요.>>");
			String address = scan.nextLine();
			System.out.println("전공교수를 입력하세요.>>");
			String professor = scan.nextLine();
			Student s = new Student(name, tel, grade, major, address, professor); 
			stu_list.add(s);
			System.out.println("[ 학생정보 ]");
			System.out.println("------------------------");
			System.out.println("학번 : " + s.num);
			System.out.println("이름 : " + s.name);
			System.out.println("전화번호 : " + s.tel);
			System.out.println("학년 : " + s.grade);
			System.out.println("학과 : " + s.major);
			System.out.println("주소 : " + s.address);
			System.out.println("전공교수 : " + s.professor);
			System.out.println("------------------------");
		} // while
		return stu_list;
	}// sinfo_input

	// 학생전체정보출력 메소드 - 학생정보객체배열 
	void sinfo_allOutput(ArrayList stu_list) {
		System.out.println("[ 학생정보출력 ]");
		// 상단타이틀 메소드 - 학번,이름,전화번호,학년,학과,주소,전공교수
		String[] title = { "학번", "이름", "전화번호", "학년", "학과", "주소", "전공교수" };
		for (int i = 0; i < title.length; i++) {
			System.out.printf("%s \t", title[i]);
		}
		System.out.println();
		// 학생정보출력
		for (int i = 0; i < stu_list.size(); i++) {
			Student s = (Student) stu_list.get(i); //Object->Student
			System.out.printf("%s\t%s\t%s\t%d\t%s\t%s\t%s\t \n", s.num, s.name, s.tel,
					s.grade, s.major, s.address, s.professor);
		} // for
	}// sinfo_output

	// 학생1명정보출력 메소드 - 학생정보객체,1명
	void sinfo_oneOutput(Student s) {
		// 학생정보출력
		System.out.printf("%s\t%s\t%s\t%d\t%s\t%s\t%s\t \n", s.num, s.name, s.tel, s.grade, s.major, s.address,
				s.professor);

	}// sinfo_output

	// 학생검색 메소드 - 학생정보,학생성적 출력
	void sinfo_search(ArrayList stu_list) {
		while(true) {
			System.out.println("[ 학생검색 ]");
			System.out.println("번호 또는 이름을 입력하세요.(0.이전화면 이동)>>");
			String search = scan.nextLine();
			if(search.equals("0")) {
				System.out.println("▶▶▶ 이전화면으로 이동!");
				break;
			}
			int check=0; //검색이 없을 경우
			for(int i=0;i<stu_list.size();i++) {
				Student s = (Student)stu_list.get(i);
				if(s.num.contains(search) || s.name.contains(search)) {
					//학생정보출력
					sinfo_oneOutput(s);
					// 학생성적을 출력하는 메소드 추가해야 됨.
					check=1;
				}
			}
			if(check==0) {
				System.out.println("찾는데이터가 없습니다. 다시 입력하세요.!");
			}
		}//while
	}//sinfo_search
	
	
	
	
	
	

}// class
