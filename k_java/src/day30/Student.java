package day30;

public class Student {
	private String stu_id;
	private String name;
	
	Student(){}
	Student(String stu_id,String name){
		this.stu_id = stu_id;
		this.name = name;
	}
	
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 학번과 이름이 동시에 맞아야 같은 데이터로 인정
		if(stu_id.equals(((Student)obj).getStu_id()) && 
		   name.equals(((Student)obj).getName())) {
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return (stu_id+name).hashCode();
	}
	
	@Override
	public String toString() {
		return stu_id+","+name;
	}
	

	
	
	
	
}
