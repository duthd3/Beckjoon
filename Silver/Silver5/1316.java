package Level7;

import java.util.Scanner;

public class Level7_1316 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			if(check() == true) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean check() {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++) {
			int now = str.charAt(i); // i번째 문자 저장(현재 문자)
			
			//앞선 문자와  i 번째 문자가 같지 않다면?
			if(prev!=now) {
				//해당 문자가 처음 나오는 경우(false인 경우)
				if(check[now - 'a'] == false) {
					check[now-'a'] = true;
					prev = now;
				}else {//해당 문자가 이미 나온적이 있는 경우(그룹단어가 아니게 됨)
					return false;
			}
			
			}
			//앞선 문자와 i번째 문자가 같다면?
			else {
				continue;
			}
		}
		return true;
	}

}
