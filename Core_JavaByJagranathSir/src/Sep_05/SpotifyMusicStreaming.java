package Sep_05;
/*Q3. Spotify – Music Streaming
Question:
Develop a User business logic class for Spotify with the following:
Static variable: totalUsers (increments when a new user is created).
Instance variables: username, subscriptionType.

Methods:
- A parameterized method playSong(Stri)ng songName) that prints which song the user is playing 
(use a local variable for song duration in seconds).
- A non-parameterized method playDefaultPlaylist() that prints “Playing Chill Hits”.
- A static method convertToMinutes(int seconds) that converts seconds to minutes.
- A non-static method showUserDetails() that prints username and subscription type.

Create an execution logic class SpotifyApp to:

Create a new user.
Call methods for playing songs, showing playlist, converting time, and displaying user details.
Print the total number of users.*/
import java.util.Scanner;
public class SpotifyMusicStreaming {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);	
		Spotify s1=new Spotify();
		System.out.println("Enter User Name");
		s1.username=sc.nextLine();
		System.out.println("Enter Subscription Type");
		s1.subscriptionType=sc.nextLine();
		s1.showUserDetails();
		s1.playDefaultPlaylist();
		s1.playSong("Sanam teri kasam");
		s1.convertToMinutes(240);
	}
}
class Spotify{
	String username;
	String subscriptionType;
	static int totalUsers;
	public void playSong(String songName) {
		System.out.println("Song Name: "+songName);
	}
	public void playDefaultPlaylist() {
		System.out.println("Playing Chill Hits");
	}
	public void convertToMinutes(int seconds) {
		double minute=seconds/60;
		System.out.println("Minutes: "+minute);
		
	}
	public void showUserDetails() {
		System.out.println("User Name: "+username);
		System.out.println("Subscription Type: "+subscriptionType);
		System.out.println("Total User: "+totalUsers);
	}
}








