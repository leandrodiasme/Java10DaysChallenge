package Day7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testDivideSuccess() throws CustomException{
        Calculator calc = new Calculator();
        assertEquals(7, calc.divide(14, 2));
    }

    @Test
    public void testDivideFailure(){
        Calculator calc = new Calculator();
        Exception exception = assertThrows(CustomException.class, () -> {
            calc.divide(14, 0);
        });

        assertEquals("Division by zero is not allowed, sweet", exception.getMessage());
    }

}