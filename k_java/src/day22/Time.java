package day22;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	Time(){};
	Time(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	int getHour() {
		return hour; 
	}
	void setHour(int hour) {
		if(hour < 0 || hour > 23) {
			System.out.println("�ð��� �߸� �ԷµǾ����ϴ�. �ٽ� �Է��ϼ���!");
			return;
		}
		this.hour = hour;
	}
	

}
