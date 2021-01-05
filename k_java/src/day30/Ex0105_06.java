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
		// 5명 - Stu_score
		// Stu_score[0] 홍길동 100 99 99
		// Stu_score[1] 이순신 80 70 99
		// Stu_score[2] 유관순 99 88 90
		// Stu_score[3] 강감찬 99 100 71
		// Stu_score[4] 김구  100 80 85
		// map.put("s1",Stu_score[0]);
		// map.put("s2",Stu_score[1]);
		// Map 에서 국어점수를 합산해서 반 전체 국어점수만 평균을 출력하시오.
		// Map 에서 합계점수를 합산해서 반 전체 합산 평균을 출력하시오.
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
		int kor_total=0; //국어합계점수
		int count=0;
		while(it.hasNext()) {
			Map.Entry e =(Map.Entry) it.next();
			System.out.println("키 : "+e.getKey());
			System.out.println("값 : "+e.getValue()); //타입:Map.Entry
			//타입변경
			kor_total = kor_total + ((Stu_score)e.getValue()).getKor();
			count++; //몇명 저장하는지 확인하는 변수
		}
		System.out.printf("국어점수 전체평균 : %.2f \n",(kor_total/(double)count));

	}
	

}
