package day25;

public class AudioPlayer extends Player {

	@Override
	void play(int pos) {
		System.out.println(pos+"위치부터 재생합니다. 여기는 AudioPlayer 클래스입니다.");
	}

	@Override
	void stop() {
		System.out.println("현재 위치에서 멈춤!");
	}

}
