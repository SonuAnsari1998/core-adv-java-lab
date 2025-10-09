package Sep_04;
/*3. PUBG – Player & Match System
Instance variables: playerId, playerName, kills, health
Static variable: gameName = "PUBG"
Methods (all void):
attackPlayer(String enemyName, int damage) -> reduces enemy’s health & prints action
addKill() -> increments kills count and prints updated kills
displayStats() -> prints player stats

Task: Create 2 players, simulate an attack, update kills, and display match stats.*/
import java.util.Scanner;
public class PlayerMatchSystem {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		PUBG player1=new PUBG();
		
		System.out.println("Enter Player Name");
		player1.playerName=sc.nextLine();
		player1.attackPlayer("vijay",1);
		
		
		
		PUBG player2=new PUBG();
		player2.attackPlayer("amit",1);
		
		
		player1.addKill();
		player1.displayStats();
	}
}
class PUBG{
	String playerId;
	String playerName;
	int kills;
	int health;
	static String gameName="PUBG";
	public void attackPlayer(String enemyName, int damage) {
		System.out.println("Ememy Name: "+enemyName);
		addKill();
	}
	public void addKill() {
		health++;
		kills++;
	}
	public void displayStats() {
		System.out.println("Game Name: "+gameName);
		System.out.println("Player Name: "+playerName);
		System.out.println("Player Kill: "+kills);
		System.out.println("Health: "+health);
		
	}
	
	
}
