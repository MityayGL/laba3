package org.example;

public class Fibonacci {
    public static long recursion(int n) {
        if (n <= 1) {
            return n;
        }
        return recursion(n - 1) + recursion(n - 2);
    }

    public static long cycle(int n) {
        if (n <= 1) {
            return n;
        }
        long first = 0, second = 1, result = 0;
        for (int i = 2; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}
