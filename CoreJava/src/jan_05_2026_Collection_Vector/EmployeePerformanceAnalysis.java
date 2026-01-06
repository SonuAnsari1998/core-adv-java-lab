package jan_05_2026_Collection_Vector;

import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;

public class EmployeePerformanceAnalysis {

	// Vectors to store employee names and salaries
	private Vector<String> employeeNames = new Vector<>();
	private Vector<Double> employeeSalaries = new Vector<>();

	// Method to input employee data
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		sc.nextLine(); // consume newline

		for (int i = 0; i < n; i++) {
			System.out.print("Enter name of employee " + (i + 1) + ": ");
			String name = sc.nextLine();
			System.out.print("Enter salary of " + name + ": ");
			double salary = sc.nextDouble();
			sc.nextLine(); // consume newline

			employeeNames.add(name);
			employeeSalaries.add(salary);
		}
	}

	// Method to calculate average salary
	public double calculateAverageSalary() {
		double sum = 0;
		for (double salary : employeeSalaries) {
			sum += salary;
		}
		return sum / employeeSalaries.size();
	}

	// Method to sort employees by salary in descending order
	public void sortEmployeesBySalary() {
		// Create a combined vector of indices
		Vector<Integer> indices = new Vector<>();
		for (int i = 0; i < employeeNames.size(); i++) {
			indices.add(i);
		}

		// Sort indices based on salaries
		Collections.sort(indices, new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return Double.compare(employeeSalaries.get(i2), employeeSalaries.get(i1));
			}
		});

		// Rearrange names and salaries based on sorted indices
		Vector<String> sortedNames = new Vector<>();
		Vector<Double> sortedSalaries = new Vector<>();

		for (int idx : indices) {
			sortedNames.add(employeeNames.get(idx));
			sortedSalaries.add(employeeSalaries.get(idx));
		}

		employeeNames = sortedNames;
		employeeSalaries = sortedSalaries;
	}

	// Method to display top N earners
	public void displayTopEarners(int topN) {
		System.out.println("\nTop " + topN + " Highest Paid Employees:");
		for (int i = 0; i < Math.min(topN, employeeNames.size()); i++) {
			System.out.println(employeeNames.get(i) + " - $" + employeeSalaries.get(i));
		}
	}

	// Method to display employees earning below average
	public void displayBelowAverageEmployees(double avgSalary) {
		System.out.println("\nEmployees earning below average salary (" + avgSalary + "):");
		for (int i = 0; i < employeeNames.size(); i++) {
			if (employeeSalaries.get(i) < avgSalary) {
				System.out.println(employeeNames.get(i) + " - $" + employeeSalaries.get(i));
			}
		}
	}

	// Main method
	public static void main(String[] args) {
		EmployeePerformanceAnalysis analysis = new EmployeePerformanceAnalysis();

		// Step 1: Input data
		analysis.inputData();

		// Step 2: Sort employees by salary
		analysis.sortEmployeesBySalary();

		// Step 3: Display top 3 earners
		analysis.displayTopEarners(3);

		// Step 4: Calculate average salary
		double avgSalary = analysis.calculateAverageSalary();
		System.out.println("\nAverage Salary: $" + avgSalary);

		// Step 5: Display employees earning below average
		analysis.displayBelowAverageEmployees(avgSalary);
	}
}
