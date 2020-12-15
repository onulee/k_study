package day17;

public class Product {
	static int count=0; //객체선언을 여러개 만들어도 함께 사용하는 변수
	
	Product(){
		count=count+1;
		serialNo = count;
	}
	
	int serialNo;    //생성번호 0001
	String pro_no;      //제품번호 t001,w001,d001,r001,s001
	String pro_name; //제품명 - TV,세탁기,건조기,냉장고,스타일러
	int size;        //크기
	
	

}
