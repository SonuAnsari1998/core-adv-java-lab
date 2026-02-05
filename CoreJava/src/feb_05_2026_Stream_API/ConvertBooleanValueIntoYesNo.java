package feb_05_2026_Stream_API;

import java.util.stream.Stream;

/*Q9) WAP to convert boolean value to "Yes" or "No"
ConvertBooleanValueIntoYesNo
    Boolean[] flags = {true, false, true, false, true};

    Yes/No Values: [Yes, No, Yes, No, Yes]*/
public class ConvertBooleanValueIntoYesNo {
	public static void main(String[] args) {
		Boolean[] flags = {true, false, true, false, true};
		Stream.of(flags).map(f -> {
			String s=null;
			if(f==true) {
				s= "Yes";
			}else if(f==false){
				s ="No";
			}
			return s;
		}).forEach(IO::println);;
		
		
	}
}
