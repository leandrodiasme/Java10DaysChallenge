package Day5;

import java.util.HashSet;
import java.util.Set;

public class SetInt {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(20); // repetido
        numeros.add(10); // repetido

        System.out.println(numeros);

    }

}

