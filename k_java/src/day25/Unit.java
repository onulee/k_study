package day25;

public abstract class Unit { //추상클래스
	int x, y;
	abstract void move(int x,int y); //추상메소드
	void stop() {       }
	
	@Override
		public String toString() {
			return "Unit 클래스";
		}
}
