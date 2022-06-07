package com.sang;

import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

public class Lambda03 {
    public static void main(String[] args) {

        intPredicateNum(value -> value % 2 == 0);
    }

    public static void intPredicateNum(IntPredicate intPredicate) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : arr) {
            if (intPredicate.test(i)) {
                System.out.println(i);
            }
        }
    }
}
