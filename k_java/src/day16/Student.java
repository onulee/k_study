package day16;

public class Student {
	// 번호,이름,국어,영어,수학,합계,평균,등수

	Student(){ }
	Student(int stu_num,String name,int kor,int eng,int math){
		this.stu_num = stu_num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math; //합계
		this.avg = this.total/3.0;     //평균
	}
	
	int stu_num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;

}
