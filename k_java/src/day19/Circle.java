package day19;

public class Circle extends Shape {
	
	Point center; // 원중심축
	int r;
	double area;
	
	
	Circle(){
		this(new Point(0,0),100); // 원넓이 : 3.14 * 100 * 100 = 31400
		//원둘레 2 * 100 * 3.14 = 628
	}
	
	Circle(Point center,int r){
		this.center = center;
		this.r = r;
		this.area = 3.14 * Math.pow(this.r, 2); //Math.pow:거듭제곱
	}
	

}
