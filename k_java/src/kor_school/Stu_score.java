package kor_school;

public class Stu_score extends Object{
	//�й�-,����,����,����,�հ�,���,���
	
	Stu_score(){ }
	Stu_score(String stu_num,int kor,int eng, int math){
		this.stu_num = stu_num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	String stu_num;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;

}
