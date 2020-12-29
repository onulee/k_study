package kor_school;

import java.util.ArrayList;
import java.util.Scanner;

public class Score_excute {
	static Scanner scan = new Scanner(System.in);
	static String[] score_title = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
	
	// 학생성적 입력메소드 (score_list)
	void input_score(ArrayList score_list,ArrayList stu_list) {
		Excute e = new Excute();
		
		// 학생성적 학번,국어,영어,수학,합계,평균,등수
		// 무한반복
		while (true) {
			e.search_student(stu_list); //학생정보검색
			//S001
			System.out.println("학번을 입력하세요.(0.이전화면이동)>>");
			String stu_num = scan.nextLine().toUpperCase(); //s001
			if (stu_num.equals("0")) {
				System.out.println("이전화면으로 이동 ▶▶▶");
				break;
			}
			String name = search_name(stu_num,stu_list); //이름검색
			System.out.println("국어점수를 입력하세요.>>");
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.>>");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.>>>>");
			int math = scan.nextInt();
			scan.nextLine(); // nextInt() Enter키 제거
			
			Stu_score s = new Stu_score(stu_num,kor,eng,math);
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
	
	//이름검색
	String search_name(String stu_num,ArrayList stu_list) {
		String match_name="";
		for(int i=0;i<stu_list.size();i++) {
			Student s = (Student) stu_list.get(i);
			if(stu_num.equals(s.stu_num)) {
				match_name = s.name;
				break;
			}
		}
		return match_name;
	}
	
	void outputAll_score(ArrayList score_list,ArrayList stu_list) {
		for(int i=0;i<score_title.length;i++) {
			System.out.printf("%-4s \t",score_title[i]);
		}
		System.out.println();
		//stu_list 전체출력
		for(int i=0;i<score_list.size();i++) {
			Stu_score s = (Stu_score) score_list.get(i);
			System.out.printf("%-4s \t",s.stu_num);
			String name = search_name(s.stu_num,stu_list);  //이름검색
			System.out.printf("%-4s \t",name);
			System.out.printf("%-4d \t",s.kor);
			System.out.printf("%-4d \t",s.eng);
			System.out.printf("%-4d \t",s.math);
			System.out.printf("%-4d \t",s.total);
			System.out.printf("%-6.2f \t",s.avg);
			System.out.printf("%-4d \t",s.rank);
			System.out.println();
		}
	}//outputAll_score
	
	
	
	

}//class
