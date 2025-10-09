package Aug_21;
//this is changes for github

//4. Banking System – Account Balance
//In a banking system, each account has its own balance.
//Should the balance variable be local, instance, or static? Why?
//What would go wrong if you made it static?

//class BankingSystem {
//	public static void accountBalance(){
////		int amt=10000; //Using local variable
//			System.out.println("Account Balance: "+amt);
//	}
//	public static void main(String []args) {
//		accountBalance();
//		accountBalance();
//	}
//}

//sonu
class BankingSystem {
	static int amt=11000;  //Using static variable
public static void accountBalance(){
		System.out.println("Account Balance: "+amt);
}
public static void main(String []args) {
	accountBalance();
	accountBalance();
}
}
