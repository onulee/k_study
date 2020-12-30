package kor_school;

import java.util.ArrayList;
import java.util.Scanner;

public class Score_excute {
	static Scanner scan = new Scanner(System.in);
	static String[] score_title = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
	Excute e = new Excute();

	// 학생성적 입력메소드 (score_list)
	void input_score(ArrayList score_list, ArrayList stu_list) {

		// 학생성적 학번,국어,영어,수학,합계,평균,등수
		// 무한반복
		while (true) {
			System.out.println("[ 학생성적 입력 ]");
			e.search_student(stu_list); // 학생정보검색
			// S001
			System.out.println("** 학생성적을 지금부터 입력합니다. **");
			System.out.println("학번을 입력하세요.(0.이전화면이동)>>");
			String stu_num = scan.nextLine().toUpperCase(); // s001
			if (stu_num.equals("0")) {
				System.out.println("이전화면으로 이동 ▶▶▶");
				break;
			}
			String name = search_name(stu_num, stu_list); // 이름검색
			System.out.println("국어점수를 입력하세요.>>");
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.>>");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.>>>>");
			int math = scan.nextInt();
			scan.nextLine(); // nextInt() Enter키 제거

			Stu_score s = new Stu_score(stu_num, kor, eng, math);
			score_list.add(s); // ArrayList 1개 저장
			System.out.println("[ 학생입력 정보 ]");
			System.out.println("1.학번 : " + s.stu_num);
			System.out.println("2.이름 : " + name);
			System.out.println("3.국어점수 : " + s.kor);
			System.out.println("4.영어점수 : " + s.eng);
			System.out.println("5.수학점수 : " + s.math);
			System.out.println("6.합계 : " + s.total);
			System.out.printf("7.평균 : %.2f \n", s.avg);
		} // while
	} // input_score()

	// 이름검색
	String search_name(String stu_num, ArrayList stu_list) {
		String match_name = "";
		for (int i = 0; i < stu_list.size(); i++) {
			Student s = (Student) stu_list.get(i);
			if (stu_num.equals(s.stu_num)) {
				match_name = s.name;
				break;
			}
		}
		return match_name;
	}

	// 모두 출력
	void outputAll_score(ArrayList score_list, ArrayList stu_list) {
		System.out.println("[ 학생성적 출력 ]");
		for (int i = 0; i < score_title.length; i++) {
			System.out.printf("%-4s \t", score_title[i]);
		}
		System.out.println();
		// stu_list 전체출력
		for (int i = 0; i < score_list.size(); i++) {
			Stu_score s = (Stu_score) score_list.get(i);
			System.out.printf("%-4s \t", s.stu_num);
			String name = search_name(s.stu_num, stu_list); // 이름검색
			System.out.printf("%-4s \t", name);
			System.out.printf("%-4d \t", s.kor);
			System.out.printf("%-4d \t", s.eng);
			System.out.printf("%-4d \t", s.math);
			System.out.printf("%-4d \t", s.total);
			System.out.printf("%-6.2f \t", s.avg);
			System.out.printf("%-4d \t", s.rank);
			System.out.println();
		}
	}// outputAll_score

	// 등수처리
	void rank_process(ArrayList score_list, ArrayList stu_list) {
		System.out.println("[ 학생성적 등수처리 ]");
		for (int i = 0; i < score_list.size(); i++) {
			Stu_score s1 = (Stu_score) score_list.get(i);
			int rank_count = 1;
			for (int j = 0; j < score_list.size(); j++) {
				Stu_score s2 = (Stu_score) score_list.get(j);
				if (s1.total < s2.total) { // 299 < 300
					rank_count++;
				}
			}
			s1.rank = rank_count; // 등수입력
		}
		System.out.println("등수처리가 완료되었습니다.!");
		outputAll_score(score_list, stu_list);

	}

	//학생성적 삭제 메소드
	void delete_score(ArrayList score_list, ArrayList stu_list) {
		while (true) {
			System.out.println("[ 학생성적 삭제 ]");
			e.search_student(stu_list); // excute 학생검색메소드
			System.out.println("삭제하고자 하는 학번을 입력하세요.(0.이전화면이동)>>");
			String stu_num = scan.nextLine().toUpperCase(); // s001
			if (stu_num.equals("0")) {
				System.out.println("이전화면으로 이동 ▶▶▶");
				break;
			}
			int stu_count = 0; // 삭제하려고 하는 학생 미발견시
			for (int i = 0; i < score_list.size(); i++) {
				Stu_score s = (Stu_score) score_list.get(i);
				if (s.stu_num.equals(stu_num)) {
					stu_count++;
					System.out.println("삭제하려는 학생을 찾았습니다. 정말 삭제하시겠습니까?(1.Yes 2.No)");
					int check = scan.nextInt();
					if (check == 1) {
						score_list.remove(i);
						System.out.println("학번 : " + stu_num + " 학생 데이터가 삭제 되었습니다.!");
						break;
					} else {
						System.out.println("삭제가 취소되었습니다.!");
					}
				}
			} // for

			if (stu_count == 0) {
				System.out.println("학생을 찾지 못했습니다. 다시 입력하세요!");
			}
		} // while
	}// delete_score
	
	void modify_score(ArrayList score_list,ArrayList stu_list) {
		System.out.println("[ 학생성적 수정 ]");
		e.search_student(stu_list); // excute 학생검색메소드
		System.out.println("수정하고자 하는 학번을 입력하세요.(0.이전화면이동)>>");
		String stu_num = scan.nextLine().toUpperCase(); // s001
		if (stu_num.equals("0")) {
			System.out.println("이전화면으로 이동 ▶▶▶");
			// break;
		}
		int stu_count = 0; // 수정하려고 하는 학생 미발견시
		for (int i = 0; i < score_list.size(); i++) {
			Stu_score s = (Stu_score) score_list.get(i);
			if (s.stu_num.equals(stu_num)) {
				stu_count++;
				System.out.println("수정하려는 학생을 찾았습니다. 수정하시겠습니까?(1.Yes 2.No)");
				int check = scan.nextInt();
				if (check == 1) {
					//수정
					System.out.println("[ 수정과목 선택 ]");
					System.out.println("1. 국어");
					System.out.println("2. 영어");
					System.out.println("3. 수학");
					System.out.println("0. 이전화면");
					System.out.println("-----------------");
					System.out.println("원하는 번호를 입력하세요.>>");
					int choice = scan.nextInt();
					switch(choice) {
					
					case 1:
						System.out.println("현재 국어점수 : "+s.kor);
						System.out.println("변경하려는 국어점수를 입력하세요.>>");
						s.kor = scan.nextInt();
						s.total = s.kor + s.eng + s.math;
						s.avg = s.total/3.0;
						System.out.println(s.kor+"점으로 국어점수 수정되었습니다.");
						break;
					case 2:
						System.out.println("현재 영어점수 : "+s.eng);
						System.out.println("변경하려는 영어점수를 입력하세요.>>");
						s.eng = scan.nextInt();
						s.total = s.kor + s.eng + s.math;
						s.avg = s.total/3.0;
						System.out.println(s.eng+"점으로 영어점수 수정되었습니다.");
						break;
					case 3:
						System.out.println("현재 수학점수 : "+s.math);
						System.out.println("변경하려는 수학점수를 입력하세요.>>");
						s.math = scan.nextInt();
						s.total = s.kor + s.eng + s.math;
						s.avg = s.total/3.0;
						System.out.println(s.math+"점으로 수학점수 수정되었습니다.");
						
						break;
					case 0:
						System.out.println("이전화면으로 이동합니다.!");
						break; 
					}//switch
					break;
				} else {
					System.out.println("수정이 취소되었습니다.!");
				}//if
			}//if
		}//for
	} //modify_score

}// class
