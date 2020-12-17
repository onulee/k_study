package day19;

public class Lotto {
	
	// 로또 -> 배열생성, 배열-순차적으로 번호넣기, 섞기, 6개 추출
	int[] ball = new int[45];
	static int count;
	{
		// 순차적 번호넣기
		for(int i = 0;i<ball.length;i++){
			ball[i] = i + 1;
		}
	}
	
	//섞기 메소드
	void shuffle() {
		// 섞기
		int temp = 0; // 저장변수
		int num = 0; // 랜덤숫자
		for(int i = 0;i<200;i++){
			num = (int) (Math.random() * 45);
			temp = ball[0];
			ball[0] = ball[num];
			ball[num] = temp;
		}
	}
	
	void output() {
		System.out.println("[ 전체 로또번호 ]");
		for(int i=0;i<ball.length;i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
	}
	void pick() {
		if(count<45) {
			System.out.print("[ 원픽번호 ] : ");
			System.out.print(ball[count]);
			System.out.println();
			count++;
		}else {
			System.out.println("더 이상 볼이 없습니다.!");
		}
	}
	
	void pick6() {
		// 6개 추출
		System.out.print("[ 로또번호 ] : ");
		for(int i = 0;i<6;i++){
			System.out.print(ball[i] + " ");
		}
		System.out.println();
		
	}


}
