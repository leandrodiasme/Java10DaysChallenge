package Day2.test;

import Day2.Addition;
import Day2.MathOperation;
import Day2.Multiplication;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationTest {

    @Test
    void testAdd() {
        MathOperation mathOperation = new Addition();
        assertEquals(10.0, mathOperation.execute(5,5));
    }

    @Test
    void testMultiply() {
        MathOperation mathOperation = new Multiplication();
        assertEquals(25.0, mathOperation.execute(5,5));
    }

}