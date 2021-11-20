package Level9;

import java.util.Scanner;

public class Level9_4153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[3];
		
		while(true) {
			for(int i=0; i<input.length; i++) {
				input[i] = sc.nextInt();
			}
			if(input[0] == 0 && input[1] == 0 && input[2] == 0)
				return;
			else if(input[0]>input[1] && input[0] > input[2]) //input[0]이 빗변일 경우
			{
				if((input[1]*input[1] + input[2]*input[2]) == input[0]*input[0]) {
					System.out.println("right");
				}else {
					System.out.println("wrong");
				}
			}else if(input[1] > input[0] && input[1] > input[2])//input[1]이 빗변일 경우
			{
				if((input[0]*input[0] + input[2] * input[2]) == input[1]*input[1]) {
					System.out.println("right");
				}else
					System.out.println("wrong");
			}else {//input[2] 가 빗변일 경우
				if(input[0] * input[0] + input[1]*input[1] == input[2]*input[2]) {
					System.out.println("right");
				}else
					System.out.println("wrong");
			}
				
		}
	}

}
