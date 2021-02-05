package ww_functional;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Calculator {

    public static void main(String[] args) {

        // full example of anonymous class
        BiFunction<Double, Double, Double> addition = new BiFunction<>() {
            @Override
            public Double apply(Double a, Double b) {
                return a + b;
            }
        };

        BiFunction<Double, Double, Double> subtraction = (a, b) -> {
            return a - b;
        };

        // short hand lambda notation
        BiFunction<Double, Double, Double> division = (a, b) -> a / b;


        calculate(addition);
        calculate(division);


        // function composition
        calculate(addition.andThen(x -> x * 2));

        // method reference
        BiFunction<Double, Double, Double> max = Double::max;
        calculate(Double::max);
        // calculate(max);

        Double x = 1.0;
        Function<Double, Integer> cmp = x::compareTo;
        // Note the difference
        BiFunction<Double, Double, Integer> cmp2 = Double::compareTo;


    }

    /**
     * Perform arithmetic operation on two doubles read from input.
     */
    public static void calculate(BiFunction<Double, Double, Double> f) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input two numbers:");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        Double result = f.apply(a, b);

        System.out.println("The result is: " + result);

    }

}
