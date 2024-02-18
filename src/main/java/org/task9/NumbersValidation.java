package org.task9;

import java.util.Arrays;

public class NumbersValidation {

    public boolean[] areDivisibleBy(int[] values, int divisor) throws IllegalArgumentException {
        if (values == null || divisor == 0) {
            throw new IllegalArgumentException("Wrong parameters provided " + Arrays.toString(values) + " / " + divisor);
        }
        boolean[] isDivisible = new boolean[values.length];
        for (int i = 0; i < values.length ; i++) {
            if (values[i] % divisor != 0) {
                isDivisible[i] = false;
                try {
                    swapCondition(isDivisible[i], values[i], divisor);
                } catch (IllegalArgumentException e){
                    System.err.println(e.getMessage());
                }
            }
            else if (values[i] % divisor == 0) {
                isDivisible[i] = true;
            }
        }
        return isDivisible;
    }


    private void swapCondition(boolean isDivisible, int value, int div) {
        if (!isDivisible) {
            throw new IllegalArgumentException("Value: " + value + " is not divisible by " + div);
        }
    }
}