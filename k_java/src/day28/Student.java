package day28;

public class Student extends Object implements Cloneable {
	String stu_num;
	String name;
	
	Student(){}
	
	Student(String stu_num,String name){
		this.stu_num = stu_num;
		this.name = name;
	}
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		if(stu_num.equals(s.stu_num) && name.equals(s.name) ) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String print = stu_num+","+name;
		return print;
	}

}
