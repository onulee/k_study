package day21;

public class Ex1221_01 {

	public static void main(String[] args) {
		Deck d = new Deck(); //Card 52장 생성-종류,숫자 모두 포함 
		for(int i=0;i<d.CARD_NUM;i++) {
			Card c = d.pick(i);   //순차적으로 출력
			System.out.println(c.kind+","+c.number);
		}
		//카드섞기
		d.shuffle();
		System.out.println("홍길동 : ");
		for(int i=0;i<6;i++) {
			Card c = d.pick(i);   //홍길동 출력
			System.out.println(c.kind+","+c.number);
		}
		System.out.println("컴퓨터 : ");
		for(int i=6;i<12;i++) {
			Card c = d.pick(i);   //홍길동 출력
			System.out.println(c.kind+","+c.number);
		}
	}

}
