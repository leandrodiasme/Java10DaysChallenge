package Day1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    public void dogMakesCorrectNoise(){
        Animal dog = new Dog();
        assertEquals("woof woof", dog.makeNoise());
    }
}