package day30;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex0105_07 {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("c:/Test/Dir");
		File file1 = new File("c:/Test/file1.txt");
		File file2 = new File("c:/Test/aaa.txt");
		File file3 = new File("c:/Test/file2.txt");
		
		if(dir.exists()==false) { //디렉토리가 있는지 확인
			dir.mkdirs(); //디렉토리 생성
		}
		if(file1.exists()==false) {
			file1.createNewFile();
		}
		if(file2.exists()==false) {
			file2.createNewFile();
		}
		if(file3.exists()==false) {
			file3.createNewFile();
		}
		
		File file_name = new File("C:/프로그램");
		File[] f_contents = file_name.listFiles();
		
		System.out.printf("이름\t\t날짜\t\t\t유형\t\t크기 \n");
		System.out.println("---------------------------------------------------");
		
//		for(int i=0;i<f_contents.length;i++) {
//			System.out.printf("%10s\t",f_contents[i].getName());
//		}
		
		for(File f:f_contents) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
			System.out.printf("%10s\t",f.getName());
			System.out.printf("%s\t",sdf.format(new Date(f.lastModified())));
			if(f.isDirectory()) {
				System.out.printf("<폴더>\t");
			}else {
				System.out.printf("<파일>\t");
				System.out.printf("%d byte",f.length());
			}
			
			System.out.println();
		}
		
		System.out.println("파일이 정상적으로 생성되었습니다.!");

	}

}
