package day22;

final class Singleton {  //상속이 불가능
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
