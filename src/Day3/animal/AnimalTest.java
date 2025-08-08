package Day3.animal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    @Test
    public void testDogSound() {
        Animal dog = new Dog();
        String sound = dog.makeNoise();
        assertEquals("woof woof", sound);
    }

    @Test
    public void testCatSound() {
        Animal cat = new Cat();
        String sound = cat.makeNoise();
        assertEquals("meeow", sound);
    }

    @Test
    public void testAnimalPolymorphism() {
        Animal[] animals = { new Dog(), new Cat() };

        String[] expected = { "woof woof", "meeow", "meeow" };

        for (int i = 0; i < animals.length; i++) {
            assertEquals(expected[i], animals[i].makeNoise());
        }
    }
}
