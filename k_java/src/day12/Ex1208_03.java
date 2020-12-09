package day12;

public class Ex1208_03 {

	public static void main(String[] args) {
		
		Student s1 = new Student(); //1개 객체선언-인스턴스가 만들어짐.
		s1.stu_num=1;
		s1.name="홍길동";
		s1.kor_score=100;
		s1.eng_score=100;
		s1.math_score=99;
		s1.total=s1.kor_score+s1.eng_score+s1.math_score;
		s1.avg = s1.total/3.0;
		
		Student s2 = new Student();
		s2.stu_num=2;
		
		
//		Tv t = new Tv(); //객체생성
//		t.color="보라색";
//		t.channel = 7;
//		t.channelUp();
//		System.out.println("현재색상 : "+t.color);
//		System.out.println("현재채널번호 : "+t.channel);
//		
//		Tv t2 = new Tv();
//		t2.channel=11;
//		t2.channelDown();
//		System.out.println("현재채널번호 :"+t2.channel);

	}

}
