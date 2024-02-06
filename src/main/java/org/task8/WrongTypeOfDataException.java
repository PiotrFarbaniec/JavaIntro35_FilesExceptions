package org.task8;

public class WrongTypeOfDataException extends IllegalArgumentException {


    public WrongTypeOfDataException(String s) {
        super(s);
    }


    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public synchronized Throwable getCause() {
        return super.getCause();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}