package mastermind;

public class NumbersToGuess {

	int nr1;
	int nr2;
	int nr3;
	int nr4;

	public int getNr1() {
		return nr1;
	}

	public void setNr1(int nr1) {
		this.nr1 = nr1;
	}

	public int getNr2() {
		return nr2;
	}

	public void setNr2(int nr2) {
		this.nr2 = nr2;
	}

	public int getNr3() {
		return nr3;
	}

	public void setNr3(int nr3) {
		this.nr3 = nr3;
	}

	public int getNr4() {
		return nr4;
	}

	public void setNr4(int nr4) {
		this.nr4 = nr4;
	}

	NumbersToGuess() {
		nr1 = genNr1();
		nr2 = genNr2();
		nr3 = genNr3();
		nr4 = genNr4();
	}

	double number1ToGuess = Math.random() * 6 + 0.51;
	int nr1ToGuess = (int) number1ToGuess;

	public int genNr1() {
		int nr1 = nr1ToGuess;
		while (nr1 == 0) {
			double number1ToGuess = Math.random() * 6 + 0.51;
			int nr1ToGuess = (int) number1ToGuess;
			nr1 = nr1ToGuess;
		}
		return nr1;
	}

	double number2ToGuess = Math.random() * 6 + 0.51;
	int nr2ToGuess = (int) number2ToGuess;

	public int genNr2() {
		int nr2 = nr2ToGuess;
		while (nr2 == 0 || nr2 == this.nr1) {
			double number2ToGuess = Math.random() * 6 + 0.51;
			int nr2ToGuess = (int) number2ToGuess;
			nr2 = nr2ToGuess;
		}
		return nr2;
	}

	double number3ToGuess = Math.random() * 6 + 0.51;
	int nr3ToGuess = (int) number3ToGuess;

	public int genNr3() {
		int nr3 = nr3ToGuess;
		while (nr3 == 0 || nr3 == this.nr1 || nr3 == this.nr2) {
			double number3ToGuess = Math.random() * 6 + 0.51;
			int nr3ToGuess = (int) number3ToGuess;
			nr3 = nr3ToGuess;
		}
		return nr3;
	}

	double number4ToGuess = Math.random() * 6 + 0.51;
	int nr4ToGuess = (int) number4ToGuess;

	public int genNr4() {
		int nr4 = nr4ToGuess;
		while (nr4 == 0 || nr4 == this.nr1 || nr4 == this.nr2 || nr4 == this.nr3) {
			double number4ToGuess = Math.random() * 6 + 0.51;
			int nr4ToGuess = (int) number4ToGuess;
			nr4 = nr4ToGuess;
		}
		return nr4;

	}

}
