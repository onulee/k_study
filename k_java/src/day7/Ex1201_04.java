package day7;

public class Ex1201_04 {

	public static void main(String[] args) {
		// 로또 배열 45개 선언
		int[] ball = new int[45];
		
		//1~45까지 숫자 입력
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		
		int temp=0;  // 임시저장공간
		int j = 0;   // 랜덤숫자저장변수
		// 배열 섞기
		for(int i=0;i<200;i++) {
			j = (int)(Math.random()*45); // 0-44
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		// 로또번호 출력
		System.out.println("[ 로또번호 ]");
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+" ");
		}

	}

}
