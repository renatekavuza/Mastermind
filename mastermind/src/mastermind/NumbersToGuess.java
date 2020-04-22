package mastermind;

public class NumbersToGuess {

	double numberToGuess = Math.random() * 5.49 + 1.0;
	  int nrToGuess= (int) numberToGuess; 
	
	
	NumbersToGuess(int nr) {
		this.nrToGuess = nr;
}
}
