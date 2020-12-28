package day25;

public class Ex1228_01 {

	public static void main(String[] args) {
		//Player p = new Player();
		AudioPlayer a = new AudioPlayer();
		Player p2 = new AudioPlayer();
		p2.play(10); // 부모의 참조변수로 자손의 객체 사용
		
		Player p3 = new AbstractPlayer() {
			@Override
			void stop() {
				System.out.println("main에서 AbstractPlayer 구현함!");
			}
		};
		p3.play(200);
		p3.stop();
		
		

	}

}
