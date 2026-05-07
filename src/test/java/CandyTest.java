import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 *
<!--//# BEGIN TODO: Name, student ID, and date-->
<p><b>Oskar Rabenda, 2332159, 7.05.2026</b></p>
<!--//# END TODO-->
 */
public class CandyTest {

    static final Candy SUT = null; // to simplify method calls

    static final long MAX_VALUE = 999999999999999999L;

    /**
     * Checks the result of SUT.divide(k, c).
     */
    private void check(long k, long c, boolean expected) {
        System.out.println("divide(" + k + ", " + c + ")");
        long result = SUT.divide(k, c);
        System.out.println("  result = " + result);
        assertEquals(expected, 0 <= result, "possible (0 <= result)");
        if (0 <= result) {
            assertTrue(result <= MAX_VALUE, "range (result <= MAX_VALUE)");
            assertEquals(result * k, c, "quotient (result * k == c)");
        }
    }

    // Test cases

    /** The given example. */
    @Test
    public void testDivideGivenExample() {
        check(3, 15, true);
    }

//# BEGIN TODO: Additional test cases
    
    @Test
    public void testDivideExactlySmall(){
        check(3, 9, true);
    }

    @Test
    public void testDivideExactlyLargeNumbers(){
        check(5, 25, true);
    }

    @Test
    public void testDivideOneKid(){
        check(1, 7, true);
    }

    @Test
    public void testDivideEqualKidsAndCandies(){
        check(5, 5, true);
    }

    @Test
    public void testDivideCandiesMoreThanKids(){
        check(4, 16, true);
    }

    @Test
    public void testDivideZeroCandies(){
        check(7, 0, true);
    }

    @Test
    public void testDivideZeroBoth(){
        check(0, 0, true); // 0 == 0*0, postcondition requires returning 0
    }

    @Test
    public void testDivideMaxValueExact(){
        check(1L, 999999999999999999L, true);
    }

    @Test
    public void testDivideMaxValueBothEqual(){
        check(999999999999999999L, 999999999999999999L, true);
    }

    @Test
    public void testDivideWithRemainder(){
        check(3, 10, false);
    }

    @Test
    public void testDivideWithRemainderOdd(){
        check(4, 7, false);
    }

    @Test
    public void testDivideMoreKidsThanCandies(){
        check(10, 3, false);
    }

    @Test
    public void testDivideZeroKidsPositiveCandies(){
        check(0, 16, false); 
    }

//# END TODO

}
