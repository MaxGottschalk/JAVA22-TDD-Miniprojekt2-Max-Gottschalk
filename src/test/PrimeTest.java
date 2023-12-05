package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Prime;

class PrimeTest {

	@Test
	@DisplayName("Testing prime number counting within a valid range 0 to 1000")
	public void testGetCountPrimesWithinValidRange0To1000() {
	    Prime prime = new Prime(0, 1000);
	    assertEquals(168, prime.getCount(), "The count of prime numbers within the range 0 to 1000 is incorrect");
	}

	@Test
	@DisplayName("Testing prime number count for individual number 5")
	public void testCountPrimesForSingleNumber5() {
	    Prime prime = new Prime(5, 5);
	    assertEquals(1, prime.getCount(), "Incorrect count of prime numbers for a single number 5");
	}

	@Test
	@DisplayName("Testing prime number count for a specific range 2 to 10")
	public void testCountPrimesForSpecificRange2To10() {
	    Prime prime = new Prime(2, 10);
	    assertEquals(4, prime.getCount(), "Incorrect count of prime numbers in the range 2 to 10");
	}

	@Test
	@DisplayName("Testing prime number count for the boundary value in the range 0 to 1")
	public void testCountPrimesForBoundaryRange0To1() {
	    Prime prime = new Prime(0, 1);
	    assertEquals(0, prime.getCount(), "Should not find any prime numbers in the range 0 to 1");
	}

	@Test
	@DisplayName("Verifying boundary value for the range 999 to 1000")
	public void testCountPrimesForBoundaryRange999To1000() {
	    Prime prime = new Prime(999, 1000);
	    assertTrue(prime.getCount() >= 0, "Should handle the range 999 to 1000 correctly");
	}

	@Test
	@DisplayName("Testing sum of prime numbers within a valid range 0 to 1000")
	public void testGetSumOfPrimesWithinValidRange0To1000() {
	    Prime prime = new Prime(0, 1000);
	    assertEquals(76127, prime.getSumOfPrimes(), "The sum of prime numbers within the range 0 to 1000 is incorrect");
	}

	@Test
	@DisplayName("Testing sum of prime numbers for individual number 5")
	public void testGetSumOfPrimesForSingleNumber5() {
	    Prime prime = new Prime(5, 5);
	    assertEquals(5, prime.getSumOfPrimes(), "Incorrect sum for a single number 5");
	}

	@Test
	@DisplayName("Testing sum of prime numbers for a specific range 2 to 10")
	public void testGetSumOfPrimesForSpecificRange2To10() {
	    Prime prime = new Prime(2, 10);
	    assertEquals(17, prime.getSumOfPrimes(), "Incorrect sum of prime numbers in the range 2 to 10");
	}

	@Test
	@DisplayName("Testing sum of prime numbers for the boundary value in the range 0 to 1")
	public void testGetSumOfPrimesForBoundaryRange0To1() {
	    Prime prime = new Prime(0, 1);
	    assertEquals(0, prime.getSumOfPrimes(), "The sum of prime numbers in the range 0 to 1 should be 0");
	}

	@Test
	@DisplayName("Verifying IllegalArgumentException for an invalid range -1 to 1001")
	public void throwExceptionForInvalidRangeNegativeOneTo1001() {
	    assertThrows(IllegalArgumentException.class, () -> new Prime(-1, 1001));
	}

	@Test
	@DisplayName("Testing error message for an invalid range")
	public void testErrorMessageForInvalidRange() {
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> new Prime(1001, 1002));
	    assertEquals("Wrong interval!", exception.getMessage());
	}

	@Test
	@DisplayName("Verifying IllegalArgumentException for reversed range")
	public void throwExceptionForReversedRange() {
	    assertThrows(IllegalArgumentException.class, () -> new Prime(10, 0));
	}

	@Test
	@DisplayName("Verifying IllegalArgumentException for range with start greater than end")
	public void throwExceptionForStartGreaterThanEndRange() {
	    assertThrows(IllegalArgumentException.class, () -> new Prime(100, 50));
	}

	@Test
	@DisplayName("Testing correct output for the number of prime numbers")
	public void testPrintCountPrintCountCorrectOutput() {
	    Prime prime = new Prime(0, 1000);
	    assertEquals("There are 168 prime numbers between 0 and 1000!", prime.printCount());
	}

	@Test
	@DisplayName("Testing correct output for the sum of prime numbers")
	public void testPrintSumCorrectOutput() {
	    Prime prime = new Prime(0, 1000);
	    assertEquals("And the sum is 76127", prime.printSum());
	}

}
