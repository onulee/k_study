package day19;

public class Ex1217_01 {

	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println("t1:"+t1.serialNo); //1
		System.out.println("t1:"+t1.in_serialNo);//1
		
		Test t2 = new Test();
		System.out.println("t2:"+t2.serialNo); //2
		System.out.println("t2:"+t2.in_serialNo);//1
		
		Test t3 = new Test();
		System.out.println("t3:"+t3.serialNo); //3
		System.out.println("t3:"+t3.in_serialNo); //1

	}

}

