package feb_05_2026_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*Q8) WAP to convert all the names of String array into uppercase 
ConvertUppercase
    String[] names = {"Virat", "Sanju", "Rohit", "Bumrah"};

    Output : [VIRAT, SANJU, ROHIT, BUMRAH]*/
public class ConvertUppercase {
	void main() {

		String[] names = { "Virat", "Sanju", "Rohit", "Bumrah" };
		List<String> list = Stream.of(names).map(n -> n.toUpperCase()).toList();
		for (String s : list) {
			System.out.print(s + " ");
		}
	}
}
