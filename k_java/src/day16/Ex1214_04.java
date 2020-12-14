package day16;

import java.util.Scanner;

public class Ex1214_04 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// [ 학생성적프로그램 ]
		// 1.학생입력
		// 2.학생출력
		// 3.학생성적수정
		// 0.종료
		// 학생입력 -> 중간에 빠져나올수 있도록 구현
		Student[] stu = new Student[10];
		int choice=0;  //switch선택번호 
		int count=0;   //학생수
		
		// while(true)
		loop1:while(true) {
			choice = screen(); //첫화면 출력메소드 - choice
			
			//switch문 
			switch(choice) {
			case 1:
				count = input(count,stu);
				break;
			case 2:
				output(count,stu); //학생성적출력메소드-int count,Student[] stu
				break;
			case 3:
				System.out.println("[ 학생성적수정 ]");
				System.out.println("학생이름을 입력하세요.>>");
				int found_num=0; //해당번호
				int check=0; // 해당학생이 있는지 없는지 체크
				String name = scan.nextLine();
				// Student[] stu - stu[0].name,stu[1].name,stu[2].name //3명
				// 학생검색
				for(int i=0;i<count;i++) {
					if(name.equals(stu[i].name)) {
						System.out.println("찾는 학생이 있습니다.!");
						found_num = i; //
						check=1;
						break;
					}
				}
				//학생성적수정
				if(check==1) {
					System.out.println("[ 변경과목 선택 ]");
					System.out.println("1.국어");
					System.out.println("2.영어");
					System.out.println("3.수학");
					System.out.println("변경하려는 과목을 선택하세요.(0.이전화면 이동)>>");
					choice = scan.nextInt();
					switch(choice) {
					
					case 1:
						System.out.println("현재점수 : "+stu[found_num].kor);
						System.out.println("수정할 국어점수를 입력하세요.>>");
						stu[found_num].kor = scan.nextInt();
						// 합계,평균 수정되어야 함.
						stu[found_num].total=stu[found_num].kor+stu[found_num].eng+stu[found_num].math;
						stu[found_num].avg=stu[found_num].total/3.0;
						System.out.println("점수가 수정되었습니다.!");
						break;
					case 2:
						
						break;
					case 3:
						
						break;
					case 0:
						
						break;
					
					
					}
					
					
					
					
					
					
				}else {
					System.out.println("찾는 학생 이름이 존재하지 않습니다. 다시 입력해주세요.!");
				}
				
				
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.!");
				break loop1;
			}//switch
		}//while
	}//main
	
	
	
	
	
	
	
	// 학생성적출력메소드 : 리턴타입-void, 매개변수-int count,Student[] stu
	static void output(int count,Student[] stu) {
		for(int i=0;i<count;i++) {
			System.out.print(stu[i].stu_num+" "+stu[i].name+" "+stu[i].kor+" "+stu[i].eng+" "+stu[i].math+" "+stu[i].total+" ");
			System.out.printf("%.2f %n",stu[i].avg);
		}
	}
	
	// 메뉴 출력화면 : 리턴타입-int 
	static int screen() {
		System.out.println("[ 학생성적프로그램 ]");
		System.out.println("1.학생입력");
		System.out.println("2.학생출력");
		System.out.println("3.학생성적수정");
		System.out.println("0.종료");
		System.out.println("--------------------------");
		System.out.println("원하는 번호를 입력하세요.(0.종료)>>");
		int choice = scan.nextInt();
		return choice; 
	}
	
	//학생성적입력메소드 : 리턴타입-int count, 매개변수-count,stu 
	static int input(int count,Student[] stu){
		//입력 input(count,stu) -> int count,Student[] stu
		for(int i=count;i<stu.length;i++) {
			System.out.println("번호를 입력하세요.(0.이전화면 이동)>>");
			int stu_num = scan.nextInt();
			scan.nextLine();
			if(stu_num==0) {
				break; //이전화면으로 이동
			}
			System.out.println("이름을 입력하세요.>>");
			String name = scan.nextLine();
			System.out.println("국어점수를 입력하세요.>>");
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.>>");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.>>");
			int math = scan.nextInt();
			//객체생성
			stu[i]=new Student(stu_num,name,kor,eng,math);
			count++; //학생수 1증가
		}
		return count;
	}
	
	
}//class
