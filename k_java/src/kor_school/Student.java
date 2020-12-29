package kor_school;

public class Student extends Object {
	
	//학생정보 학번,이름,전화번호,학년,학과,주소,전공교수
	static int count;
	{
		count++;
		stu_num = "S"+String.format("%03d",count );  //S001,S002
	}
	Student(){ }
	Student(String name,String tel,
			int grade,String major,String address,
			String professor){
		
		this.name = name;
		this.tel = tel;
		this.grade = grade;
		this.major = major;
		this.address = address;
		this.professor = professor;
		
	}
	
	String stu_num;
	String name;
	String tel;
	int grade;
	String major;
	String address;
	String professor;

}
