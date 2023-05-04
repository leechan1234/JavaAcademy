package Day15;

import java.time.Month;
import java.util.Calendar;

public class ApiEx15 {
	
    public static String toDateString(Calendar date) {
    	return date.get(Calendar.YEAR) + "년" +(date.get(Calendar.MONTH)+ 1) + "월"
    	 			+date.get(Calendar.DATE)+"일";
    }

	public static void main(String[] args) {
		
		Calendar date =Calendar.getInstance();
		System.out.println(date);
		
		date.set(2023, 4, 31); //2023/5/31
		System.out.println(toDateString(date));
		
		System.out.println(" = 1일 후 =");
		date.add(Calendar.DATE,1);
		System.out.println(toDateString(date));
		
		System.out.println("= 3달 전 =");
		date.add(Calendar, 0);
		
		
	}

}
