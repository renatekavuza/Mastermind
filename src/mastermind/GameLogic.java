package mastermind;

public class GameLogic {

	public static void main(String[] args) {

		System.out.println("M A S T E R M I N D");
		System.out.println("In this game you have to guess the 4 numbers between 1 and 6, I have randomely chosen.");
		System.out.println("Each number occurs only once.");
		System.out.println("Please enter the four digits with a space in between!");
		System.out.println(
				"After my answer of the kind 0 numbers in the correct position plus 0 numbers in the wrong position, you may guess again.");
		NumbersToGuess numbers = new NumbersToGuess();
		System.out.println(numbers);
	}
}
