package be.intecbrussel;

import java.util.stream.Stream;

/**
 * Maak een stream die de eerste twee strings in hoofdletter gaat plaatsen en
 * dan de 2 strings gaat combineren naar 1 strings.
 */
public class Ex3 {

    public static void main(String[] args) {

        String[] greetings = {"Hello", "World", "Merhaba", "Hallo", "Salut"};

        method3(greetings);
    }

    private static void method3(String[] greetings) {
        String str = Stream.of(greetings).map(s -> s.toUpperCase()).limit(2).reduce("", (s, s2) -> s + s2);
        System.out.println(str);
    }
}
