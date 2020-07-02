package de.renatekavuza.mastermind;

public class Guess {
	int guess1;
	int guess2;
	int guess3;
	int guess4;

	public Guess(int guess1, int guess2, int guess3, int guess4) {

		this.guess1 = guess1;
		this.guess2 = guess2;
		this.guess3 = guess3;
		this.guess4 = guess4;
	}

	public int getGuess1() {
		return guess1;
	}

	public void setGuess1(int guess1) {
		this.guess1 = guess1;
	}

	public int getGuess2() {
		return guess2;
	}

	public void setGuess2(int guess2) {
		this.guess2 = guess2;
	}

	public int getGuess3() {
		return guess3;
	}

	public void setGuess3(int guess3) {
		this.guess3 = guess3;
	}

	public int getGuess4() {
		return guess4;
	}

	public void setGuess4(int guess4) {
		this.guess4 = guess4;
	}

	public boolean compare(int a, int b) {

		if (a == b) {
			return true;
		} else
			return false;
	}

}
