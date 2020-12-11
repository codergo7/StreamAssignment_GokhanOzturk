package be.intecbrussel;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Maak een stream die elke integer in de array gaat delen door 2
 * en vang de nieuwe stream op in een nieuwe array
 */
public class Ex2 {

    public static void main(String[] args) {

        Integer[] numbers = {3, 9, 5, 0, 13, 7, 11, 4, 8, 6};

        method2(numbers);
    }

    private static void method2(Integer[] numbers) {
        Integer[] newList = Stream.of(numbers).map(n ->n/2 ).toArray(size->new Integer[size]);

        Stream.of(newList).forEach(n-> System.out.print(n + " "));
        //System.out.println(Arrays.asList(newList));
    }
}
