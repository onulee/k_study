package card;

import java.util.Scanner;

public class Ex1221_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] ball = new int[45];  //사용하는 로또번호
		int[] ball2 = new int[45]; //로또번호가 뽑혔는지 체크하는 배열
		
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1; //1-45
		}
		
		while(true) {
			System.out.println("1.볼섞기");
			System.out.println("2.1개 뽑기");
			System.out.println("3.3개 뽑기");
			System.out.println("4.6개 뽑기");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				int temp=0;
				int ran_num=0;
				for(int i=0;i<200;i++) {
					ran_num = (int)(Math.random()*45);
					temp = ball[0];
					ball[0]=ball[ran_num];
					ball[ran_num] = temp;
					
					//볼
					temp = ball2[0];
					ball2[0]=ball2[ran_num];
					ball2[ran_num] = temp;
				}
				break;
			case 2:
				while(true) {
					System.out.println("임의의 번호를 입력하세요.(이전화면이동: -1)(0-44)>>");
					int check = scan.nextInt();
					if(check==-1) {
						System.out.println("[ 이전화면 이동 ]");
						break;
					}
					
					// 로또번호 뽑혔는지 체크 - ball2배열
					if(ball2[check]==0) { //0이면 안뽑은 것
						System.out.println("출력 로또번호 : "+ball[check]);
						ball2[check]=1;
					}else { // 1이면 뽑은 것
						System.out.println("선택한 로또번호는 출력이 되었습니다. 다시 입력하세요.!");
					}
				}
				break;
			case 3:
				//6개 뽑기
				System.out.println("[ 6개 뽑기 ]");
				int count=0;
				for(int i=0;i<6;i++) {
					// 로또번호 뽑혔는지 체크 - ball2배열
					if(count<45) {
						if(ball2[count]==0) { //0이면 안뽑은 것
							System.out.println("출력 로또번호 : "+ball[count]);
							ball2[count]=1;
						}else { // 1이면 뽑은 것
							i--;
						}
						count++;
					}else {
						System.out.println("더이상 뽑을 번호가 없습니다.!");
						break;
					}
				}
				
				
				break;
				
			
			}
			
		}
		
		
		
		

	}

}
