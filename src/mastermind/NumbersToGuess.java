package mastermind;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NumbersToGuess {

	private final int[] numbers = new int[4];

	private final List<Integer> pot = new LinkedList<Integer>(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6 }));

	public NumbersToGuess() {
		for (int i = 0; i < 4; i++) {
			numbers[i] = drawNumberFromPot();
		}
	}

	private int drawNumberFromPot() {
		final int position = (int) (Math.random() * pot.size());
		final int drawn = pot.get(position);
		pot.remove(position);
		return drawn;
	}

	@Override
	public String toString() {
		return String.format("(%s|%s|%s|%s)", numbers[0], numbers[1], numbers[2], numbers[3]);
	}

	@Override
	public int hashCode() {
		int ten = 1;
		int result = 0;
		for (int i = 0; i < 4; i++) {
			result += ten * numbers[i];
			ten *= 10;
		}
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final NumbersToGuess other = (NumbersToGuess) obj;
		for (int i = 0; i < 4; i++) {
			if (numbers[i] != other.numbers[i]) {
				return false;
			}
		}
		return true;
	}

	public int getNr(final int i) {
		return numbers[i];
	}
}
