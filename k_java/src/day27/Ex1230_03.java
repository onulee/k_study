package day27;

public class Ex1230_03 {

	public static void main(String[] args) {
		int i=0;
		while(i<3) {
			System.out.println("1");
			System.out.println("2");
			try {
				System.out.println("3");
				System.out.println(10/0); //나누기를 0 10/0
				System.out.println("4");
			}catch(IndexOutOfBoundsException e1) {
				System.out.println("첫번째 catch문");
			}catch (Exception e) {
				System.out.println("세번째 catch문");
				System.out.println("접속 원할하지 않습니다. 다시 시도해 주세요.");
				e.printStackTrace();
			}
			System.out.println("6");
			System.out.println("7");
			i++;
		}
		
		
		

	}

}
