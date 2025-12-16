package dec_16_12_2025_LambdaExpression;
import java.util.function.Consumer;

public class ValueModifier {
	void main() {
		int n1=Integer.parseInt(IO.readln("Enter a number"));
		Consumer<Integer> doublingValue = n-> IO.println("After doubling the value: "+(n+n));
		Consumer<Integer> incrementing = n-> IO.println("After incrementing the value by 3: "+(n+3));
		Consumer<Integer> squaring = n-> IO.println("After squaring the value: "+(n*n));
		IO.println("Original value: "+n1);
		modifyValue(n1,doublingValue);
		modifyValue(n1,incrementing);
		modifyValue(n1,squaring);
		
	}
	public static void modifyValue(int value, Consumer<Integer> cunsumer) {
		cunsumer.accept(value);
	}
}
