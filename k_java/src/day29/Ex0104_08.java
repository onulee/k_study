package day29;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex0104_08 {

	public static void main(String[] args) {
		// list - 순서 o, 중복 o
		// set - 순서x,중복x
		// map - 순서x,중복 key x, value o
		//ArrayList set = new ArrayList();
		HashSet set = new HashSet();
		set.add("abc");
		set.add("123");
		set.add("456");
		set.add("abc"); //중복
		set.add("123"); //중복
		set.add(new Drink("D001","데자와",1000));
		set.add(new Drink("D001","데자와",1000));
		
		System.out.println(set);
		
		

	}

}
