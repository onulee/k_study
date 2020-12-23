package day23;

public class Ex1223_02 {

	public static void main(String[] args) {
		// x=200, 자손 객체 출력
		Parent p = new Child(); //다형성-부모의 참조변수로 자손의 객체를 다루는 것
		System.out.println("p.x : "+p.x);
		p.method();

	}

}
