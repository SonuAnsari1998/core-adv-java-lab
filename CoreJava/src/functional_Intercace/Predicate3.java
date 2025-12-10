package functional_Intercace;

import java.util.function.Predicate;

//Verify waither name is sonu our not 
public class Predicate3 {
	void main() {
		Predicate<String> p3 = name -> name.toLowerCase().equalsIgnoreCase("sonu");
		String name = IO.readln("Enter Your Name");
		if (p3.test(name))
			IO.print("Yes containig ");
		else
			IO.print("Not containig ");
	}
}
