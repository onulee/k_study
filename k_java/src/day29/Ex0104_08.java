package day29;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex0104_08 {

	public static void main(String[] args) {
		// list - ���� o, �ߺ� o
		// set - ����x,�ߺ�x
		// map - ����x,�ߺ� key x, value o
		//ArrayList set = new ArrayList();
		HashSet set = new HashSet();
		set.add("abc");
		set.add("123");
		set.add("456");
		set.add("abc"); //�ߺ�
		set.add("123"); //�ߺ�
		set.add(new Drink("D001","���ڿ�",1000));
		set.add(new Drink("D001","���ڿ�",1000));
		
		System.out.println(set);
		
		

	}

}
