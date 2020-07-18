import java.util.Arrays; 
public class NumbersToGuess {

	int nr1;
	int nr2;
	int nr3;
	int nr4;
	
	int[] numbersToGuess  = new int[4];
	
	numbersToGuess[0] = nr1;
	numbersToGuess[1] = nr2;
	numbersToGuess[2] = nr3;
	numbersToGuess[3] = nr4;
	
	int[] numbersGuessed = new int[4];
	
	if (Arrays.equals(numbersToGuess, numbersGuessed)) 
        System.out.println("You win!"); 

}
