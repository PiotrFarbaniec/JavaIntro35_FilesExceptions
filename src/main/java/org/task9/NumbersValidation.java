package org.task9;

import java.util.Arrays;

public class NumbersValidation {

    public void numbersValidation(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Wrong parameters provided: " + Arrays.toString(values));
        }
        for (int i = 0; i < values.length ; i++) {
            try {
                isDivisible (values[i]);
                System.out.println(isDivisible(values[i]));
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }

    private boolean isDivisible(int value) {
        if (value % 3 != 0) {
            throw new IllegalArgumentException("Value: " + value + " is not divisible by 3");
        }
        return true;
    }
}