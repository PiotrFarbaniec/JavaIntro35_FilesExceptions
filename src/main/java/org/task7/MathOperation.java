package org.task7;

public class MathOperation {
    private double value;
    private double result;
    public MathOperation(double value) {
        this.value = value;
    }

    public double calculateSquareRoot() throws IllegalArgumentException {
        if (value >= 0) {
            result = Math.sqrt(value);
        } else if (value < 0) {
            throw new IllegalArgumentException("Wrong value provided: " + value);
        }
        return result;
    }
}