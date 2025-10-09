package Aug_21;
//5. Login Attempt Tracker
//A website limits login attempts to 3 tries.
//If you implement the login() function with a local counter, will the restriction work? Why or why not?
//How can a static variable help implement this feature correctly?

class LoginAttemptTracker {
	static int n=0;
	public static void loginattempts(String pass) {
		
		if(!pass.equals("abc6022")) {
			n++;
			System.out.println("Wrong User Name and Password");
			
		}else {
			System.out.println("Welcome to State Bank Of India");
		}
		if(n>=3) {
			System.out.println("Card is block");
		}	
	}
	public static void main(String[]args) {
		loginattempts("fdf125");
		loginattempts("fdf125");
		loginattempts("abc6022");
	}
}

