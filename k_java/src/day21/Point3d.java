package day21;

public class Point3d extends Point {

	int z;
	
	Point3d(int x,int y,int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x : "+x+" y: "+y+" z: "+z;
	}
	
	
	
	
}
