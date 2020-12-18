package Student;

import java.util.Scanner;

public class Stu_excute {
	static Scanner scan = new Scanner(System.in);
	
	//학생관리프로그램 - 출력화면 메소드
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
		int choice = scan.nextInt();  //switch선택 변수
		scan.nextLine();
		return choice;
	}
	// 학생정보입력 메소드 - 학생정보객체배열, 학생수 -> return 학생수
	int sinfo_input(Stu_info[] stu_info,int stu_count) {
		//학생정보 무한반복
		while(true) {
			System.out.println("[ 학생정보입력 ]");
			// 이름을 입력하세요.>>
			System.out.println((stu_count+1)+"번째 이름을 입력하세요.(0.이전화면 이동)>>");
			String name = scan.nextLine();
			if(name.equals("0")) {
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
			stu_info[stu_count] = new Stu_info(name,tel,grade,major,address,professor);
			System.out.println("[ 학생정보 ]");
			System.out.println("------------------------");
			System.out.println("학번 : "+stu_info[stu_count].num);
			System.out.println("이름 : "+stu_info[stu_count].name);
			System.out.println("전화번호 : "+stu_info[stu_count].tel);
			System.out.println("학년 : "+stu_info[stu_count].grade);
			System.out.println("학과 : "+stu_info[stu_count].major);
			System.out.println("주소 : "+stu_info[stu_count].address);
			System.out.println("전공교수 : "+stu_info[stu_count].professor);
			System.out.println("------------------------");
			stu_count++; //학생수 증가
		}//while
		return stu_count;
	}//sinfo_input
	
	// 학생전체정보출력 메소드 - 학생정보객체배열, 학생수 -> return 학생수
	void sinfo_allOutput(Stu_info[] stu_info,int stu_count) {
		System.out.println("[ 학생정보출력 ]");
		// 상단타이틀 메소드 - 학번,이름,전화번호,학년,학과,주소,전공교수
		String[] title = {"학번","이름","전화번호","학년","학과","주소","전공교수"};
		for(int i=0;i<title.length;i++) {
			System.out.printf("%s\t",title[i]);	
		}
		System.out.println();
		// 학생정보출력
		for(int i=0;i<stu_count;i++) {
			System.out.printf("%s\t%s\t%s\t%d\t%s\t%s\t%s\t \n",
					stu_info[i].num,stu_info[i].name,stu_info[i].tel,
					stu_info[i].grade,stu_info[i].major,stu_info[i].address,
					stu_info[i].professor);
		}//for
	}//sinfo_output
	
	// 학생1명정보출력 메소드 - 학생정보객체배열, 학생수 -> return 학생수
		void sinfo_oneOutput(Stu_info[] stu_info,int one_count) {
			// 학생정보출력
			for(int i=one_count;i<one_count+1;i++) {
				System.out.printf("%s\t%s\t%s\t%d\t%s\t%s\t%s\t \n",
						stu_info[i].num,stu_info[i].name,stu_info[i].tel,
						stu_info[i].grade,stu_info[i].major,stu_info[i].address,
						stu_info[i].professor);
			}//for
		}//sinfo_output
	
	
	
	
	
	

}//class
