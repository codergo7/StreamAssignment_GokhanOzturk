package be.intecbrussel;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Maak een Stream die alle strings die kunnen omgezet worden naar integers,
 * gaat omzetten naar integers.
 */
public class Ex_5 {

    public static void main(String[] args) {

        String[] strNumbers = {"3", "2", "5", "9", "8", "15", "a"};

        method5(strNumbers);
    }

    private static void method5(String[] strNumbers) {
        int[] numbers = Stream.of(strNumbers).mapToInt(value -> convertStringToInt(value)).toArray();

        Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
    }

    private static int convertStringToInt(String value) {
        int result = 0;
       /* try {
            result = Integer.parseInt(value);
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }

        */
        return Integer.parseInt(value);
    }
}
