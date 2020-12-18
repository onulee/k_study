package Student;

public class Student {
	
	//생성자
	Student(){ }
	Student(int kor,int eng,int math){
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total/3.0;
	}
	
	String num; //학번 s001,s002,s003
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	
}
