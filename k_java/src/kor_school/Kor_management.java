package kor_school;

import java.util.ArrayList;
import java.util.Scanner;

public class Kor_management {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 학생정보 학번,이름,전화번호,학년,학과,주소,전공교수
		// 학생성적 학번-,국어,영어,수학,합계,평균,등수
		ArrayList<Student> stu_list = new ArrayList<Student>(); // Object-최고조상
		ArrayList<Stu_score> score_list = new ArrayList<Stu_score>();
		Excute ex = new Excute();
		Score_excute se = new Score_excute();

		//무한반복
		loop1:while(true) {
			int choice = ex.main_menu(); //main_menu 출력메소드

			switch (choice) {
			case 1:
				//학생정보 입력메소드 (stu_list)
				ex.input_student(stu_list); 
				break;
			case 2:
				//학생정보 출력메소드(stu_list)
				ex.outputAll_student(stu_list); 
				break;
			case 3:
				//학생정보 검색메소드
				ex.search_student(stu_list);
				break;
			case 4:
				//학생성적 입력메소드
				se.input_score(score_list, stu_list);
				break;
			case 5:
				//학생성적 출력메소드
				se.outputAll_score(score_list,stu_list);
				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			
			case 0:

				break;

			}//switch
		}//while
	}//main

}//class
