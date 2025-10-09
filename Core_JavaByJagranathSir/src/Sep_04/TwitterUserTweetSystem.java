package Sep_04;
import java.util.Scanner;
/*
1. Twitter – User & Tweet System

Instance variables: userId, username, followersCount
Static variable: platformName = "Twitter"
Methods (all void):
postTweet(String content) -> prints tweet with username
followUser(String anotherUser) -> prints follow action & increases followersCount
displayUserInfo() -> prints user details

Task: Create 2 users, make them follow each other, post tweets, and display their info.
*/
import java.util.Scanner;
public class TwitterUserTweetSystem {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		Twitter f1=new Twitter();
		System.out.println("Enter User Id: ");
		f1.userId=sc.nextLine();
		System.out.println("Enter User Name: ");
		f1.username=sc.nextLine();
		f1.postTweet("Hello");
		f1.followUser("sonu");
		f1.displayUserInfo();
		//----------------------
		Twitter f2=new Twitter();
		System.out.println("Enter User Id: ");
		f2.userId=sc.nextLine();
		System.out.println("Enter User Name: ");
		f2.username=sc.nextLine();
		f2.postTweet("Hello");
		f2.followUser("sonu");
		f2.followUser("vijay");
		f2.displayUserInfo();
	}
}
class Twitter{
	String userId;
	String username;
	int followersCount;
	static String platformName="Twitter";
	public void postTweet(String content) {
		System.out.println(content);
		
	}
	public void followUser(String anotherUser) {
		followersCount++;
		
	}
	public void displayUserInfo() {
		System.out.println(platformName);
		System.out.println("User Id: "+userId);
		System.out.println("User Name: "+username);
		System.out.println("followers: "+followersCount);
		
	}
}

