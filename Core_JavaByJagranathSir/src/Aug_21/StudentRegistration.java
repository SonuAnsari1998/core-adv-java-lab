package Aug_21;
//2. Student Registration IDs 
//Imagine a program where each new student gets a unique registration number automatically starting from 1000.
//If you use a local variable, what problem will you face when generating IDs?
//How can you use a static variable to ensure every student gets a unique ID without restarting from 1000 each time?

class StudentRegistration {
	public static void generatingIDs() {		
		int id=1000;
		id++;
		System.out.println(id);		
		

	}
	public static void main(String[]args) {
		generatingIDs();
		generatingIDs();
	}

}


//class StudentRegistration {
//	static int id =1000;
//	public static void generatingIDs() {
//		id++;
//		System.out.println(id);		
//		
//
//	}
//	public static void main(String[]args) {
//		generatingIDs();
//		generatingIDs();
//	}
//
//}