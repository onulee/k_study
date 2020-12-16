package day18;

public class Number {
	static int[] arr = new int[10]; //클래스 변수
	
	static{
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10)+1; //1-10
		}
		
	}//클래스 초기화블럭
	
	//생성자
	Number(){
		
	}

}
