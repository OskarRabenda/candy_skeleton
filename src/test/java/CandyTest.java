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
public void testDivideExampleBothNegative(){
    check(-1, -15, false);
}

@Test 
public void testDivideExampleNegativeKids(){
    check(-2,16, false);
}

@Test 
public void testDivideExampleNegativeCandies(){
    check(2,-16, false);
}

@Test 
public void testDivideExampleDivisionOver0(){
    check(0,16, false);
}

@Test 
public void testDivideExampleDivisionBoth0(){
    check(0,0, false);
}

@Test 
public void testDivideExampleDivisionOver0Candies(){
    check(7,0, true);
}

//# END TODO

}
