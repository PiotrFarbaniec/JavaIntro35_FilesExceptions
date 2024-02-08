package org.task9;

import java.util.Arrays;

public class MainClass {
    static int[] values = {3, 6, 9, 11, 15};
    static int divisor = 3;
    static NumbersValidation validate = new NumbersValidation();
    public static void main(String[] args) {
        try {
            boolean[] isDivisible = validate.areDivisibleBy(values, divisor);
            System.out.println(Arrays.toString(isDivisible));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
