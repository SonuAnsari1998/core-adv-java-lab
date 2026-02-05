package feb_05_2026_Stream_API;

import java.util.stream.Stream;

/*Q10) WAP to extract First Letter of Each Word from String Array

      String []names = {"James", "Aryan", "Vibha", "Aniket"};

      First Letters: [J, A, V, A]*/
public class ExtractFirstLetter {
	public static void main(String[] args) {
		String[] names = { "James", "Aryan", "Vibha", "Aniket" };

		Object[] array = Stream.of(names).map(n -> n.charAt(0)).toArray();
		for (Object s : array) {
			System.out.print(s + " ");
		}

	}
}
