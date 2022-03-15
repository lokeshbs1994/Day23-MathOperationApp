package com.bridgeLabz;

@FunctionalInterface
interface IMathFunction {
    int calculate(int a, int b);

    static void printResult(int a, int b, String function, IMathFunction fobj) {
        System.out.println("Result of " + function + " is " + fobj.calculate(a, b));
    }
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

        // passing Lambda Expression as Function parameter to print result using static function
        IMathFunction.printResult(6, 3, "Addition", add);
        IMathFunction.printResult(6, 3, "Subtraction", subtract);
        IMathFunction.printResult(6, 3, "Multiplication", multiply);
        IMathFunction.printResult(6, 3, "Division", divide);
    }
}
