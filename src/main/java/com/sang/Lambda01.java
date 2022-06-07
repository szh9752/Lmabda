package com.sang;

public class Lambda01 {
    public static void main(String[] args) {
        /**
         * 匿名内部类启动线程
         *
         */
        // 匿名内部类启动线程 启动条件 原则：如果这个匿名内部类是一个接口 并且里面只有一个抽象方法需要重写
        new Thread(() -> System.out.println("新线程中的run方法被执行了~~~~ ")).start();

        // 匿名内部类启动线程 启动条件 原则：如果这个匿名内部类是一个接口 并且里面只有一个抽象方法需要重写
        new Thread(() -> {
            System.out.println("新线程中的run方法被执行了~~~~ ");
        }).start();
    }
}
