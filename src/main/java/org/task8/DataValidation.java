package org.task8;

public class DataValidation {
    public boolean isIdNumberValid(String data) throws WrongTypeOfDataException, IllegalLengthException {
        if (data == null || !isContainNumbersOnly(data)) {
            throw new WrongTypeOfDataException("Wrong type or not data provided: " + data);
        }
        else if (data.length() != 11 || data.contains(" ")) {
            throw new IllegalLengthException("Incorrect length of data provided");
        }
        else return true;
    }

    private boolean isContainNumbersOnly(String data) {
        for (int i = 0; i < data.length(); i++) {
            var sign = data.charAt(i);
            if (!Character.isDigit(sign)) {
                return false;
            }
        }
        return true;
    }
}