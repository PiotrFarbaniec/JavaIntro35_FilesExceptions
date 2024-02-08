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
                throw new IllegalArgumentException("Value: " + values[i] + " is not divisible by " + divisor);
            }
            else if (values[i] % divisor == 0) {
                isDivisible[i] = true;
            }
        }
        return isDivisible;
    }
}