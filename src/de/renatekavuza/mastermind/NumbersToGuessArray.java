package de.renatekavuza.mastermind;

public class NumbersToGuessArray {

		int nr1 = 0;
		int nr2 = 0;
		int nr3 = 0;
		int nr4 = 0;
		int nr1ToGuess;
		int nr2ToGuess;
		int nr3ToGuess;
		int nr4ToGuess;
		
		public int genNr1() {
			int nr1 = nr1ToGuess;
			while (nr1 == 0) {
				nr1ToGuess = (int) Math.random() * 6 + 1;
				nr1 = nr1ToGuess;
				}
			}
			
		public int genNr2() {
			int nr2 = nr2ToGuess;
			while (nr2 == 0 || nr2 == this.nr1) {
				nr2ToGuess = (int) Math.random() * 6 + 1;
				nr2 = nr2ToGuess;				
				}
			}
		
		public int genNr3() {
			int nr3 = nr3ToGuess;
			while (nr3 == 0 || nr3 == this.nr1 || nr3 == this.nr2) {
				nr3ToGuess = (int) Math.random() * 6 + 1;
				nr3 = nr3ToGuess;
				}
			}
			
		public int genNr4() {
			int nr4 = nr4ToGuess;
			while (nr4 == 0 || nr4 == this.nr1 || nr4 == this.nr2 || nr4 == this.nr3) {
				nr2ToGuess = (int) Math.random() * 6 + 1;
				nr2 = nr2ToGuess;				
				}
			}
									

		int[] numbersToGuess = new int[4] {
		
		numbersToGuess[0] = nr1;
		numbersToGuess[1] = nr2;
		numbersToGuess[2] = nr3;
		numbersToGuess[3] = nr4;
		}
		
		int[] numbersGuessed = new int[4];
		
		if (Arrays.equals(numbersToGuess, numbersGuessed)) 
	        System.out.println("You win!"); 


		
	}	
}
