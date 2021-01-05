package day30;

public class Ex0105_01 {

	public static void main(String[] args) {
		String str1 = new String("홍길동");
		String str2 = new String("이순신");
		String str3 = new String("홍길동");
		
		if(str1==str3) { //참조변수 주소를 서로 비교해서 다름.
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		if(str1.equals(str3)) { //참조변수가 가르키는 주소의 값을 서로 비교해서 다름.
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		

	}

}
