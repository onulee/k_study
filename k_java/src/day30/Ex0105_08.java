package day30;

import java.io.File;

public class Ex0105_08 {

	public static void main(String[] args) throws Exception {
		// work1>backup0105
		// work1>backup0105>202101051100.txt
		// work1>backup0105>202101051200.txt
		// work1>backup0105>202101051300.txt �����Ͻÿ�.
		// "��¥\t\t�ð�\t\t����\tũ��\t�̸�"
		
		File d1 = new File("c:/work1/backup0105");
		File f1 = new File("c:/work1/backup0105/202101051100.txt");
		File f2 = new File("c:/work1/backup0105/202101051200.txt");
		File f3 = new File("c:/work1/backup0105/202101051300.txt");
		
		if(d1.exists()==false) {
			d1.mkdirs();
		}
		if(f1.exists()==false) {
			f1.createNewFile();
		}
		if(f2.exists()==false) {
			f2.createNewFile();
		}
		if(f3.exists()==false) {
			f3.createNewFile();
		}
		
		
		
		System.out.println("���� ���� �Ϸ�!");

	}

}
