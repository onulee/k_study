package day25;

public class AudioPlayer extends Player {

	@Override
	void play(int pos) {
		System.out.println(pos+"��ġ���� ����մϴ�. ����� AudioPlayer Ŭ�����Դϴ�.");
	}

	@Override
	void stop() {
		System.out.println("���� ��ġ���� ����!");
	}

}
