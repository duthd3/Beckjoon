package Level9;

import java.util.Scanner;

public class Level9_3009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] rec = new int[8]; //직사각형 꼭지점 좌표 8개(x,y*4)
		
		for(int i=0; i<6; i++) {
			rec[i] = sc.nextInt();
		}
		//rec[0or2or4]중에서 같은게 뭔지? rec[1 3 5]중에서 같은게 뭔지
		if(rec[0] == rec[2]) {
			rec[6] = rec[4];
			if(rec[1] == rec[3]) {				
				rec[7] = rec[5];
			}else if(rec[1] == rec[5]) {
				rec[7] = rec[3];
			}else {
				rec[7] = rec[1];
			}
		}else if(rec[0] == rec[4]) {
			rec[6] = rec[2];
			if(rec[1] == rec[3]) {				
				rec[7] = rec[5];
			}else if(rec[1] == rec[5]) {
				rec[7] = rec[3];
			}else {
				rec[7] = rec[1];
			}
		}else {
			rec[6] = rec[0];
			if(rec[1] == rec[3]) {				
				rec[7] = rec[5];
			}else if(rec[1] == rec[5]) {
				rec[7] = rec[3];
			}else {
				rec[7] = rec[1];
			}
					
		}
		System.out.print(rec[6] + " " + rec[7]);
				
	}
	

}
