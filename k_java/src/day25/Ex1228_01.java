package day25;

public class Ex1228_01 {

	public static void main(String[] args) {
		//Player p = new Player();
		AudioPlayer a = new AudioPlayer();
		Player p2 = new AudioPlayer();
		p2.play(10); // �θ��� ���������� �ڼ��� ��ü ���
		
		Player p3 = new AbstractPlayer() {
			@Override
			void stop() {
				System.out.println("main���� AbstractPlayer ������!");
			}
		};
		p3.play(200);
		p3.stop();
		
		

	}

}
