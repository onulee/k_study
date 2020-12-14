package day15;

public class Ex1211_03 {

	public static void main(String[] args) {
		TestClass.classv=5; // 클래스변수
		TestClass.stMethod(); // 클래스 메소드는 바로 사용
		
		TestClass tc = new TestClass();
		tc.instv=10; //인스턴스변수
		tc.inMethod(); //인스턴스 메소드는 반드시 객체선언을 한후 사용가능

	}

}
