package mastermind;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class NumbersToGuessTest {

	@Test
	public void testNewNumbersToGuess_everyNumberIntegerBetween1and6() {
		NumbersToGuess numbers = new NumbersToGuess();
		for (int i = 0; i < 4; i++) {
			assertTrue(numbers.getNr(i) >= 1 && numbers.getNr(i) <= 6);
		}
	}

	@Test
	public void testNewNumbersToGuess_everyNumberIsDistinct() {
		NumbersToGuess numbers = new NumbersToGuess();
		for (int i = 0; i < 4; i++) {
			if (i < 3) {
				for (int j = i + 1; j < 4; j++) {
					assertTrue(numbers.getNr(i) != numbers.getNr(j));
				}
			}
		}
	}

	@Test
	public void testNewNumbersToGuess_equallyDistributedNumbers() {
		int[] numberStatistics = new int[4];
		for (int i = 0; i < 1000000; i++) {
			NumbersToGuess numbers = new NumbersToGuess();
			for (int j = 0; j < 4; j++) {
				numberStatistics[j] += numbers.getNr(j);
			}
		}
		for (int i = 0; i < 4; i++) {
			assertEquals(arithmeticMean(1, 2, 3, 4, 5, 6), numberStatistics[i] / 1000000.0, 0.01);
		}
	}

	@Test
	public void testNewNumbersToGuess_equallyDistributedCombinations() {
		// generate numbers 1 million times
		Map<NumbersToGuess, Integer> numbersMap = new HashMap<NumbersToGuess, Integer>();
		for (int i = 0; i < 1000000; i++) {
			NumbersToGuess numbers = new NumbersToGuess();
			Integer count = numbersMap.get(numbers);
			if (count == null) {
				numbersMap.put(numbers, Integer.valueOf(1));
			} else {
				numbersMap.put(numbers, Integer.valueOf(count + 1));
			}
		}
		// assert that every possible combination has been generated (at least once)
		long possibleCombinationsCount = factorial(6) / factorial(6 - 4);
		assertEquals(possibleCombinationsCount, numbersMap.size());
		// assert that every (possible) combination has been generated between 2500 + 3500 times
		for (Entry<NumbersToGuess, Integer> entry : numbersMap.entrySet()) {
			assertEquals(3000.0, entry.getValue().doubleValue(), 500);
		}
	}

	public double arithmeticMean(int... numbers)
	{
		long sum = 0;
		for (int n : numbers)
		{
			sum += n;
		}
		return sum / (double) numbers.length;
	}

	public long factorial(int number) {
		long result = 1;
		for (int factor = 2; factor <= number; factor++) {
			result *= factor;
		}
		return result;
	}
}
