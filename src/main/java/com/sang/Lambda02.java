package com.sang;

import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

public class Lambda02 {
    public static void main(String[] args) {
        // 匿名内部类启动线程 启动条件 原则：如果这个匿名内部类是一个接口 并且里面只有一个抽象方法需要重写
        new Thread(() -> System.out.println("新线程中的run方法被执行了~~~~ ")).start();

        int i = calculateNum((left, right) -> left + right);
        System.out.println(i);
    }


    public static int calculateNum (IntBinaryOperator operator){
        int a  = 10;
        int b  = 20;
        return operator.applyAsInt(a,b);
    }

    public static void intPredicateNum (IntPredicate intPredicate){
        int [] arr  = {1,2,3,4,5,6,7,8,9};
        for (int i : arr) {
            if(intPredicate.test(i)){
                System.out.println(i);
            }
        }
    }
}
