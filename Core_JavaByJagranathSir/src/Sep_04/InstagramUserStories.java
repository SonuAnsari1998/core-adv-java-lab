/*4. Instagram – User & Stories
Instance variables: userId, username, followersCount
Static variable: platformName = "Instagram"

Methods (all void):
uploadStory(String storyContent) -> prints story uploaded message
addFollower() -> increases followersCount
displayProfile() -> prints profile details
Task: Create a user, upload stories, add followers, and display profile info.*/
package Sep_04;
import java.util.Scanner;
public class InstagramUserStories {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		Instagram f1=new Instagram();
		System.out.println("Enter User Id");
		f1.userId=sc.nextLine();
		System.out.println("Enter Username");
		f1.userName=sc.nextLine();
		f1.uploadStory("Today is the best day");
		f1.addFollower();
		f1.addFollower();
		f1.addFollower();
		f1.displayProfile();
		
	}
}
class Instagram{
	String userId;
	String userName;
	int followersCount;
	static String platformName = "Instagram";
	public void uploadStory(String storyContent) {
		System.out.println("Story Sontent is: "+storyContent);
	}
	public void addFollower() {
		followersCount++;
	}
	public void displayProfile() {
		System.out.println(platformName);
		System.out.println("User Id :"+userId);
		System.out.println("User Name: "+userName);
		System.out.println("Follower: "+followersCount);
	}
	
}
