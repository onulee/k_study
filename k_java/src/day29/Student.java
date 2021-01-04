package day29;

public class Student {
	
//	static int count;
//	{
//		count++;
//		this.stu_id = String.format("S%03d", count);
//	}
	Student(){ }
	Student(String stu_id,String name){
		this.stu_id = stu_id;
		this.name = name;
	}
	Student(String stu_id,String name,int kor){
		this.stu_id = stu_id;
		this.name = name;
		this.kor = kor;
	}
	
	String stu_id;
	String name;
	int kor;
	
	@Override
	public String toString() {
		return stu_id+","+name+","+kor;
	}

}
