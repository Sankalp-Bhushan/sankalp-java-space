package CoreJava;

import java.util.*;


public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student(1,"Sankalp Bhushan","Computer Science","Bangolore");
		
		DayOfTheWeek weekDay = DayOfTheWeek.MON;
		var allDays = DayOfTheWeek.values();
		System.out.println(weekDay.name() + "\n" + weekDay.ordinal() + "\n" + Arrays.toString(allDays));	
		 
 	}

	public static void timeDifference(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int e : list) {
			System.out.println(e);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getName() + " : " + (end - start));
	}

	record Student(int id, String name, String sublject, String place) {
	}
}
