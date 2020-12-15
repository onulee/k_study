package day17;

public class Can {
	static int count;
	static int d_count;
	{
		++count; //count = count+1;
		s_no = count;
	}
	Can(){
		
	}
	
	Can(String name){
		this.d_no = d_no;
		this.name = name;
	}
	
	
	// 사이다,콜라,미란다
	int s_no; // 순차적으로 1씩 증가
	String d_no; // s001,c001,m001
	String name; // 사이다,콜라,미란다
	int size; //크기
	
	void add() {
		System.out.println(size);
	}

}
