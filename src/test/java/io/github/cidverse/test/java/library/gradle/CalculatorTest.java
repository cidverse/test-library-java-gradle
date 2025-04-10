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
}
