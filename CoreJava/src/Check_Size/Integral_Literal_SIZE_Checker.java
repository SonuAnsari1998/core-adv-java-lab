package Check_Size;

public class Integral_Literal_SIZE_Checker {
	public static void main(String[] args) {


		int x=120;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toOctalString(x));
		
		int a=10;
		float b=4.5f;
		double c=5.2;
		long d=378293L;
		long e=(long)-8.98;
		System.out.println(a);
		System.out.println(b); 
		System.out.println(c); 
		System.out.println(d);
		System.out.println(e);
		
		System.out.println("Byte Range");
		System.out.println("Min : "+Byte.MIN_VALUE);
		System.out.println("Max : "+Byte.MAX_VALUE);
		System.out.println("Size : "+Byte.SIZE);
		System.out.println("\n");
		
		System.out.println("Short Range");
		System.out.println("Min : "+Short.MIN_VALUE);
		System.out.println("Max : "+Short.MAX_VALUE);
		System.out.println("Size : "+Short.SIZE);
		System.out.println("\n");
		
		System.out.println("Integer Range");
		System.out.println("Min : "+Integer.MIN_VALUE);
		System.out.println("Max : "+Integer.MAX_VALUE);
		System.out.println("Size : "+Integer.SIZE);
		System.out.println("\n");
		
		System.out.println("Double Range");
		System.out.println("Min : "+Double.MIN_VALUE);
		System.out.println("Max : "+Double.MAX_VALUE);
		System.out.println("Size : "+Double.SIZE);
		
		
	}
}
