package functional_Intercace;

import java.util.function.Predicate;

////Verify whether my name starts with character 'p' or not
public class Predicate2 {
	void main() {
		Predicate<String> p2 = name -> name.toLowerCase().startsWith("p");
		String name = IO.readln("Enter Your Name");
		if (p2.test(name))
			IO.println("Yes Start with 'p' Character");
		else
			IO.println("No. Start with 'p' Character");
	}
}
