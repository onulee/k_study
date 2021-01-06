package day31;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex0106_06 {

	public static void main(String[] args) throws Exception {
		// 학생데이터
		// 1. 홍길동,100,80,70,이순신,99,85,88,강감찬,100,100,87 
		// Scanner 입력받아
		// 2. student/stu1.txt 파일생성 
		// 3. stu1.txt 저장
		// 4. stu1.txt 읽기
		// 5. Stu_score 객체 생성 -> new Stu_score(); ArrayList
		// 6. student/stu2.txt 파일생성
		// 7. 학번,이름,국어,영어,수학,합계,평균,등수 저장할것. 
		
		//1.Scanner 입력
		ArrayList<String> i_list = new ArrayList<String>();
		ArrayList<Stu_score> list = new ArrayList<Stu_score>();
		String[] title_name = {"이름","국어점수","영어점수","수학점수"};
		Scanner scan = new Scanner(System.in);
		int j=0;
		while(true) {              
			System.out.printf("<%d번째> %s(을/를) 입력하세요.(0.종료)>> \n",(j/4+1),title_name[j%4]);
			String s = scan.nextLine();
			if(s.equals("0")) {
				break;
			}
			i_list.add(s);
			j++;
		}
		
		//2.File 생성
		File d1 = new File("c:/student");
		File f1 = new File("c:/student/stu1.txt");
		if(d1.exists()==false) {
			d1.mkdirs();
		}
		if(f1.exists()==false) {
			f1.createNewFile();
		}
		//3.입력받은 학생성적데이터를 파일에 저장
		FileWriter fw = new FileWriter("c:/student/stu1.txt");
		String temp_str ="";
		for(String s:i_list) {
			temp_str=temp_str+s+",";
		}
		// substring(0,5)-자르기
		temp_str = temp_str.substring(0,temp_str.length()-1);
		fw.write(temp_str);
		fw.flush();
		fw.close();
		System.out.println(temp_str);
		
		//4. stu1.txt 읽기
		FileReader fr = new FileReader("c:/student/stu1.txt");
		int read=0;
		char[] ch = new char[100];
		String[] str_arr=null;
		while((read=fr.read(ch))!=-1) {
			String data = new String(ch,0,read);
			str_arr = data.split(",");
		}
		System.out.println(str_arr.length);
		fr.close();
		
		// 5. Stu_score 객체 생성 -> new Stu_score(); ArrayList
		// str_arr[i%4]
		for(int i=0;i<str_arr.length;i+=4) {
			//Stu_score s = new Stu_score("홍길동",100,100,100);
			Stu_score s = new Stu_score(str_arr[i],Integer.parseInt(str_arr[i+1]),
					Integer.parseInt(str_arr[i+2]),Integer.parseInt(str_arr[i+3]));
			list.add(s);
		}
		
		// 등수처리
		for(Stu_score s1:list) {
			int count=1; //등수변수
			for(Stu_score s2:list) {
				if(s1.getTotal()<s2.getTotal()) {
					count++; //등수1증가
				}
			}
			s1.setRank(count); // 등수입력
		}
		
		// 6. student/stu2.txt 파일생성
		File f2 = new File("c:/student/stu2.txt");
		if(f2.exists()==false) {
			f2.createNewFile();
		}
		
		// 7. 학번,이름,국어,영어,수학,합계,평균,등수 저장할것.
		String total_str="";
		for(Stu_score s:list) {
			total_str = total_str + s.getStu_id()+","+s.getName()+","+s.getKor()+","
			+ s.getEng()+","+s.getMath()+","+s.getTotal()+","
			+ s.getAvg()+","+s.getRank()+",";
		}
		//문자열에서 마지막,없애기
		total_str = total_str.substring(0,total_str.length()-1);
		
		fw = new FileWriter("c:/student/stu2.txt");
		fw.write(total_str);
		fw.flush();
		fw.close();
		
		System.out.println(total_str);
		
	}//main

}//class
