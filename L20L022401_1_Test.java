import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

public class L20L022401_1_Test {
    @Test
    public void testInteger() {
        Solution1 solution = new Solution1();
        assertEquals("2", solution.fractionToDecimal(6, 3));
    }

    @Test
    public void testDecimal() {
        Solution1 solution = new Solution1();
        assertEquals("1.5", solution.fractionToDecimal(3, 2));
    }

    @Test
    public void testNegativeDecimal() {
        Solution1 solution = new Solution1();
        assertEquals("-1.5", solution.fractionToDecimal(-3, 2));
    }

    @Test
    public void testRepeatingDecimal() {
        Solution1 solution = new Solution1();
        assertEquals("0.(3)", solution.fractionToDecimal(1, 3));
    }

    @Test
    public void testZeroNumerator() {
        Solution1 solution = new Solution1();
        assertEquals("0", solution.fractionToDecimal(0, 2));
    }

    @Test
    public void testMaxDenominator() {
        Solution1 solution = new Solution1();
        assertEquals("0.0000000004656613", solution.fractionToDecimal(1, Integer.MAX_VALUE));
    }
}
