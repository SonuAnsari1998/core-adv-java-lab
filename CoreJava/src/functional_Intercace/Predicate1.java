package functional_Intercace;

import java.util.function.Predicate;
////Verify whether a person is eligible 4 voting OR not
public class Predicate1 {
	void main() {
		Predicate<Integer> p1 = age-> age>=18;
		int age=Integer.parseInt(IO.readln("Enter your age"));
		if(p1.test(age)) 
			IO.println("Eligible for vote");
		else
			IO.println("Not Eligible for vote");
	}
}
