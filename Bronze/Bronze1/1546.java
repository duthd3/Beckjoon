package Level5;

import java.util.Scanner;

public class Level5_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]>max) max = arr[i];
		}
	}

}
