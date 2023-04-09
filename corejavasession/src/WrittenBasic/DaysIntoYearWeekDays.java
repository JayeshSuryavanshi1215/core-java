package WrittenBasic;

import java.util.Scanner;

public class DaysIntoYearWeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the day");
		int a = sc.nextInt();
		int y, m, d, w;//y=year  m=month, d=day w=week
		y = a / 365;
		d = a % 365;
		System.out.println("year:" + y);
		m = a / 12;
		d = a % 12;
		System.out.println("month:" + m);
		w = a / 7;
		d = a % 7;
		System.out.println("week" + w);
	}

}
