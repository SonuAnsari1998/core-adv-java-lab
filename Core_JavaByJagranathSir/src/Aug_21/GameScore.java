package Aug_21;
//6. Game Score vs. Player Lives
//In a game:
//Score should reset to 0 every time a new game starts.
//High score should remain across multiple games.
//Which variable(s) should be local and which should be static?

class GameScore {
	static int score=5;
	
	public static void gameStarts() {
		score++;
		System.out.print(" "+score);
		
		
	}
	public static void main(String[]args) {
		gameStarts();
		gameStarts();
		gameStarts();
	}
}
