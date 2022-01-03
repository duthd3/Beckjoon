package Level11;

import java.util.Scanner;

public class Level11_1018 {
	public static boolean[][] arr;
	public static int min = 64;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt(); //행의 갯수
		int M = in.nextInt(); //열의 갯수
		
		
		arr = new boolean[N][M];
		
		//배열 입력
		for(int i=0; i<N; i++) {
			String str = in.next(); //열 한줄씩 입력
			
			for(int j=0; j<M; j++) {
				if(str.charAt(j)=='W') {
					arr[i][j] = true; //흰색일 경우 true
					
				}else
					arr[i][j] = false;//검은색일 경우 false
			}
		}
		int N_row = N - 7;
		int M_col = M - 7;
		
		for(int i=0; i<N_row; i++) {
			for(int j=0; j<M_col; j++) {
				find(i,j);
			}
		}
		System.out.println(min);
	}
	
	public static void find(int x, int y) {
		int end_x = x + 8;
		int end_y = y + 8;
		int count = 0;
		boolean TF = arr[x][y]; //체스판 경우마다의 첫번째 색깔
		
		for(int i=x; i<end_x; i++) {
			for(int j=y; j<end_y; j++) {
				if(arr[i][j] != TF) {
					count++;
				}
				TF = (!TF);
			}
			TF=!TF;
		}
		count = Math.min(count, 64-count);
		
		min = Math.min(min, count);
	}

}
