package day25;

public class Tank extends Unit {

	@Override
	void move(int x, int y) {
		System.out.printf("Tank : [%d,%d] 좌표로 이동! \n",x,y);
	}
	void changeMode() { 
		System.out.println("사거리 1m 증가!");
	};

}
