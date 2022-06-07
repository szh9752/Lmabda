package com.sang;

import java.util.function.IntConsumer;

public class Lambda05 {
    public static void main(String[] args) {
        foreachArr((int value) -> {
            System.out.println(value);
        });
    }

    public static void foreachArr(IntConsumer consumer) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i : arr) {
            consumer.accept(i);
        }
    }


}
