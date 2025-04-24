package io.github.cidverse.test.java.library.gradle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);

        assertEquals(5, result, "Expected 2 + 3 to equal 5");
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);

        assertEquals(2, result, "Expected 5 - 3 to equal 2");
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(4, 3);

        assertEquals(12, result, "Expected 4 * 3 to equal 12");
    }
}
