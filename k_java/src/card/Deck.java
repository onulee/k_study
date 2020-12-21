package card;

public class Deck {
	final int CARD_NUM = 52; //1~10,J,Q,K - 13장*4종류=52장
	Card[] c = new Card[52]; //52장
	String[] kinds = {"SPADE","DIAMOND","HEART","CLOVER"};
	String[] numbers= {"1","2","3","4","5","6","7","8","9","10",
			           "J","Q","K"};
	
	// 생성자-모양,숫자 자동입력
	Deck() {
		int count=0;
		for(int i=0;i<4;i++) {      //모양:SPADE,DIAMOND,HEART,CLOVER
			for(int j=0;j<13;j++) { //숫자:1,2,3 ... 10, J,Q,K
				c[i*13+j] = new Card (kinds[i],numbers[j]);
			}
		}
	}//Deck
	
	//섞기 메소드
	void shuffle() {
		Card temp=null; //Card저장변수
		int ran_num=0; // 랜덤숫자변수
		for(int i=0;i<1000;i++) {
			ran_num = (int)(Math.random()*CARD_NUM); //0-51까지 랜덤숫자
			temp = c[0];
			c[0] = c[ran_num];
			c[ran_num] = temp;
		}
	}
	
	//랜덤 카드 1장 뽑기메소드
	Card pick() {
		int ran_num=(int)(Math.random()*CARD_NUM); // 랜덤숫자변수
		
		
		
		return c[ran_num];
	}
	
	//원하는 카드 1장 뽑기메소드 (0-51) 52
	Card pick(int index) {
		return c[index%CARD_NUM];  //c[52]-error
	}
	
	//모두출력
	Card[] allPick() {
		return c;
	}
	
	
}//class
