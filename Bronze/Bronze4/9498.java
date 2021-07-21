package Level2;

import java.util.Scanner;

public class Level2_9498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		if(90<=input && input<=100) {
			System.out.println("A");
		}
		else if(input>=80) {
			System.out.println("B");
		}
		else if(input>=70) {
			System.out.println("C");
		}
		else if(input>=60) {
			System.out.println("D");
		}
		else
			System.out.println("F");
	}

}
