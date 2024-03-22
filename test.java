//Marina Girgis (40168639)
import org.junit.Test;
import static org.junit.Assert.*;

public class test {

    // Test cases for Predicate Coverage
    @Test
    public void testPredicateCoverage() {
        assertTrue(checkItPredicateCoverage(true, true, true));
        assertTrue(checkItPredicateCoverage(true, true, false));
        assertTrue(checkItPredicateCoverage(true, false, true));
        assertTrue(checkItPredicateCoverage(true, false, false));
        assertTrue(checkItPredicateCoverage(false, true, true));
        assertFalse(checkItPredicateCoverage(false, false, false));
    }

    // Test cases for Clause Coverage
    @Test
    public void testClauseCoverage() {
        assertTrue(checkItClauseCoverage(true, true, true));
        assertTrue(checkItClauseCoverage(true, true, false));
        assertTrue(checkItClauseCoverage(true, false, true));
        assertFalse(checkItClauseCoverage(true, false, false));
        assertTrue(checkItClauseCoverage(false, true, true));
        assertFalse(checkItClauseCoverage(false, false, false));
    }

    // Test cases for CACC (Conditional-Branch Coverage)
    @Test
    public void testCACC() {
        assertTrue(checkItCACC(true, true, true));
        assertTrue(checkItCACC(true, true, false));
        assertTrue(checkItCACC(true, false, true));
        assertFalse(checkItCACC(true, false, false));
        assertTrue(checkItCACC(false, true, true));
        assertFalse(checkItCACC(false, false, true));
    }

    // Test cases for RACC (Multiple Condition Coverage)
    @Test
    public void testRACC() {
        assertTrue(checkItRACC(true, true, true));
        assertTrue(checkItRACC(true, true, false));
        assertTrue(checkItRACC(true, false, true));
        assertFalse(checkItRACC(true, false, false));
        assertTrue(checkItRACC(false, true, true));
        assertFalse(checkItRACC(false, false, true));
    }

    // Helper method to call checkIt and return the result for Predicate Coverage
    private boolean checkItPredicateCoverage(boolean a, boolean b, boolean c) {
        return checkIt(a, b, c);
    }

    // Helper method to call checkIt and return the result for Clause Coverage
    private boolean checkItClauseCoverage(boolean a, boolean b, boolean c) {
        return checkIt(a, b, c);
    }

    // Helper method to call checkIt and return the result for CACC (Conditional-Branch Coverage)
    private boolean checkItCACC(boolean a, boolean b, boolean c) {
        return checkIt(a, b, c);
    }

    // Helper method to call checkIt and return the result for RACC (Multiple Condition Coverage)
    private boolean checkItRACC(boolean a, boolean b, boolean c) {
        return checkIt(a, b, c);
    }

    // Actual checkIt method to be tested
    private boolean checkIt(boolean a, boolean b, boolean c) {
        if (a || (b && c)) {
            System.out.println("P is true");
            return true;
        } else {
            System.out.println("P isn't true");
            return false;
        }
    }
}
