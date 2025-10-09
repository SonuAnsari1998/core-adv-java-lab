package Aug_26;

import java.util.Scanner;

class GymMembershipRegistration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Gym g1 = new Gym();

		System.out.println("Enter Member Name: ");
		String memberName = sc.nextLine();

		System.out.println("Enter Membar ID: ");
		int memberId = sc.nextInt();

		System.out.println("Enter Member Age: ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Membership Type: ");
		String membershipType = sc.nextLine();

		System.out.println("Enter Member Contact Details: ");
		long mobileNo = sc.nextLong();

		g1.setDetails(memberName, memberId, age, membershipType, mobileNo);
		g1.showDetails();
	}
}
