package com.jithu.samples;

/**
 * Created by Jithu on 29-Mar-17.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(new PrimeNumber().isPrime(151));

    }

    private boolean isPrime(int n) {
        for (int x = 2; x * x <= n; x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }
}
