package be.intecbrussel;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Maak een Stream die alle strings die kunnen omgezet worden naar integers,
 * gaat omzetten naar integers.
 */
public class Ex_5 {

    public static void main(String[] args) {

        String[] strNumbers = {"3", "2", "5", "9", "8b", "15", "a"};

        method5(strNumbers);
    }

    private static void method5(String[] strNumbers) {
        int[] numbers = Stream.of(strNumbers)
                .filter(s -> convertible(s))
                .mapToInt(value -> Integer.valueOf(value))
                .toArray();

        Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
    }

    private static boolean convertible(String value) {

        for(char c : value.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
}
