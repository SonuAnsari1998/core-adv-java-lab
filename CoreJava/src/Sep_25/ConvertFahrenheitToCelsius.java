package Sep_25;
/*4) write Java Program Convert Fahrenheit To Celsius | Vice Versa
 Formula =
 Celsius=(Fahrenheit-32)*5/9;
 Fahrenheit=((9*Celsius)/5)+32;
 Note [ Write two seprate program for converting celsius into 
 Fahrenheit and Fahrenheit into celsius ]*/
import java.util.Scanner;
public class ConvertFahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Fahrenheit");
		double fahrenheit=sc.nextDouble();
		
		double celsius =((fahrenheit-32)*5)/9;
		System.out.printf("Celsius is :%.2f",celsius);
	}
}
