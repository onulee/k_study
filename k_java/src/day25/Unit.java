package day25;

public abstract class Unit { //�߻�Ŭ����
	int x, y;
	abstract void move(int x,int y); //�߻�޼ҵ�
	void stop() {       }
	
	@Override
		public String toString() {
			return "Unit Ŭ����";
		}
}
