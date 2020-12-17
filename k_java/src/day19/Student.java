package day19;

public class Student {
	{
		count++;
		num="s"+ String.format("%03d",count);
	}
	Student(){}
	Student(String name,int kor,int eng,int math){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.total=kor+eng+math;
		this.avg=this.total/3.0;
	}
	static int count;
	String num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;

}
