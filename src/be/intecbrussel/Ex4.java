package be.intecbrussel;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Maak een stream die de som gaat bereken van alle integer in de array,
 * behalve de eerste 2 integers.
 */
public class Ex4 {

    public static void main(String[] args) {

        Integer[] numbers = {3, 9, 5, 0, 13, 7, 11, 4, 8, 6};

        method4(numbers);
    }

    // gets sum of elements of the array except first two elements
    private static void method4(Integer[] numbers) {

        int[] ints = convertIntegerArrToIntArr(numbers);

        // reverses elements of the int[] array,
        int[] reversedArr= IntStream
                           .rangeClosed(1, ints.length)
                           .map(i -> ints[ints.length - i])
                           .toArray();

        // gets sum of elements of the array except last two elements
        int result = Arrays.stream(reversedArr)
                    .limit(ints.length - 2)
                    .sum();

        System.out.println(result);
    }

    // converts Integer[] array to int[] array
    private static int[] convertIntegerArrToIntArr(Integer[] numbers) {

        return Stream.of(numbers).mapToInt(n -> n).toArray();
    }
}
