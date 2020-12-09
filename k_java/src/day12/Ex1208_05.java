package day12;

import java.util.Scanner;

public class Ex1208_05 {

	public static void main(String[] args) {
		// Student 배열 - s참조변수가 3개 생성
		Scanner scan = new Scanner(System.in);
		Student[] s = new Student[3];
		for(int i=0;i<s.length;i++) {
			s[i] = new Student();
			System.out.println((i+1)+"번째 번호를 입력하세요.>>");
			s[i].stu_num=scan.nextInt();
			scan.nextLine();
			System.out.println("이름을 입력하세요.>>");
			s[i].name=scan.nextLine();
			System.out.println("국어점수를 입력하세요.>>");
			s[i].kor_score=scan.nextInt();
			System.out.println("영어점수를 입력하세요.>>");
			s[i].eng_score=scan.nextInt();
			System.out.println("수학점수를 입력하세요.>>");
			s[i].math_score=scan.nextInt();
			s[i].total=s[i].kor_score+s[i].eng_score+s[i].math_score;
			s[i].avg=s[i].total/3.0;
			s[i].rank=0;
		}
		
		//등수-s1비교
		for(int i=0;i<s.length;i++) {
			int rank_count=1;
			for(int j=0;j<s.length;j++) {
				if(s[i].total<s[j].total) {
					rank_count++;
				}
			}
			s[i].rank=rank_count;
		}
		
		System.out.println("[성적 프로그램]");
		for(int i=0;i<s.length;i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%.2f \n",s[i].stu_num,s[i].name,s[i].kor_score,s[i].total,s[i].avg);
		}
		

	}

}
