package org.task8;

public class DataValidation {
    public boolean isIdNumberEnteredCorrectly(String data) throws WrongTypeOfDataException, IllegalLengthException {
        if (data != null && isContainNumbersOnly(data) && data.length() == 11) {
            return true;
        } else if (data == null || !isContainNumbersOnly(data)) {
            throw new WrongTypeOfDataException("Wrong type or not data provided: " + data);
        } else if (data.length() != 11) {
            throw new IllegalLengthException("Incorrect length of data provided: " + data.length());
        }
        return false;
    }


    private boolean isContainNumbersOnly(String data) {
        String[] prohibited = {
                "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o",
                "p","r","s","t","u","w","x","y","z","v","q",".","?",",","/",
                "\\",";",":","'","[","]","{","}","(",")","=","+","\"","+","-",
                "_","|","*","!","@","#","$","%","^","&","~","`","<",">"," "};

        for (int i = 0; i < prohibited.length; i++) {
            if (data.contains(prohibited[i])) {
                return false;
            }
        }
        return true;
    }
}