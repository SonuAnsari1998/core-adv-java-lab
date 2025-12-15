package dec_15_2025_Lambda_Expression;

import java.util.function.Predicate;

public record Customer(String name, Double salary, Integer creditScore, Integer age) {

	public boolean checkLoanEligibility() {

		Predicate<Customer> salaryCheck = c -> c.salary() > 25000;

		Predicate<Customer> creditScoreCheck = c -> c.creditScore() > 700;

		Predicate<Customer> ageCheck = c -> c.age() > 21;

		return salaryCheck.and(creditScoreCheck).and(ageCheck).test(this);
	}
}
