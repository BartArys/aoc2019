import aoc.nineteen.Day;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Application {

    private static IntStream lines = Day.getLines().mapToInt(Integer::parseInt);

    private static IntUnaryOperator calculateFuelCost = it -> (it / 3) - 2;
    private static IntUnaryOperator calculateFuelCostForFuel = it ->
            it + IntStream.iterate(calculateFuelCost.applyAsInt(it), (x) -> x > 0, calculateFuelCost).sum();

    public static int part1() {
        return lines.map(calculateFuelCost).sum();
    }

    public static int part2() {
        return lines.map(calculateFuelCost).map(calculateFuelCostForFuel).sum();
    }

    public static void main(String[] args) {
        System.out.println(part1());
        System.out.println(part2());
    }

}