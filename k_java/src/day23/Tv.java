package day23;

public class Tv extends Product {

	static int count;
	{
		count++;
		this.t_number=count;
	}
	
	Tv(){
		super("TV",100,10);
	}
	int t_number;
	int monitor_size=70;   //크기
	String color="black";  //색상
	int resolution = 3840; //해상도
	
}
