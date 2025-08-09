package Day4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoxTest {

    @Test
    public void testStringBox(){
        Box<String> box = new Box<>();
        box.setItem("Hello");
        assertEquals("Hello", box.getItem());
    }

    @Test
    public void testPersonBox(){
        Person person = new Person("Helena");
        Box<Person> box = new Box<>();
        box.setItem(person);
        assertEquals("Helena", box.getItem().getName());
    }

}
