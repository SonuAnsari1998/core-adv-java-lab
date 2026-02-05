package feb_05_2026_Stream_API;

import java.util.Arrays;
import java.util.stream.Stream;

/*Q7) WAP to convert Integer Array to String Representation

    Integer[] numbers = {10, 20, 30, 40, 50};
    Converted Strings: [Number: 10, Number: 20, Number: 30, Number: 40, Number: 50]
*/
public class IntegerArrayStringRepresentation {
	public static void main(String[] args) {
		Integer[] numbers = { 10, 20, 30, 40, 50 };
		Arrays.stream(numbers).map(n -> "Number: " + n).forEach(IO::println);

	}
}
