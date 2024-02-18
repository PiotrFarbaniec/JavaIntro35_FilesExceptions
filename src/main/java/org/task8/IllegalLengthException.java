package org.task8;

public class IllegalLengthException extends IndexOutOfBoundsException {

    public IllegalLengthException(String s) {
        super(s);
    }
}