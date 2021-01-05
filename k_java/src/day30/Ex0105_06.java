package day30;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex0105_06 {

	public static void main(String[] args) throws Exception {
		// 5�� - Stu_score
		// Stu_score[0] ȫ�浿 100 99 99
		// Stu_score[1] �̼��� 80 70 99
		// Stu_score[2] ������ 99 88 90
		// Stu_score[3] ������ 99 100 71
		// Stu_score[4] �豸  100 80 85
		// map.put("s1",Stu_score[0]);
		// map.put("s2",Stu_score[1]);
		// Map ���� ���������� �ջ��ؼ� �� ��ü ���������� ����� ����Ͻÿ�.
		// Map ���� �հ������� �ջ��ؼ� �� ��ü �ջ� ����� ����Ͻÿ�.
		Stu_score[] score = new Stu_score[5];
		score[0] = new Stu_score("S001",100,99,99);
		score[1] = new Stu_score("S002",80,70,99);
		score[2] = new Stu_score("S003",99,88,90);
		score[3] = new Stu_score("S004",99,100,71);
		score[4] = new Stu_score("S005",100,80,85);
		HashMap map = new HashMap();
		map.put("s1", score[0]);
		map.put("s2", score[1]);
		map.put("s3", score[2]);
		map.put("s4", score[3]);
		map.put("s5", score[4]);
		
		Iterator it = map.entrySet().iterator();
		int kor_total=0; //�����հ�����
		int count=0;
		while(it.hasNext()) {
			Map.Entry e =(Map.Entry) it.next();
			System.out.println("Ű : "+e.getKey());
			System.out.println("�� : "+e.getValue()); //Ÿ��:Map.Entry
			//Ÿ�Ժ���
			kor_total = kor_total + ((Stu_score)e.getValue()).getKor();
			count++; //��� �����ϴ��� Ȯ���ϴ� ����
		}
		System.out.printf("�������� ��ü��� : %.2f \n",(kor_total/(double)count));

	}
	

}
