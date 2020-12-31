package day28;
public class Ex1231_01 {

	public static void main(String[] args) {
		Student s1 = new Student("S001","홍길동");
		Student s2 = new Student("S001","홍길동");
		if(s1.equals(s2)) { //다름
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		if(str1.equals(str2)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}

	}

}
