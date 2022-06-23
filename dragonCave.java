/* Author: Sean Gates
 * Description: Simple Java text game where player enters caves filled with dragons.
 * Written in openjdk version "17.0.3" 2022-04-19
 */
import java.util.Scanner;
public class dragonCave {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in); // Initialize Scanner object to read player input
	System.out.print(""" 
		You are in a land full of dragons. In front of you,
		you see two caves. In one cave, the dragon is friendly
		and will share his treasure with you. The other dragon
		is greedy and hungry and will eat you on sight.
		Which cave will you go into? ('one' or 'two')
		> """); // Intro text
	    try {
		String playerChoice = in.nextLine(); // Read next string to allow for different user input
		switch (playerChoice.toLowerCase()) { // Use the player input variable with the toLowerCase method for case insensitivity
		    case "1", "one" ->
			System.out.println("""
				You cautiously approach the cave...
				The dragon eyes you carefully.
				One of it's imposing claws steadily approaches you...
				...And swipes at you with enough force to fell a giant!
				YOU LOSE! 
				""");
		    case "2", "two" ->
			System.out.println("""
				You cautiously approach the cave...
				The dragon eyes you carefully.
				One of it's imposing claws steadily approaches you...
				...And in it's paw is enough gold to become ROYALTY!
				YOU WIN!
				""");
			default ->
			    System.out.println("""
				    Not choosing between cave 'one' or 'two', 
				    you decide to head home and accidentally
				    trip on a stool.
				    YOU LOSE!""");
		}
	    } catch (Exception e) {
		e.printStackTrace(); // Error out for invalid input.
	    } 
    }
}
