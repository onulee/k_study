package day29;

import java.util.Arrays;
import java.util.Collections;

public class Ex0104_05 {

	public static void main(String[] args) {
		Integer[] arr = {7,6,3,5,9,1};
		
//		for(int i:arr) {
//			System.out.println(i);
//		}
		Arrays.sort(arr); //��������
		Arrays.sort(arr,Collections.reverseOrder()); //��������
		System.out.println(Arrays.toString(arr));
		
		//Arrays.sort(arr,new DescComp());

	}

}
