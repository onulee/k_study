package day21;

public class Point {
	int x;
	int y;
	
	Point(){}
	Point(int x,int y){
		super();
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x:"+x+"y:"+y;
	}

}
