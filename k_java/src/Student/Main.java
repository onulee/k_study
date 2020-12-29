package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList stu_list = new ArrayList();  //학생정보 list
		ArrayList stu_score = new ArrayList(); //학생성적 list
		Stu_excute ex = new Stu_excute();  // 메소드 분리 객체선언

		// 무한반복
		loop1: while (true) {
			int choice = ex.first_print(); // 학생관리프로그램 - 출력화면
			// 선택번호
			switch (choice) {
			case 1:
				// 학생정보입력 메소드 - 학생정보객체배열 -> return 학생정보객체배열
				stu_list = ex.sinfo_input(stu_list);
				break;
			case 2:
				// 학생정보출력 메소드 - 학생정보객체배열
				ex.sinfo_allOutput(stu_list);
				break;
			case 3:
				// 학생검색 메소드 - 학생정보,학생성적 출력

				
				break;
			case 4:
				// 학생성적입력

				break;
			case 5:
				// 학생성적출력

				break;
			case 6:
				// 등수처리

				break;
			case 7:
				// 학생성적수정-12월 14일 (성적수정)

				break;
			case 0:
				System.out.println("프로그램 종료합니다.!");
				break loop1;
			default:

				break;

			}// switch
		} // while

	}

}
