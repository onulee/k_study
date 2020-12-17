package day19;

import java.util.Scanner;

public class Ex1217_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Point[] p = new Point[3];
		for(int i=0;i<p.length;i++) {
			System.out.println((i+1)+"번째 좌표값을 입력하세요.>>");
			p[i] = new Point();
			p[i].x = scan.nextInt();
			p[i].y = scan.nextInt();
		}
		double result=0;
		System.out.printf("1번째 좌표 : [ x:%d, y:%d ] \n",p[0].x,p[0].y);
		System.out.printf("2번째 좌표 : [ x:%d, y:%d ] \n",p[1].x,p[1].y);
		System.out.printf("3번째 좌표 : [ x:%d, y:%d ] \n",p[2].x,p[2].y);
		// 제곱근(제곱(a)+제곱(b))	
		result = Math.sqrt(Math.pow(p[0].x-p[1].x, 2)+Math.pow(p[0].y-p[1].y, 2));		
		System.out.printf("두점의 길이 : [ %.2f ] \n",result);
		Math.abs(result); //절대값 구하는 함수
		// 두 점을 입력받아 두 점간의 길이를 구하시오.
		// [0,0] [10,20]
		// [ 두점의 길이 구하는 프로그램 ]
		// 두점의 좌표 : 
		// 두점의 길이 :
		

	}

}
