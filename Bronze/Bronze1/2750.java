package Level12;

import java.util.Scanner;

public class Level12_2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int[] arr = new int[input];
		
		for(int i=0; i<input; i++) {
			arr[i] = sc.nextInt();
			
		}
		for(int j=0; j<arr.length; j++) {
			for(int i = j+1; i<arr.length; i++) {
				if(arr[j]>arr[i]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] =tmp;
				}
			}
		}
		for(int k=0; k<input; k++) {
			System.out.println(arr[k]);
		}
	}

}
