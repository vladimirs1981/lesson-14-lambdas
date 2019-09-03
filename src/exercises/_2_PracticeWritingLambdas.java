package exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.junit.jupiter.api.Test;

class _2_PracticeWritingLambdas {

	/*
	 * Assign lambda expressions to each of the functions below, so that the tests
	 * pass.
	 */

	Function<Integer, Integer> squareLambda = x -> x * x;
	Function<Integer, Integer> INCREMENT_LAMBDA = x -> x + 1;
	Function<String, String> REMOVE_VOWELS_LAMBDA = string -> string.replaceAll("[AaEeIiOoUu]", "");
	Function<Integer, Integer> DOUBLE_LAMBDA = x -> x * 2;
	BiFunction<Integer, Integer, Integer> PYTHAGOREAN_LAMBDA = (x, y) -> (int) Math.sqrt(x * x + y * y);
	Function<Integer, String> EVEN_ODD_LAMBDA = x -> {
		if (x % 2 == 0) {
			return "even";
		} else {
			return "odd";
		}
	};
	Function<Character, Integer> ASCII_LAMBDA = character -> (int) character;
	Function<String, String> CAPITALIZE_LAMBDA = string -> string.substring(0, 1).toUpperCase() + string.substring(1);
	Function<String, String> BLACKOUT_LAMBDA = string -> "#".repeat(string.length());

	@Test
	void testIncrement() {
		List<Integer> inputList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4));
		List<Integer> expectedOutput = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		assertEquals(expectedOutput, LambdaHelper.processList(inputList, INCREMENT_LAMBDA));
	}

	@Test
	void testRemoveVowels() {
		String withVowels = "joonspoon";
		String withoutVowels = LambdaHelper.processString(withVowels, REMOVE_VOWELS_LAMBDA);
		assertEquals("jnspn", withoutVowels);
	}

	@Test
	void testDouble() {
		List<Integer> inputList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4));
		List<Integer> expectedOutput = new ArrayList<Integer>(Arrays.asList(0, 2, 4, 6, 8));
		assertEquals(expectedOutput, LambdaHelper.processList(inputList, DOUBLE_LAMBDA));
	}

	@Test
	void testPythagoras() {
		int sideA = 3;
		int sideB = 4;
		int expectedHypotenuse = 5;
		assertEquals(expectedHypotenuse, LambdaHelper.processBiFunction(sideA, sideB, PYTHAGOREAN_LAMBDA));
	}

	@Test
	void testEvenOdd() {
		assertEquals("odd", LambdaHelper.processFunction(777, EVEN_ODD_LAMBDA));
		assertEquals("even", LambdaHelper.processFunction(44, EVEN_ODD_LAMBDA));
	}

	@Test
	void testAsciiValue() {
		assertEquals(65, LambdaHelper.processCharFunction('A', ASCII_LAMBDA));
		assertEquals(98, LambdaHelper.processCharFunction('b', ASCII_LAMBDA));
		assertEquals(122, LambdaHelper.processCharFunction('z', ASCII_LAMBDA));
	}

	@Test
	void testCapitalize() {
		assertEquals("Picard", LambdaHelper.processString("picard", CAPITALIZE_LAMBDA));
		assertEquals("Spock", LambdaHelper.processString("spock", CAPITALIZE_LAMBDA));
	}

	@Test
	void testBlackout() {
		assertEquals("####", LambdaHelper.processString("shit", BLACKOUT_LAMBDA));
		assertEquals("############", LambdaHelper.processString("motherfucker", BLACKOUT_LAMBDA));

	}
}
