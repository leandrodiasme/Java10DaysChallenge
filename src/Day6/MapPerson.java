package Day6;

import java.util.HashMap;
import java.util.Map;

public class MapPerson {
    public static void main(String[] args) {

        Map<String, Integer> person = new HashMap<>();
        person.put("John", 30);
        person.put("Jane", 20);
        person.put("Bob", 40);

        for(Map.Entry<String, Integer> entry : person.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
