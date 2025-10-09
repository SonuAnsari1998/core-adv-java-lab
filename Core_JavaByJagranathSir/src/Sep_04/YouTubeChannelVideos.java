/*5. YouTube – Channel & Videos

Instance variables: channelId, channelName, subscribers, videosCount
Static variable: platformName = "YouTube"

Methods (all void):
uploadVideo(String title) -> increases videosCount and prints upload info
addSubscriber() -> increases subscribers and prints message
displayChannelInfo() -> prints channel info

Task: Create channels, upload videos, add subscribers, and display details.*/
package Sep_04;
import java.util.Scanner;
public class YouTubeChannelVideos {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		YouTube s1=new YouTube();
		System.out.println("Enter Chenal Id");
		s1.channelId=sc.nextLine();
		System.out.println("Enter Chenal Name");
		s1.channelName=sc.nextLine();
		s1.uploadVideo("My first video");
		s1.addSubscriber();
		s1.addSubscriber();
		s1.addSubscriber();
		s1.addSubscriber();
		s1.displayChannelInfo();
	}

}
class YouTube{
	static String platformName = "YouTube";
	String  channelId;
	String channelName;
	int subscribers;
	int videosCount;
	public void uploadVideo(String title) {
		videosCount++;
	}
	public void addSubscriber() {
		subscribers++;
	}
	public void displayChannelInfo() {
		System.out.println(platformName);
		System.out.println("Chenal Id: "+channelId);
		System.out.println("Chenal Name: "+channelName);
		System.out.println("Subscriber: "+subscribers);
		System.out.println("Videos: "+videosCount);
		
	}
	
}
