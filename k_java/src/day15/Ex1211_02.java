package day15;

public class Ex1211_02 {

	public static void main(String[] args) {
		// 클래스 메소드에 300L,200L 출력
		System.out.println(MyMath2.add(300L,200L));
		// 인스턴스 메소드에 50L,10L을 넣고 출력을 해보세요.
		MyMath2 m = new MyMath2();
		m.a=50L;
		m.b=10L;
		System.out.println(m.add());
		

	}

}
