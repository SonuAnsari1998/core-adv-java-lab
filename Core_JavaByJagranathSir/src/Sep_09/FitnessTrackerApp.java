package Sep_09;

/*Question 2: Fitness Tracker (with explicit validations)
You are building a fitness tracker app where users monitor daily steps,
calories burned, and active minutes.

Task:
Create a class FitnessTracker with private fields:

int dailySteps — number of steps taken.
double caloriesBurned — calories burned during the day.
int activeMinutes — number of active minutes in a day.

Implement setter methods using the this keyword with validations:
dailySteps cannot be negative. If invalid, print an error message.
caloriesBurned cannot be negative. If invalid, print an error message.
activeMinutes cannot be negative. If invalid, print an error message.

Implement getter methods to retrieve the values of these fields.

Write a test class to:
Create a FitnessTracker object.
Initialize fitness data using setter methods.
Display the fitness data using getter methods.
Update step count and calories burned, then display updated data.*/
import java.util.Scanner;

public class FitnessTrackerApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FitnessTracker f1 = new FitnessTracker();
		System.out.println("Enter Daily Steps");
		f1.setDailySteps(sc.nextInt());
		System.out.println("Enter Calories Burned");
		f1.setCaloriesBurned(sc.nextDouble());
		System.out.println("Enter Active Minutes");
		f1.setActiveMinutes(sc.nextInt());
		System.out.println("-------------------------------------");
		System.out.println(f1.displayDetails());
	}
}
class FitnessTracker {
	private int dailySteps;
	private double caloriesBurned;
	private int activeMinutes;

	// setter
	public void setDailySteps(int dailySteps) {
		if (dailySteps > 0) {
			this.dailySteps = dailySteps;
		} else {
			System.err.println("Plese Enter Valid daily Steps");
			System.exit(0);
		}
	}

	public void setCaloriesBurned(double caloriesBurned) {
		if (caloriesBurned > 0) {
			this.caloriesBurned = caloriesBurned;
		} else {
			System.err.println("Plese Enter Valid Calories Borned");
			System.exit(0);
		}
	}
	public void setActiveMinutes(int activeMinutes) {
		if (activeMinutes > 0) {
			this.activeMinutes = activeMinutes;
		} else {
			System.err.println("Plese Enter Valid Active Minutes");
			System.exit(0);
		}
	}
	// getter
	public int getDailySteps() {
		return dailySteps;
	}

	public double getCaloriesBurned() {
		return caloriesBurned;
	}
	public int getActiveMinutes() {
		return activeMinutes;
	}
	public String displayDetails() {
		return "Daily Steps: " + dailySteps + "\nCalories Burned: " + caloriesBurned + "\nActive Minutes: "
				+ activeMinutes;
	}
}
