package Day1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void makeNoise() {
        Animal cat = new Cat();
        assertEquals("meeow", cat.makeNoise());
    }
}