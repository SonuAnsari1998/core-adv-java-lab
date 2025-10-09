package Sep_04;
/*2. Facebook – Friends & Posts
Instance variables: userId, name, friendsCount
Static variable: platformName = "Facebook"

Methods (all void):
addFriend(String friendName) -> increases friendsCount and prints message
createPost(String message) -> prints post details with user name
displayProfile() -> prints profile info

Task: Create 3 users, add friends, create posts, and display profiles.*/

import java.util.Scanner;
public class FacebookFriends {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		Facebook f1=new Facebook();
		System.out.println("Enter User Id: ");
		f1.userId = sc.nextLine();
		System.out.println("Enter User Name: ");
		f1.name = sc.nextLine();
		f1.addFriend("sonu");
		f1.addFriend("vijay");
		f1.addFriend("Deewakar");
		f1.createPost("Hello");
		f1.displayProfile();	
	}

}
class Facebook{
	String userId;
	String name;
	int friendsCount;
	static String platformName = "Facebook";
	public void addFriend(String friendName) {
		System.out.println("Friend Name: "+friendName);
		friendsCount++;
	}
	public void createPost(String message) {
		System.out.println("Message is: "+message);
		
	};
	public void displayProfile() {
		System.out.println(platformName);
		System.out.println("User Id: "+userId);
		System.out.println("Name: "+name);
		System.out.println("Friends: "+friendsCount);
		
	}
	
}
