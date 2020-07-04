package de.renatekavuza.mastermind;

import java.util.Scanner;

public class GameLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("M A S T E R M I N D");
		System.out.println("In this game you have to guess the 4 numbers between 1 and 6, I have randomely chosen.");
		System.out.println("Eaach number occurs only once.");

		int holdNr1;
		int holdNr2;
		int holdNr3;
		int holdNr4;
		NumbersToGuess numbers = new NumbersToGuess();
		holdNr1 = numbers.getNr1();
		holdNr2 = numbers.getNr2();
		holdNr3 = numbers.getNr3();
		holdNr4 = numbers.getNr4();

		int correctPosition = 0;
		int correctNumber;
		int countGuess = 0;

		while (correctPosition < 4) {

			correctPosition = 0;
			correctNumber = 0;

			System.out.println("please enter the four digits each followed by pressing enter!");
			// System.in.read(guess1, guess2, guess3, guess4); scanner in java.utils.
			// Scannner wantNumber = new scanner(system.in)
			Scanner wantNumber = new Scanner(System.in);
			int guess1 = wantNumber.nextInt();
			int guess2 = wantNumber.nextInt();
			int guess3 = wantNumber.nextInt();
			int guess4 = wantNumber.nextInt();
			Guess currentGuess = new Guess(guess1, guess2, guess3, guess4);

			if (currentGuess.compare(holdNr1, currentGuess.getGuess1())) {
				correctPosition++;
			}
			if (currentGuess.compare(holdNr2, currentGuess.getGuess2())) {
				correctPosition++;
			}
			if (currentGuess.compare(holdNr3, currentGuess.getGuess3())) {
				correctPosition++;
			}
			if (currentGuess.compare(holdNr4, currentGuess.getGuess4())) {
				correctPosition++;
			}

			if (currentGuess.compare(holdNr1, currentGuess.getGuess2())) {
				correctNumber++;
			}
			if (currentGuess.compare(holdNr1, currentGuess.getGuess3())) {
				correctNumber++;
			}
			if (currentGuess.compare(holdNr1, currentGuess.getGuess4())) {
				correctNumber++;
			}

			if (currentGuess.compare(holdNr2, currentGuess.getGuess4())) {
				correctNumber++;
			}
			if (currentGuess.compare(holdNr2, currentGuess.getGuess1())) {
				correctNumber++;
			}
			if (currentGuess.compare(holdNr2, currentGuess.getGuess3())) {
				correctNumber++;
			}

			if (currentGuess.compare(holdNr3, currentGuess.getGuess2())) {
				correctNumber++;
			}
			if (currentGuess.compare(holdNr3, currentGuess.getGuess4())) {
				correctNumber++;
			}
			if (currentGuess.compare(holdNr3, currentGuess.getGuess1())) {
				correctNumber++;
			}

			if (currentGuess.compare(holdNr4, currentGuess.getGuess2())) {
				correctNumber++;
			}
			if (currentGuess.compare(holdNr4, currentGuess.getGuess3())) {
				correctNumber++;
			}
			if (currentGuess.compare(holdNr4, currentGuess.getGuess1())) {
				correctNumber++;
			}
			countGuess++;

			System.out.println(correctPosition + " numbers are in the correct position plus " + correctNumber
					+ " numbers are guessed correctly, yet in the wrong position.");
			System.out.println("Well done for guess Nr. " + countGuess + "! You may guess again.");
		}

		System.out.println("Full hit: I had chosen the numbers " + holdNr1 + "," + holdNr2 + "," + holdNr3 + ","
				+ holdNr4 + "! You have won this game with " + countGuess + " Guesses.");

		/*
		 * int nTest = 1; while (nTest <= 1000) { NumbersToGuess numbers = new
		 * NumbersToGuess(); nTest ++; System.out.println(numbers.getNr1() + " " +
		 * numbers.getNr2() + " " + numbers.getNr3() + " " + numbers.getNr4()); }
		 */
	}
}
