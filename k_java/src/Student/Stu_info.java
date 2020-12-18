package Student;

public class Stu_info {
	// 1. 학생정보입력 - 학번,이름,전화번호,학년,학과,주소,전공교수
	static int count;
	{ // 초기화블럭
		count++;
		num = "s"+String.format("%03d", count); //s001 s002...
	}
	
	Stu_info(){ }
	Stu_info(String name,String tel,int grade,String major,String address,String professor){
		this.name = name;
		this.tel = tel;
		this.grade = grade;
		this.major =major;
		this.address = address;
		this.professor = professor;
	}
	String num;
	String name;
	String tel;
	int grade;
	String major;
	String address;
	String professor;

}
