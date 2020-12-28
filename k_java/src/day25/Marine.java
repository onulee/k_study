package day25;

public class Marine extends Unit {

	@Override
	void move(int x, int y) {
		System.out.printf("Marine : [%d,%d] 좌표로 이동! \n",x,y);
	}
	void stimPack() {
		System.out.println("공격력 5 상승!");
	}
	

}
