package mastermind;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NumbersToGuessTest

{
	@Test
	public void createNewNumbers() {
		
		NumbersToGuess numbers = new NumbersToGuess();
		assertTrue(numbers.getNr1() >= 1 && numbers.getNr1() <= 6);
		assertTrue(numbers.getNr2() >= 1 && numbers.getNr2() <= 6 && numbers.getNr2() != numbers.getNr1());
		assertTrue(numbers.getNr3() >= 1 && numbers.getNr3() <= 6 && numbers.getNr3() != numbers.getNr1() && numbers.getNr3() != numbers.getNr2());
		assertTrue(numbers.getNr4() >= 1 && numbers.getNr4() <= 6 && numbers.getNr4() != numbers.getNr1() && numbers.getNr4() != numbers.getNr2() && numbers.getNr4() != numbers.getNr3());	
		
		NumbersToGuess xnumbers = new NumbersToGuess();
		assertTrue(xnumbers.getNr1() != numbers.getNr1() || xnumbers.getNr2() != numbers.getNr2() || xnumbers.getNr3() != numbers.getNr3() || xnumbers.getNr4() != numbers.getNr4());	
		
	}
}
