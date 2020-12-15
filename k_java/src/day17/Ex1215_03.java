package day17;

public class Ex1215_03 {

	public static void main(String[] args) {
		// 1.상품 - 1,s001,사이다
		// 2,c001,콜라 / 3,m001,미란다 / 4,s002,사이다
		// 5,s003,사이다 출력해보시오.
		// 기본생성자
		Can c1 = new Can();  // s_no=1;
		c1.d_no="s001";
		c1.name="사이다";
		System.out.println("c1: "+c1.s_no);
		
		
		
		Can c4 = new Can("사이다"); // s_no=4;
		c4.d_no="s002";
		System.out.println("c4: "+c4.s_no);
		

	}

}
