package be.intecbrussel;

import java.util.stream.Stream;

/**
 * Maak een stream die elke integer gaat vermenigvuldigen met 5 en die
 * dan afprinten als de integer groter is dan 50
 */
public class Ex1 {
    public static void main(String[] args) {

        Integer[] numbers = {3, 9, 5, 0, 13, 7, 11, 4, 8, 6};

        method1(numbers);
    }

    private static void method1(Integer[] numbers) {
        Stream.of(numbers)
                .map(integer -> integer * 5)
                .filter(integer -> integer > 50)
                .forEach(i -> System.out.print(i + " "));
    }
}
