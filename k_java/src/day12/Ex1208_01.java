package day12;

public class Ex1208_01 {
	

	public static void main(String[] args) {
		//µ¡¼À ÇÁ·Î±×·¥
		int num1=20,num2=10;
		int result=0;
		result = add(num1,num2); //return 30
		System.out.println("°á°ú°ª :"+result);
		
		int num3=30,num4=20;
		add(num3,num4);
		
		int num5=40,num6=2;
		add(num5,num6);
		
		int num7=100,num8=25;
		add(num7,num8);
//		result=num7+num8;
//		System.out.println("°á°ú°ª :"+result);
		
	}//main
	
	//¸Ş¼Òµå 1°³ -> µ«¼À¸Ş¼Òµå
	public static int add(int num1,int num2){
		return num1+num2;
	}
	
	
	
}//class
