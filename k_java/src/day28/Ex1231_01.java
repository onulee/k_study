package day28;
public class Ex1231_01 {

	public static void main(String[] args) {
		Student s1 = new Student("S001","ȫ�浿");
		Student s2 = new Student("S001","ȫ�浿");
		if(s1.equals(s2)) { //�ٸ�
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
		
		String str1 = new String("ȫ�浿");
		String str2 = new String("ȫ�浿");
		if(str1.equals(str2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}

	}

}
