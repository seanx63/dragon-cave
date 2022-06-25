package seanx63;
import java.util.Scanner;

public class dragonCave {
	public static String caveOne = """
			You cautiously approach the cave...
			The dragon eyes you carefully.
			One of it's imposing claws steadily approaches you...
			...And swipes at you with enough force to fell a giant!
			YOU LOSE! 
			""";
	public static String caveTwo = """
			You cautiously approach the cave...
			The dragon eyes you carefully.
			One of it's imposing claws steadily approaches you...
			...And in it's paw is enough gold to become ROYALTY!
			YOU WIN!
			""";
	public static String homeTrip = """
			Not choosing between cave 'one' or 'two', 
			you decide to head home and accidentally
			trip on a stool.
			YOU LOSE!
			""";
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		switch (inputProcess(in)) {
			case 1 ->
				System.out.println(caveOne);
			case 2 ->
				System.out.println(caveTwo);
			case -1 ->
				System.out.println(homeTrip);
		}
    }
    public static int inputProcess(Scanner input) {
		System.out.print("""
				You are in a land full of dragons. In front of you,
				you see two caves. In one cave, the dragon is friendly
				and will share his treasure with you. The other dragon
				is greedy and hungry and will eat you on sight.
				Which cave will you go into? ('one' or 'two')
				> """); // Intro text
		try {
			int currentCave;
			String playerChoice = input.nextLine(); // Read next string to allow for different user input
			switch (playerChoice.toLowerCase()) { // Use the player input variable with the toLowerCase method for case
													// insensitivity
				case "1", "one" ->
					currentCave = 1;
				case "2", "two" ->
					currentCave = 2;
				default ->
					currentCave = -1;
			}
		return currentCave;
		} catch (Exception e) {
			e.printStackTrace(); // Error out for invalid input.
			return 0;
		}
	}
}
