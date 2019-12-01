import aoc.nineteen.sequence

val input = sequence.map { it.toInt() }

val Int.fuelCost get() = (this / 3) - 2

fun Int.calculateFuelCostOfFuel() = generateSequence(fuelCost) { it.fuelCost }.takeWhile { it > 0 }.sum()

fun Sequence<Int>.part1() = sumBy { it.fuelCost }
fun Sequence<Int>.part2() = map { it.fuelCost }.sumBy { it + it.calculateFuelCostOfFuel() }

fun main() {
    println(input.part1())
    println(input.part2())
}