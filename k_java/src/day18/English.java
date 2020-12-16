package day18;

public class English {
	// car,answer,house,subway,boy,girl,dog,family,man,woman
	// 차,정답,집,지하철,소년,소녀,개,가족,남자,여자
	static String[][] eng = {  //[10][2]
		{"car","차"},{"answer","정답"},{"house","집"},	
		{"subway","지하철"},{"boy","소년"},{"girl","소녀"},
		{"dog","개"},{"family","가족"},{"man","남자"},{"woman","여자"}
	};
	
	static { //초기화블럭
		String[][] temp = new String[1][2]; //임시저장변수
		for(int i=0;i<100;i++) {
			// eng 0번째 -> temp, 랜덤 -> 0, temp -> 랜덤
			int r = (int)(Math.random()*10); //0-9까지 랜덤숫자
			temp[0][0] = eng[0][0];//영어-car
			temp[0][1] = eng[0][1];//한글-차
			eng[0][0] = eng[r][0];
			eng[0][1] = eng[r][1];
			eng[r][0] = temp[0][0];
			eng[r][1] = temp[0][1];
		}//for
		
	}//초기화블럭
	

}
