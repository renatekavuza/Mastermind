package mastermind;

public class gameLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("M A S T E R M I N D");
		System.out.println("In this game you have to guess the 4 numbers between 1 and 6, I have randomely chosen.");
		System.out.println("Eaach number occurs only once.");
		System.out.println("please enter the four digits with a space in between!");
		System.out.println("After my answer of the kind 0 numbers in the correct position plus 0 numbers in the wrong position, you may guess again.");
		
		NumbersToGuess nr1 = new NumbersToGuess(nr);
		NumbersToGuess nr2 = new NumbersToGuess(nr);
		NumbersToGuess nr3 = new NumbersToGuess(nr);
		NumbersToGuess nr4 = new NumbersToGuess(nr);
		
		System.out.println(nr1.nr + " " + nr2.nr + " " + nr3.nr + " " + nr4.nr);
		}
	}


