package com.sang;

import java.util.function.Function;
import java.util.function.IntPredicate;

public class Lambda04 {
    public static void main(String[] args) {
//        Integer integer = functionCover((String s)-> {
//            return Integer.valueOf(s);
//        });
//        System.out.println(integer);

        String s = functionCover(s1 -> s1 + "sangzhonghao");
        System.out.println(s);
    }

    public static <R>R functionCover(Function<String,R> function) {
        String str = "12345";
        R apply = function.apply(str);
        return apply;

    }
}
