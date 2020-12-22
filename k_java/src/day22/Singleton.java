package day22;

final class Singleton {  //����� �Ұ���
	private static Singleton s = new Singleton();
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance() {
		if(s==null) {
			s = new Singleton();
		}
		return s;
	}
	

}
