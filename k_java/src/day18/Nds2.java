package day18;

public class Nds2 {
	static int[][] num = new int[10][4];
	static {
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				if(j==3) {
					num[i][3] = num[i][0]+num[i][1]+num[i][2];
					continue;
				}
				num[i][j] = (int)(Math.random()*10)+1;
			}
		}
	}

}
