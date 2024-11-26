package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {
    private static final Calculator calculator = new Calculator();
    @Test
    public void test() {

        assertEquals(5, calculator.add(2, 3));
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(2, calculator.divide(6, 3));
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(6, 0));
    }

}