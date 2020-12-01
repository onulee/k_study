package day7;

public class Ex1201_06 {

	public static void main(String[] args) {
		char[] hex = {'7','4','1','C','A','F','E'};
		String[] binary= {
			"0000","0001","0010","0011",
			"0100","0101","0110","0111",
			"1000","1001","1010","1011",
			"1100","1101","1110","1111",
		};   // 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
		
		String result=""; //2진수를 저장하는 변수
		// hex -> 2진수로 변경
		for(int i=0;i<hex.length;i++) {
			if(hex[i]>='0' && hex[i]<='9') { //숫자인지?
				result = result +" "+ binary[hex[i]-'0'];  //1,2,3,4,5,6,7,8,9
			}else {
				result = result +" "+ binary[hex[i]-'A'+10]; //A,B,C,D,E,F
			}
		}
		System.out.println("2진수 결과값 : "+result);

	}

}
