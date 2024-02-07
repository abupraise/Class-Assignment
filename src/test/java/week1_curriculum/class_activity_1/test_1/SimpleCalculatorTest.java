package week1_curriculum.class_activity_1.test_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void add() {
        SimpleCalculator calculate = new SimpleCalculator();
        int actual = calculate.add(2,5);
        int expected = 7;
        assertEquals(actual, expected);
    }
    @Test
    void multiplication() {
        SimpleCalculator calculate = new SimpleCalculator();
        int actual = calculate.multiplication(2,5);
        int expected = 10;
        assertEquals(actual, expected);
    }
}