package Aug_26;

class Gym {
	String memberName;
	int memberId;
	int age;
	String membershipType;
	long mobileNo;

	public void setDetails(String memberName, int memberId, int age, String membershipType, long mobileNo) {
		this.memberName = memberName;
		this.memberId = memberId;
		this.age = age;
		this.membershipType = membershipType;
		this.mobileNo = mobileNo;
	}

	public void showDetails() {
		System.out.println("---------------------------------------------------------------");
		System.out.println("Details Successfully Added !");
		System.out.println("");
		System.out.println("Member Name: " + memberName);
		System.out.println("Member ID: " + memberId);
		System.out.println("Membership Type: " + membershipType);
		System.out.println("Contact Number: " + mobileNo);
		System.out.println("Thank You !");
	}
}
