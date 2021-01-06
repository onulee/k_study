package day31;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex0106_05 {

	public static void main(String[] args) throws Exception {
		// file1.txt에 
		// scanner입력을 받아 
		// ,sider,900,miranda,800 추가해 보세요.
		String[] title= {"캔음료","가격"};
		Scanner scan = new Scanner(System.in);
	    String[] str = new String[4];
	    String total_name="";
	    FileWriter fw = new FileWriter("c:/korea/file1.txt",true);
		for(int i=0;i<str.length;i++) {
			System.out.println(title[i%2]+" 을/를 입력하세요.>>");
			str[i] = scan.nextLine();
			fw.write(","+str[i]);
		}
		fw.flush();
		fw.close();
		
		System.out.println("저장완료!");
		
		
		
		
		
		
//		int[] arr = {1,2,3,4,5,6,7};
//		String[] str = {"홍길동","이순신","강감찬","유관순","김구"};
//		
//		ArrayList<Drink> list = new ArrayList<Drink>();
//		list.add(new Drink("오란씨",900));
//		list.add(new Drink("데자와",1900));
//		list.add(new Drink("콜라",1000));
//		
//		for(Drink d:list) {
//			System.out.println(d.getD_name());
//			System.out.println(d.getPrice());
//		}
//		
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		for(int i:arr) {
//			System.out.println(i);
//		}
//		
//		for(String s:str) {
//			System.out.println(s);
//		}
		

	}

}
