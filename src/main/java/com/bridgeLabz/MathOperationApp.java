package com.bridgeLabz;

@FunctionalInterface
interface IMathFunction {
    int calculate(int a, int b);
}

public class MathOperationApp {
    public static void main(String[] args) {
        //Using Method Reference Instead of lambda expression
        //This expression implements IMath functional interface
        IMathFunction add = Integer::sum;

        //Lambda expression for multiplication & division for two parameters
        // This expression implements 'IMathFunction'
        IMathFunction subtract = (x, y) -> x - y;
        IMathFunction multiply = (x, y) -> x * y;
        IMathFunction divide = (int x, int y) -> x / y;

        //Add & Multiply two numbers using lambda expression
        System.out.println("Addition is " + add.calculate(6, 3));
        System.out.println("Subtraction is " + subtract.calculate(6, 3));
        System.out.println("Multiplication is " + multiply.calculate(6, 3));
        System.out.println("Division is " + divide.calculate(6, 3));

    }
}
