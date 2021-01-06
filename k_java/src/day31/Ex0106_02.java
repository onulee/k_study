package day31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex0106_02 {

	public static void main(String[] args) throws Exception {
		// FileInputStream - 문자,음성,이미지,영상 
		// 문자가능
		FileReader fr = new FileReader("c:/korea/file1.txt");
		int read=0;
		char[] ch = new char[100]; //char-2byte/ 2*100=200byte
		String[] str=null;
		while(((read=fr.read(ch)) != -1)) {
			String data = new String(ch,0,read); //100,0,96
			//oranC,900,Tejava,1000,Pepsi,1200
			str = data.split(",");
			//charAt-1개, subString-0,3 ,
			//,분리해서 각각의 배열담아 출력을 해보세요.
			System.out.println(data);
		}
		fr.close();
		
		for(String s:str) {
			System.out.println("배열 : "+s);
		}
		
		System.out.println("읽기 완료!");

	}

}
