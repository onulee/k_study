package day19;

public class Ex1217_03 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		// c1 -> center-0,0,r-100
		System.out.println("c1ÀÇ ÁÂÇ¥ : "+c1.center.x+","+c1.center.y);
		System.out.println("c1 ¹İÁö¸§ : "+c1.r);
		System.out.println("c1ÀÇ ³ĞÀÌ : "+c1.area);
		
		Circle c2 = new Circle(new Point(150,150),50);
		// 150,150 50
		System.out.println("c2ÀÇ ÁÂÇ¥ : "+c2.center.x+","+c2.center.y);
		System.out.println("c2 ¹İÁö¸§ : "+c2.r);
		System.out.println("c2ÀÇ ³ĞÀÌ : "+c2.area);
		
		Point[] p = { 
				new Point(100,100),
				new Point(140,50),
				new Point(200,100)
		};
		
		
		Trangle t = new Trangle(p);
		

	}

}
