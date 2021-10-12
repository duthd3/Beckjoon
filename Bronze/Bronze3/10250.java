package Level8;

import java.util.Scanner;

public class Level8_10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int caseNum = sc.nextInt();
		for(int i=0; i<caseNum; i++) {
			
			
			String h = sc.next();
			String w = sc.next();
			String o = sc.next();
			
			int height = Integer.parseInt(h);
			int width = Integer.parseInt(w);
			int order = Integer.parseInt(o);
			
			
			
			if(order <= height) {
				System.out.println((order*100)+1);
			}
			else
			{
				int count = 0;
				for(int ho=1; ho<=width; ho++) {
					for(int floor=1; floor<=height; floor++) {
						
						count++;
						if(count==order) {
							System.out.println(floor*100+ho);
						}
						
					}
				}
			}
		}
		
		
	}

}
