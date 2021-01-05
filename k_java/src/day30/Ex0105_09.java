package day30;

import java.io.FileInputStream;

public class Ex0105_09 {

	public static void main(String[] args) throws Exception {
		// 파일에서 바이트 단위로 읽어 들일때 사용,예외처리 해야 함.
		FileInputStream fis = new FileInputStream("c:/Test/file1.txt");
		// FileInputStream fis = new FileInputStream("C:\\workspace\\p0105\\src\\day30\\Ex0105_09.java");
		int data=0;
		while((data=fis.read()) != -1 ) { //데이터가 있냐?
			System.out.write(data);  //콘솔에 file1.txt내용을 출력
		}
		fis.close();

	}

}
