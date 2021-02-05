package ww_functional;

import java.util.function.BiFunction;

@FunctionalInterface
public interface ArithmeticOperation extends BiFunction<Double, Double, Double> {
}
