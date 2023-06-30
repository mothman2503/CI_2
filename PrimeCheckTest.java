import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    for (int i = 0; i < arr.length; ++i) {
      assertEquals("Test negative number " + arr[i], true, PrimeCheck.isPrime(arr[i]));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    assertEquals("Test 6", false, PrimeCheck.isPrime(6));
    assertEquals("Test 8", false, PrimeCheck.isPrime(8));
    assertEquals("Test 21", false, PrimeCheck.isPrime(21));
  }
}
