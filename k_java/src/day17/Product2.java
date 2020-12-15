package day17;

public class Product2 {
	{
		++count;
		serialNo = "s"+String.format("%04d",count); // s0001
	}
	Product2(){ }
	
	Product2(String name,int size){
		switch(name) {
		case "TV":
			++t_count;
			proNo = "t"+String.format("%03d",t_count); // t001
			break;
		case "ºº≈π±‚":
			++w_count;
			proNo = "w"+String.format("%03d",w_count); // w001
			break;
		case "≥√¿Â∞Ì":
			++r_count;
			proNo = "r"+String.format("%03d",r_count); // r001
			break;
		default:
			break;
		}
		this.name = name;
		this.size = size;
		
		
	}
	static int count;
	static int t_count;
	static int w_count;
	static int r_count;
	String serialNo;
	String proNo;
	String name;
	int size;
	

}
