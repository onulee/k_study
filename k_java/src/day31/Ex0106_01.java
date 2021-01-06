package day31;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex0106_01 {

	public static void main(String[] args) throws Exception  {
		// korea ���� -> dir���� ����
		// korea>file1.txt
		// korea>file2.txt
		// korea>file3.txt �����Ͻÿ�.
		
		// korea������ �ִ�
		// �̸�  ����  ũ�� ��¥ �� ����Ͻÿ�.
		
		File dir = new File("c:/korea/dir");
		File file1 = new File("c:/korea/file1.txt");
		File file2 = new File("c:/korea/file2.txt");
		File file3 = new File("c:/korea/file3.txt");
		
		if(dir.exists()==false) {
			dir.mkdirs();
		}
		if(file1.exists()==false) {
			file1.createNewFile();
		}
		if(file2.exists()==false) {
			try {
				file2.createNewFile(); 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(file3.exists()==false) {
			try {
				file3.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// �̸�  ����  ũ�� ��¥ �� ����Ͻÿ�.
		File file_all = new File("c:/korea");
		File[] f_contents = file_all.listFiles();
		
		System.out.println("�̸�\t����\tũ��\t��¥");
		System.out.println("---------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:dd");
		
		for(int i=0;i<f_contents.length;i++) {
			System.out.print(f_contents[i].getName()+"\t");
			if(f_contents[i].isDirectory()) {
				System.out.print("DIR\t");
			}else {
				System.out.print("FILE\t");
			}
			System.out.print(f_contents[i].length()+"\t");
			System.out.print(sdf.format(new Date(f_contents[i].lastModified())));
			System.out.println();
		}
	}

}
