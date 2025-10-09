package Practice_Only;
/*Program-4
----------
Write a program in java to input number of days. Find and display number of years, months and days.*/

public class FindDayMonthDay {
	public static void main(String[] args) {
		int day=400;
		int year=day/365;
		int month=day%365/30;
		int days=day%365%30;
		System.out.println("Years : "+year);
		System.out.println("Months : "+month);
		System.out.println("Days : "+days);
	}
}
