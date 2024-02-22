package org.task9;

public class MainClass {
    static int[] values = {3, 6, 9, 11, 12, 13, 15};
    static NumbersValidation validate = new NumbersValidation();
    public static void main(String[] args) {
        validate.numbersValidation(values);
    }
}
