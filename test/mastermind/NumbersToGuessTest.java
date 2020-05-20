package mastermind;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class NumbersToGuessTest {

	@Test
	public void testNewNumbers() {
		final NumbersToGuess n = new NumbersToGuess();
		for (int i = 0; i < 4; i++) {
			assertTrue(n.getNr(0) >= 1 && n.getNr(0) <= 6);
		}
		for (int i = 0; i < 4; i++) {
			if (i < 3) {
				for (int j = i + 1; j < 4; j++) {
					assertTrue(n.getNr(i) != n.getNr(j));
				}
			}
		}
	}

	@Test
	public void testNewNumbersStatisticalQuality() {
		List<NumbersToGuess> numbersList = new ArrayList<NumbersToGuess>();
		for (int i = 0; i < 10000; i++) {
			numbersList.add(new NumbersToGuess());
		}
		int potentialCollisionsCount = 0;
		int collisionsCount = 0;
		for (int i = 0; i < 10000; i++) {
			if (i < 9999) {
				for (int j = i + 1; j < 10000; j++) {
					potentialCollisionsCount++;
					if (numbersList.get(i).equals(numbersList.get(j)))
					{
						collisionsCount++;
					}
				}
			}
		}
		assertTrue((double) collisionsCount / potentialCollisionsCount < 0.003);
		int[] numberStatistics = new int[4];
		for (int i = 0; i < 10000; i++) {
			NumbersToGuess numbers = new NumbersToGuess();
			for (int j = 0; j < 4; j++)
			{
				numberStatistics[j] += numbers.getNr(j);
			}
		}
		for (int i = 0; i < 4; i++)
		{
			assertEquals(1.0, numberStatistics[i] / 35000.0, 0.01);
		}
	}
}
