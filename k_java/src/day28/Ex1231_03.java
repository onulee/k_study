package day28;

public class Ex1231_03 {

	public static void main(String[] args) {
		String[] stu = { "S1001","S1002","C1001","K1001","C1002",
				         "S1003","K1002","S1004","C1003","C1004" };
		// S-물리학과, C-컴퓨터공학과, K-국문학과
		// 모든학생코드를 비교해서 출력을 하시오.
		// 1번학생 : 물리학과
		// 2번학생 : 물리학과
		// 1번학생 : 컴퓨터공학과
		// 1번학생 : 국문학과
		// 2번학생 : 컴퓨터공학
		// 1001-1000 = 1, 1002-1000=2,
		
		for(int i=0;i<stu.length;i++) {
			if('S'==stu[i].charAt(0)) {
			    int number = Integer.parseInt(stu[i].substring(1));
				System.out.println((number-1000)+"번학생 : 물리학과");
			}else if('C'==stu[i].charAt(0)) {
				int number = Integer.parseInt(stu[i].substring(1));
				System.out.println((number-1000)+"번학생 : 컴퓨터공학과");
			}else {
				int number = Integer.parseInt(stu[i].substring(1));
				System.out.println((number-1000)+"번학생 : 국문학과");
			}
		}
		
		
		String stu_num = "S1001";
		// S와 1001을 메소드를 사용하여 분리해보세요.
		// 1001을 int형으로 변경해보세요.
	    String major_code = ""+stu_num.charAt(0);
	    String major_num = stu_num.substring(1);
	    int number = Integer.parseInt(major_num);
	    
	    
//	    String num = 7+""; // "7"
//	    int number = Integer.parseInt(num);
		

	}

}
