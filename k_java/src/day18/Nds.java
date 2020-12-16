package day18;

public class Nds {
	static int[][] num = new int[10][3];
	static {
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				if(j==2) {
					num[i][3] = num[i][0]+num[i][1];
					continue;
				}
				num[i][j] = (int)(Math.random()*10)+1;
			}
		}
	}

}
