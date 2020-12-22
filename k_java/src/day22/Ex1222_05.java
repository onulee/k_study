package day22;

public class Ex1222_05 {

	public static void main(String[] args) {

		CaptionTv c1 = new CaptionTv();
		c1.power=false;
		c1.channel=7;
		c1.power(); //true
		c1.channelUp(); //8
		c1.channelDown();//7
		c1.text="조제 사랑해요~!";
		c1.caption();
		
		Tv t = new Tv();
		t.power=false;
		t.channel=100;
		t.power(); //true
		t.channelUp(); //101
		t.channelDown(); // 100
		//t.text="자막넣기";
		//t.caption();
		
		CaptionTv c3;
		c3 = (CaptionTv) t;
		t.power=false;
		t.channel=100;
		t.power(); //true
		t.channelUp(); //101
		t.channelDown(); // 100
		
		
		Tv t1 = new CaptionTv();  //다형성
		t1.power=false;
		t1.channel=10;
		t1.power(); //true
		t1.channelUp(); //11
		t1.channelDown();//10
		//t1.text="조제 사랑해요~!";
		//t1.caption();
		
		CaptionTv c2;
		c2 = (CaptionTv) t1;
		c2.power=false;
		c2.channel=10;
		c2.power(); //true
		c2.channelUp(); //11
		c2.channelDown();//10
		c2.text="조제 사랑해요~!";
		c2.caption();
		 
		
		
		
		
		
		
		
		

	}

}
