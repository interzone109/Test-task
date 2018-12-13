package test.task02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import task02.Factorial;

public class FactorialTest {
	@Test
	public void factorialNegative() {

		int numb = -43242;
		int actual = Factorial.reverseFactorial(numb);
		int expected = 0;

		assertEquals(expected, actual);
	}

	@Test
	public void factorial_0() {

		int numb = 0;
		int actual = Factorial.reverseFactorial(numb);

		int expected = 1;

		assertEquals(expected, actual);
	}

	@Test
	public void factorial_1() {

		int numb = 1;
		int actual = Factorial.reverseFactorial(numb);

		int expected = 1;

		assertEquals(expected, actual);
	}

	@Test
	public void factorial_2() {

		int numb = 2;
		int actual = Factorial.reverseFactorial(numb);

		int expected = 2;

		assertEquals(expected, actual);
	}

	@Test
	public void factorial_6() {

		int numb = 6;
		int actual = Factorial.reverseFactorial(numb);

		int expected = 3;

		assertEquals(expected, actual);
	}

	@Test
	public void factorial_24() {

		int numb = 24;
		int actual = Factorial.reverseFactorial(numb);

		int expected = 4;

		assertEquals(expected, actual);
	}

	@Test
	public void factorial_120() {

		int numb = 120;
		int actual = Factorial.reverseFactorial(numb);

		int expected = 5;

		assertEquals(expected, actual);
	}

	@Test
	public void factorial_720() {

		int numb = 720;
		int actual = Factorial.reverseFactorial(numb);

		int expected = 6;

		assertEquals(expected, actual);
	}

	@Test
	public void factorial_5040() {

		int numb = 5040;
		int actual = Factorial.reverseFactorial(numb);

		int expected = 7;

		assertEquals(expected, actual);
	}

}
