package Sep_23;
/*Program-4
----------
Write a program in java to input number of days. Find and display number of years, months and days.*/

public class FindYearMonthDay {
	public static void main(String[] args) {
		int days = Integer.parseInt(args[0]);//370 days
		
		int year=days/365;
		int month=days%365/30;
		int day=days%365%30;
		
		System.out.println("Years : "+year);
		System.out.println("Months : "+month);
		System.out.println("Days : "+day);
		
	}
}
