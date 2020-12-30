package day27;

public class A_Product {
	void methodA(Bridge_In i) {
		// b메소드에서 핵심변수를 전달받아 완성시키는 메소드입니다.
		System.out.println("B클래스에서 핵심변수 전달 받음.");
		i.methodB(); //휘발류차~~~~~
	}

}
