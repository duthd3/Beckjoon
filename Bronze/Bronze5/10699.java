package Bronze5;

import java.util.Calendar;

public class Bronze5_10699 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar date = Calendar.getInstance();
		date.set(2021,07,18);
		
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"-"+(date.get(Calendar.MONTH))+"-"
				+ date.get(Calendar.DATE);
	}

}
