package day22;

public class Ex1222_07 {

	public static void main(String[] args) {
		FireEngine f1 = new FireEngine();
		method(f1); //-> ��
		Ambulance a1 = new Ambulance();
		method(a1); // -> ���̷�
	}
	static void method(Object obj) {  //�ּ� ��, 
		if(obj instanceof FireEngine) {
			FireEngine f = (FireEngine) obj;
			f.water();
		}else if(obj instanceof Ambulance) {
			Ambulance f = (Ambulance) obj;
			f.siren();
		}
	}
	
//	static void method(FireEngine f) {
//		f.water();
//	}
//	
//	static void method(Ambulance f) {
//		f.siren();
//	}
	
	

}
