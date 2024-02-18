package org.task8;

public class WrongTypeOfDataException extends IllegalArgumentException {

    public WrongTypeOfDataException(String s) {
        super(s);
    }
}