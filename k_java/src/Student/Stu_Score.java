package Student;

public class Stu_Score {
	
	//������
	Stu_Score(){ }
	Stu_Score(int kor,int eng,int math){
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total/3.0;
	}
	
	String num; //�й� s001,s002,s003
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	
}
