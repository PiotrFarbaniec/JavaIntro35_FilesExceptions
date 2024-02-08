package org.task8;

public class MainClass {

    static DataValidation validation = new DataValidation();

    public static void main(String[] args) {
        try {
            System.out.println(validation.isIdNumberValid("87082623446"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println(validation.isIdNumberValid("87082/23446"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}