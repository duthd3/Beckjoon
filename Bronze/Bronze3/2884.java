package Level2;

import java.util.Scanner;

public class Level2_2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(h==0 && m>=45)
			h=0;
		else if(h==0)
			h=24;
		
		int total = h*60+m-45;
		int newh = total/60;
		int newm = total%60;
		
		System.out.println(newh+" "+ newm);
	}

}
