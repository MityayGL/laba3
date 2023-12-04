package org.example;

public class Main {
    public static void main(String[] args) {

        long factorialRecursionResult = Factorial.recursion(5);
        long factorialCycleResult = Factorial.cycle(5);

        assert factorialRecursionResult == factorialCycleResult : "Factorial: Different values";
        System.out.println("Factorial of 5: " + factorialRecursionResult);

        long fibonacciRecursionResult = Fibonacci.recursion(10);
        long fibonacciCycleResult = Fibonacci.cycle(10);

        assert fibonacciRecursionResult == fibonacciCycleResult : "Fibonacci: Different values";
        System.out.println("Fibonacci of 10: " + fibonacciRecursionResult);


        System.out.println("Sum of digits 9765: " + SumOfDigits.execute(9765));

        assert SumWithoutOperator.execute(56, 14) == 56 + 14 : "Sum: Different values";
        System.out.println("56 + 14 = " +  (56 + 14));

    }
}