package day31;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex0106_04 {

	public static void main(String[] args) throws Exception {
		File f = new File("c:/korea/file2.txt");
		//String f="c:/korea/file2.txt";
		// writer 객체선언
		FileWriter fw = new FileWriter(f,true); 
		// true를 넣으면 내용에 덧붙여서 추가됨.
		
//		fw.write("ArrayList에 Drink 객체를 추가합니다."+"\r\n");
//		fw.write("file1.txt파일에 글자를 입력하고 있습니다."+"\r\n");
//		fw.write("이렇게 글자가 입력이 됩니다."+"\r\n");
		// \r\n \r-커서를 처음으로 옮김, \n은 개행문자
		fw.write("sider,");
		fw.write("900,");
		fw.write("miranda,");
		fw.write("800");
		
		fw.flush(); // 버퍼에 있는 것을 출력시킴
		fw.close();
		
		System.out.println("글자 저장완료!!");
		
		

	}

}
