package org.example.lambda.basic;

public class Calculator {

    public static void main(String[] args) {

        Sum obj = (a, b) -> System.out.println("Sum:" + (a+b));
        obj.sum(10, 14);
    }
}
