package day30;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex0105_10 {

	public static void main(String[] args) throws Exception {
		String ori_file = "C:\\workspace\\p0105\\src\\day30\\web.jpg";
		
		FileInputStream fis = new FileInputStream(ori_file);
		FileOutputStream fos = new FileOutputStream("c:/Test/web.jpg");
		
		int read=0; //1byte
		byte[] readbyte = new byte[100]; //100byte 386kb
		while((read=fis.read(readbyte)) != -1) { //100byte�������� �ִ���?
			fos.write(readbyte,0,read); //���� ���� ��½�Ʈ���� ����
		}
		
		fos.flush();
		fis.close();
		fos.close();
		
		System.out.println("���� �Ϸ�!");

	}

}
