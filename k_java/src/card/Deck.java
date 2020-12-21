package card;

public class Deck {
	final int CARD_NUM = 52; //1~10,J,Q,K - 13��*4����=52��
	Card[] c = new Card[52]; //52��
	String[] kinds = {"SPADE","DIAMOND","HEART","CLOVER"};
	String[] numbers= {"1","2","3","4","5","6","7","8","9","10",
			           "J","Q","K"};
	
	// ������-���,���� �ڵ��Է�
	Deck() {
		int count=0;
		for(int i=0;i<4;i++) {      //���:SPADE,DIAMOND,HEART,CLOVER
			for(int j=0;j<13;j++) { //����:1,2,3 ... 10, J,Q,K
				c[i*13+j] = new Card (kinds[i],numbers[j]);
			}
		}
	}//Deck
	
	//���� �޼ҵ�
	void shuffle() {
		Card temp=null; //Card���庯��
		int ran_num=0; // �������ں���
		for(int i=0;i<1000;i++) {
			ran_num = (int)(Math.random()*CARD_NUM); //0-51���� ��������
			temp = c[0];
			c[0] = c[ran_num];
			c[ran_num] = temp;
		}
	}
	
	//���� ī�� 1�� �̱�޼ҵ�
	Card pick() {
		int ran_num=(int)(Math.random()*CARD_NUM); // �������ں���
		
		
		
		return c[ran_num];
	}
	
	//���ϴ� ī�� 1�� �̱�޼ҵ� (0-51) 52
	Card pick(int index) {
		return c[index%CARD_NUM];  //c[52]-error
	}
	
	//������
	Card[] allPick() {
		return c;
	}
	
	
}//class
