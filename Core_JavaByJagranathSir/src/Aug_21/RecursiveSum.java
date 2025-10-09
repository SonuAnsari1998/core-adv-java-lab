package Aug_21;
//3. Recursive Sum Function
//A recursive function sumOfN(n) calculates the sum of numbers from 1 to n.
//If you mistakenly use a static variable sum inside the function, what will happen if you call sumOfN(5) and then sumOfN(3) afterward?
//Why is a local variable the correct choice here?

class RecursiveSum {
//	static int n=5;
	public static void sumOfN() {
		int n=5;
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
	}
	public static void main(String[]args) {
		sumOfN();
		sumOfN();
		
	}

}
