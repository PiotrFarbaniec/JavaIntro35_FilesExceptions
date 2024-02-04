package org.task7;

public class Task7 {
    public static void main(String[] args) {
        MathOperation operation1 = new MathOperation(10.2);
        MathOperation operation2 = new MathOperation(-2);
        System.out.println(operation1.calculateSquareRoot());
        System.out.println(operation2.calculateSquareRoot());
    }
}