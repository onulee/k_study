package day12;

public class Ex1208_04 {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.stu_num=1;
		s1.name="홍길동";
		s1.kor_score=100;
		s1.eng_score=100;
		s1.math_score=99;
		s1.total=s1.kor_score+s1.eng_score+s1.math_score;
		s1.avg=s1.total/3.0;
		s1.rank=0;
		
		Student s2 = new Student();
		s2.stu_num=2;
		s2.name="이순신";
		s2.kor_score=80;
		s2.eng_score=80;
		s2.math_score=79;
		s2.total=s2.kor_score+s2.eng_score+s2.math_score;
		s2.avg=s2.total/3.0;
		s2.rank=0;
		
		int rank_count=1;
		if(s1.total<s2.total) {
			rank_count++;
		}
		s1.rank=rank_count;
		
		rank_count=1;
		if(s1.total>s2.total) {
			rank_count++;
		}
		s2.rank=rank_count;
		
		System.out.println("[성적 프로그램]");
		System.out.printf("%d\t%s\t%d\t%d\t%.2f \n",s1.stu_num,s1.name,s1.kor_score,s1.total,s1.avg);
		System.out.printf("%d\t%s\t%d\t%d\t%.2f \n",s2.stu_num,s2.name,s2.kor_score,s2.total,s2.avg);
		
		
		
		
		// s3,s4,s5...
		
		Student[] stu = new Student[5];
		stu[0]=new Student();
		stu[1]=new Student();
		stu[2]=new Student();
		stu[3]=new Student();
		stu[4]=new Student();
		

		

	}

}
