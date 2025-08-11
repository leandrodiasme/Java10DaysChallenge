package Day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mary");
        names.add("Joseph");

        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
