package day25;

public class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		System.out.printf("Dropship : [%d,%d] 좌표로 이동! \n",x,y);
	}
	void load() {  
	 System.out.println("사람과 탱크를 태웁니다.");
	}
	void unload() {
		System.out.println("사람과 탱크를 내립니다.");
	}

}
