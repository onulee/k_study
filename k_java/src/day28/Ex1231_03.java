package day28;

public class Ex1231_03 {

	public static void main(String[] args) {
		String[] stu = { "S1001","S1002","C1001","K1001","C1002",
				         "S1003","K1002","S1004","C1003","C1004" };
		// S-�����а�, C-��ǻ�Ͱ��а�, K-�����а�
		// ����л��ڵ带 ���ؼ� ����� �Ͻÿ�.
		// 1���л� : �����а�
		// 2���л� : �����а�
		// 1���л� : ��ǻ�Ͱ��а�
		// 1���л� : �����а�
		// 2���л� : ��ǻ�Ͱ���
		// 1001-1000 = 1, 1002-1000=2,
		
		for(int i=0;i<stu.length;i++) {
			if('S'==stu[i].charAt(0)) {
			    int number = Integer.parseInt(stu[i].substring(1));
				System.out.println((number-1000)+"���л� : �����а�");
			}else if('C'==stu[i].charAt(0)) {
				int number = Integer.parseInt(stu[i].substring(1));
				System.out.println((number-1000)+"���л� : ��ǻ�Ͱ��а�");
			}else {
				int number = Integer.parseInt(stu[i].substring(1));
				System.out.println((number-1000)+"���л� : �����а�");
			}
		}
		
		
		String stu_num = "S1001";
		// S�� 1001�� �޼ҵ带 ����Ͽ� �и��غ�����.
		// 1001�� int������ �����غ�����.
	    String major_code = ""+stu_num.charAt(0);
	    String major_num = stu_num.substring(1);
	    int number = Integer.parseInt(major_num);
	    
	    
//	    String num = 7+""; // "7"
//	    int number = Integer.parseInt(num);
		

	}

}
