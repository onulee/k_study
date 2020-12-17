package day19;

import java.util.Scanner;

public class Ex1217_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Á÷»ç°¢Çü ±¸ÇÏ´Â ³ÐÀÌ°ø½Ä ( xÁÂÇ¥ 2°³, yÁÂÇ¥ 2°³ )
		// Á÷¼± ±æÀÌ : 2°³¸¦ ÀÔ·Â¹Þ¾Æ ³ÐÀÌ¸¦ ±¸ÇÏ½Ã¿À.
		Point[] p = new Point[2];
		System.out.println("x ÁÂÇ¥ 2°³¸¦ ÀÔ·ÂÇÏ¼¼¿ä.>>");
		p[0] = new Point();
		p[1] = new Point();
		p[0].x = scan.nextInt();
		p[1].x = scan.nextInt();
		System.out.println("y ÁÂÇ¥ 2°³¸¦ ÀÔ·ÂÇÏ¼¼¿ä.>>");
		p[0].y = scan.nextInt();
		p[1].y = scan.nextInt();
		
		// ¹Øº¯(x0-x1) * ³ôÀÌ(y0-y1)
		double result1 = Math.abs(p[0].x-p[1].x); //Àý´ë°ª
		double result2 = Math.abs(p[0].y-p[1].y);
		double result = result1 * result2;
		
		System.out.println("³ÐÀÌ : "+result);
		System.out.printf("1ÁÂÇ¥ : %d,%d \n",p[0].x,p[0].y);
		System.out.printf("2ÁÂÇ¥ : %d,%d \n",p[0].x,p[1].y);
		System.out.printf("3ÁÂÇ¥ : %d,%d \n",p[1].x,p[0].y);
		System.out.printf("4ÁÂÇ¥ : %d,%d \n",p[1].x,p[1].y);
		
		
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("µÎ Á÷¼±±æÀÌ¸¦ ÀÔ·ÂÇÏ¼¼¿ä.>>");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		System.out.println("Á÷»ç°¢ÇüÀÇ ³ÐÀÌ : "+a*b);

	}

}
