package day27;

public class Ex1230_01 {

	public static void main(String[] args) {
		A_Product a = new A_Product(); //A클래스는 B의 핵심변수를 받아 프로그램 진행
		a.methodA(new C_Product()); // A클래스에 B객체를 넘겨줌

	}

}
