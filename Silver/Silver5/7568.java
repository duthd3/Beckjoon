package Level11;

import java.util.Scanner;

public class Level11_7568 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] arr = new int[num][2];
		
		for(int i=0; i<num; i++) {
			arr[i][0] = sc.nextInt();//몸무게
			arr[i][1] = sc.nextInt();//키
			
		}
		
		for(int i=0; i<num; i++) {
			int rank = 1;
			for(int j= 0; j<num; j++) {
				if(arr[i][0]<arr[j][0]) {
					if(arr[i][1]<arr[j][1]) {
						rank++;
					}
				}
			}
			System.out.print(rank + " ");
		}
	}

}
