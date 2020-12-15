package day17;

import java.util.Scanner;

public class Ex1215_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product2[] p = new Product2[10];
		String[] title= {"S_NO","PRONO","이름","사이즈"};
        
		// 내용직접입력 - scan
		for(int i=0;i<p.length;i++) {
			System.out.println("[ 상품생산 공장 ]");
			System.out.println("1.TV 2.세탁기 3.냉장고");
			System.out.println("---------------------------");
			System.out.println((i+1)+"번째 생산하려는 제품의 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			String choice_name="";
			switch(choice) {
			case 1:
				choice_name="TV";
				break;
			case 2:
				choice_name="세탁기";
				break;
			case 3:
				choice_name="냉장고";
				break;
			default:
				break;
			}
			p[i] = new Product2(choice_name,500);
		}
		
		//상단출력
		for(int i=0;i<title.length;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("----------------------------");
		
		//내용출력
		for(int i=0;i<p.length;i++) {
			System.out.print(p[i].serialNo+"\t");
			System.out.print(p[i].proNo+"\t");
			System.out.print(p[i].name+"\t");
			System.out.print(p[i].size+"\t");
			System.out.println();
		}
		

	}

}
