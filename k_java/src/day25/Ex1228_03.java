package day25;

import java.util.ArrayList;

public class Ex1228_03 {

	public static void main(String[] args) {
		// 배열선언
		ArrayList u_list = new ArrayList(); //Unit
		ArrayList group = new ArrayList();  // group이동
				
		unit_make(0,9,new Marine(),u_list);
		unit_make(0,5,new Tank(),u_list);
		unit_make(0,7,new Dropship(),u_list);
		
		
		// group에 넣기 - Marine 6명
		int count=0;
		for(int i=0;i<u_list.size();i++) { //Marine 6명
			if(count<6) {
				if((Unit)u_list.get(i) instanceof Marine) {
					group.add((Unit)u_list.get(i));
					System.out.println((Unit)u_list.get(i)+" : "+(i+1));
					count++;
				}
			}else {
				break; //7명이면 종료
			}
		}
		
		// group에 넣기 - Tank 4대
		count=0;
		for(int i=0;i<u_list.size();i++) { //Tank 4대
			if(count<4) {
				if((Unit)u_list.get(i) instanceof Tank) {
					group.add((Unit)u_list.get(i));
					System.out.println((Unit)u_list.get(i)+" : "+(i+1));
					count++;
				}
			}else {
				break; //7명이면 종료
			}
		}
		
		//group 이동
		for(int i=0;i<group.size();i++) {
			Unit u = (Unit) group.get(i); //다형성 Marine,Tank->Unit
			u.move(100, 200);
		}
		
		
		// 배열 10,11개 -> arraylist 사용할것
		// 새로운 객체 생성하지 말고, 기존 객체를 이동시킬것. new 객체 사용하면 안됨.
		// Marine1 3명,Tank1 3대 -> x,y 300,500 이동
		// Marine1 6명,Dropship1 7대, Tank 2대 -> x,y 50,50 이동

	}//main
	
	static void unit_make(int start,int end,Unit u,ArrayList u_list) {
		for(int i=start;i<end;i++) {        
			u_list.add(u); //Unit 생성
			System.out.println(u+" : "+(i+1));
		}
		
	}
	

}//class
