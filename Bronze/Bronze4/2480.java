package Bronze4;

import java.util.Scanner;

public class Bronze4_2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result;
		int max = a;
		if(b>max) max =b;
		if(c>max) max =c;
		
		//모두 다를경우
		if(a!=b && a!=c && b!=c) {
			result = max*100;
			System.out.println(result);
		}
		else if(a==b && b==c && a==c){
			result = 10000+max*1000;
			System.out.println(result);
		}
		else if(a==b && b!=c) {
			result = 1000+a*100;
			System.out.println(result);
		}
		else if(a==c && a!=b) {
			result = 1000+a*100;
			System.out.println(result);
		}
		else {
			result = 1000+b*100;
			System.out.println(result);
		}
		
			
			
		
		
	}

}
