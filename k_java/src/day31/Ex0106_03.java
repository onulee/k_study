package day31;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Ex0106_03 {

	public static void main(String[] args) throws Exception {
		// 1. file1.txt 파일을 읽기
		// 2. Drink객체에 넣기
		// 3. Drink객체를 ArrayList에 넣기
		// 4. ArrayList에 있는 모든 데이터를 출력하시오.
		ArrayList<Drink> list = new ArrayList<Drink>();
		FileReader fr = new FileReader("c:/korea/file1.txt"); //문자파일 생성
		int read=0;
		char[] ch = new char[100];
		String[] arr = null;  //10개 배열저장
		while((read=fr.read(ch))!= -1) { //파일에서 데이터를 읽어와서 비교
			String str = new String(ch,0,read); //파일에서 읽은 데이터를 저장 
			arr = str.split(","); // ,분리
			// String[] arr = {{oranC,900},{Tejava,1000}... }
		}
		// Drink객체 선언 후 ArrayList 넣기
		for(int i=0;i<arr.length;i+=2) {
			Drink d = new Drink(arr[i],Integer.parseInt(arr[i+1]));
			list.add(d);
		}
		
		for(Drink d:list) {
			System.out.println(d.getD_name()+","+d.getPrice());
		}
	}

}
