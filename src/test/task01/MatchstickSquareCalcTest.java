package test.task01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import task01.MatchstickSquareCalc;

public class MatchstickSquareCalcTest {

	@Test
	public void MatchstickSquareNegative() {
		
		long matchstickQuantity = -43242L;
		long actual = MatchstickSquareCalc.matchstickSquare(matchstickQuantity);
		
		long expected = 0L;
		
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void MatchstickSquare_0() {
		
		long matchstickQuantity = 0L;
		long actual = MatchstickSquareCalc.matchstickSquare(matchstickQuantity);
		
		long expected = 0L;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void MatchstickSquare_1() {
		
		long matchstickQuantity = 1L;
		long actual = MatchstickSquareCalc.matchstickSquare(matchstickQuantity);
		
		long expected = 4L;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void MatchstickSquare_2() {
		
		long matchstickQuantity = 2L;
		long actual = MatchstickSquareCalc.matchstickSquare(matchstickQuantity);
		
		long expected = 7L;
		
		assertEquals(expected, actual);
	}
	@Test
	public void MatchstickSquare_3() {
		
		long matchstickQuantity = 3L;
		long actual = MatchstickSquareCalc.matchstickSquare(matchstickQuantity);
		
		long expected = 10L;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void MatchstickSquare_4() {
		
		long matchstickQuantity = 4L;
		long actual = MatchstickSquareCalc.matchstickSquare(matchstickQuantity);
		
		long expected = 12L;
		
		assertEquals(expected, actual);
	}
	@Test
	public void MatchstickSquare_5() {
		
		long matchstickQuantity = 5L;
		long actual = MatchstickSquareCalc.matchstickSquare(matchstickQuantity);
		
		long expected = 15L;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void MatchstickSquare_6() {
		
		long matchstickQuantity = 6L;
		long actual = MatchstickSquareCalc.matchstickSquare(matchstickQuantity);
		
		long expected = 17L;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void MatchstickSquare_7() {
		
		long matchstickQuantity = 7L;
		long actual = MatchstickSquareCalc.matchstickSquare(matchstickQuantity);
		
		long expected = 20L;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void MatchstickSquare_8() {
		
		long matchstickQuantity = 8L;
		long actual = MatchstickSquareCalc.matchstickSquare(matchstickQuantity);
		
		long expected = 22L;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void MatchstickSquare_60() {
		
		long matchstickQuantity = 60L;
		long actual = MatchstickSquareCalc.matchstickSquare(matchstickQuantity);
		
		long expected = 127L;
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void MatchstickSquare_1_000_000_000() {
		
		long matchstickQuantity = 1_000_000_000L;
		long actual = MatchstickSquareCalc.matchstickSquare(matchstickQuantity);
		
		long expected = 2_000_028_257L;
		
		assertEquals(expected, actual);
	}

}
